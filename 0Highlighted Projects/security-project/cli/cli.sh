#!/bin/bash

API_BASE_URL="${API_BASE_URL:-https://ses-drive.io/api}"
TOKEN_FILE="/tmp/ses_token"
CWD_FILE="/tmp/ses_cwd"
PARENT_CWD_FILE="/tmp/ses_parent_cwd"
SHARED_FLAG_FILE="/tmp/ses_shared_flag"
DEFAULT_CWD="/"

# Color codes
BLUE='\033[1;34m'
RESET='\033[0m'
GREEN='\033[1;32m'
RED='\033[1;31m'

# Shared flag
set_shared_flag() {
  echo "$1" > "$SHARED_FLAG_FILE"
}
get_shared_flag() {
  if [ -f "$SHARED_FLAG_FILE" ]; then
    cat "$SHARED_FLAG_FILE"
  else
    echo "0"
  fi
}

# Read token from file
get_token() {
  if [ -f "$TOKEN_FILE" ]; then
    cat "$TOKEN_FILE"
  else
    echo ""
  fi
}

# Save token to file
save_token() {
  echo "$1" > "$TOKEN_FILE"
}

# Get current working dir (in container memory)
get_cwd() {
  if [ -f "$CWD_FILE" ]; then
    cat "$CWD_FILE"
  else
    echo "$DEFAULT_CWD"
  fi
}

# Set working dir
set_cwd() {
  echo "$1" > "$CWD_FILE"
}

get_parent_cwd() {
  if [ -f "$PARENT_CWD_FILE" ]; then
    cat "$PARENT_CWD_FILE"
  else
    echo "/"
  fi
}

set_parent_cwd() {
  echo "$1" > "$PARENT_CWD_FILE"
}

# COMMAND: ses login
ses_login() {
  python3 /google_login.py

  token=$(get_token)
  url="$API_BASE_URL/auth/login"
  payload=$(jq -n --arg credential "$token" '{credential: $credential}')
  curl -k -c /tmp/ses_cookies -X POST "$url" \
    -H "Content-Type: application/json" \
    -d "$payload"

}

ensure_logged_in() {
  if [ ! -f "$TOKEN_FILE" ] || [ -z "$(cat "$TOKEN_FILE")" ]; then
    echo "You must login first. Run: ses login"
    exit 1
  fi
}


ses_token() {
  if [ -f "$TOKEN_FILE" ]; then
    cat "$TOKEN_FILE"
    echo
  else
    echo "No token found. Please run 'ses login' first."
  fi
}

ses_cookie() {
  if [ -f "/tmp/ses_cookies" ]; then
    cat /tmp/ses_cookies
    echo
  else
    echo "No cookie found. Please run 'ses login' first."
  fi
}

# COMMAND: ses cd
ses_cd() {
  dir_name="$1"
  IS_SHARED=$(get_shared_flag)
  if [ "$dir_name" == "/" ]; then
    set_cwd "/"
    set_shared_flag 0
    set_parent_cwd "/"
    refresh_listing
    echo "Changed directory to /"
    return
  fi
  if [ "$dir_name" == "s/" ]; then
    set_cwd "s/"
    set_shared_flag 1
    set_parent_cwd "/"
    refresh_listing
    echo "Changed directory to s/"
    return
  fi

  # Handle cd ..
  if [ "$dir_name" == ".." ]; then
    parent=$(get_parent_cwd)
    if [ "$IS_SHARED" = "1" ]; then
      # If already at "s/" or can't go further up, stay at s/
      cwd=$(get_cwd)
      if [ "$cwd" == "s/" ]; then
        echo "Already at shared root."
        return
      fi
      # Try to get parentId, but if fails, set to s/
      token=$(get_token)
      url="$API_BASE_URL/directories/shared/$cwd"
      response=$(curl -k -s -b /tmp/ses_cookies "$url")
      parent_of_parent=$(echo "$response" | jq -r '.parentId // empty')
      if [ -z "$parent_of_parent" ] || [ "$parent_of_parent" == "null" ]; then
        set_cwd "s/"
        set_shared_flag 1
        set_parent_cwd "/"
        refresh_listing
        echo "Moved up to shared root."
        return
      fi
      set_cwd "$parent_of_parent"
      # Get new parent's parent (if possible, else set to s/)
      parent_response=$(curl -k -s -b /tmp/ses_cookies "$API_BASE_URL/directories/shared/$parent_of_parent")
      # Check for access denied or empty object
      accessible=$(echo "$parent_response" | jq -r '.id // empty')
      if [ -z "$accessible" ] || [ "$accessible" == "null" ]; then
        set_cwd "s/"
        set_shared_flag 1
        set_parent_cwd "/"
        refresh_listing
        echo "Moved up to shared root."
        return
      fi

      set_cwd "$parent_of_parent"
      
      parent_of_parent2=$(echo "$parent_response" | jq -r '.parentId // empty')
      if [ -z "$parent_of_parent2" ] || [ "$parent_of_parent2" == "null" ]; then
        set_parent_cwd "s/"
      else
        set_parent_cwd "$parent_of_parent2"
      fi
      set_shared_flag 1
      refresh_listing
      echo "Moved up to parent directory."
      return
    else
      set_cwd "$parent"
      # Now, also update the parent of the new cwd
      if [ "$parent" == "/" ] || [ "$parent" == "s/" ]; then
        set_parent_cwd "/"
        set_shared_flag 0
      else
        token=$(get_token)
        url="$API_BASE_URL/directories/$parent"
        response=$(curl -k -s -b /tmp/ses_cookies "$url")
        parent_of_parent=$(echo "$response" | jq -r '.parentId // "/"')
        set_parent_cwd "$parent_of_parent"
      fi
      refresh_listing
      echo "Moved up to parent directory."
      return
    fi
  fi

  # Otherwise, normal cd to subdirectory
  dir_id=$(find_dir_id_by_name "$dir_name")
  if [ -z "$dir_id" ]; then
    echo "Directory '$dir_name' not found in current directory."
    return 1
  fi

  token=$(get_token)
  IS_SHARED=$(get_shared_flag)
  if [ "$IS_SHARED" = "1" ]; then
    url="$API_BASE_URL/directories/shared/$dir_id"
  else
    url="$API_BASE_URL/directories/$dir_id"
  fi
  response=$(curl -k -s -b /tmp/ses_cookies "$url")
  parent_id=$(echo "$response" | jq -r '.parentId // "/"')

  set_cwd "$dir_id"
  set_parent_cwd "$parent_id"
  echo "Changed directory to $dir_name"
}

# COMMAND: ses ls
ses_ls() {
  token=$(get_token)
  cwd=$(get_cwd)
  IS_SHARED=$(get_shared_flag)

  if [ "$IS_SHARED" = "1" ]; then
    if [ "$cwd" == "s/" ]; then
      files_url="$API_BASE_URL/files/shared"
      dirs_url="$API_BASE_URL/directories/shared"
    else
      files_url="$API_BASE_URL/files/shared/directory/$cwd"
      dirs_url="$API_BASE_URL/directories/shared/parent/$cwd"
    fi
  else
    if [ "$cwd" == "/" ]; then
      files_url="$API_BASE_URL/files/root"
      dirs_url="$API_BASE_URL/directories/root"
    else
      files_url="$API_BASE_URL/files/directory/$cwd"
      dirs_url="$API_BASE_URL/directories/parent/$cwd"
    fi
  fi

  files_response=$(curl -k -s -b /tmp/ses_cookies "$files_url")
  echo "$files_response" > /tmp/ses_files.json

  dirs_response=$(curl -k -s -b /tmp/ses_cookies "$dirs_url")
  echo "$dirs_response" > /tmp/ses_dirs.json

  if [ "$IS_SHARED" = "1" ]; then
    printf "%-50s %-10s %-12s\n" "NAME" "TYPE" "PERMISSION"
    printf "%-50s %-10s %-12s\n" "--------------------------------------------------" "----------" "------------"
  else
    printf "%-50s %-10s\n" "NAME" "TYPE"
    printf "%-50s %-10s\n" "--------------------------------------------------" "----------"
  fi

  # Directories first (blue)
  if [ -s /tmp/ses_dirs.json ]; then
    jq -r '.[] | "\(.id)\t\(.name)\tdirectory"' /tmp/ses_dirs.json 2>/dev/null | while IFS=$'\t' read -r id name type; do
      if [ "$IS_SHARED" = "1" ]; then
        perm="—"
        printf "${BLUE}%-50s${RESET} %-10s %-12s\n" "$name" "$type" "$perm"
      else
        printf "${BLUE}%-50s${RESET} %-10s\n" "$name" "$type"
      fi
    done
  fi

  # Then files
  if [ -s /tmp/ses_files.json ]; then
    if [ "$IS_SHARED" = "1" ]; then
      jq -r '.[] | "\(.id)\t\(.name)\tfile\t\(.permission // "VIEW")"' /tmp/ses_files.json 2>/dev/null | while IFS=$'\t' read -r id name type perm; do
        printf "%-50s %-10s %-12s\n" "$name" "$type" "$perm"
      done
    else
      jq -r '.[] | "\(.id)\t\(.name)\tfile"' /tmp/ses_files.json 2>/dev/null | while IFS=$'\t' read -r id name type; do
        printf "%-50s %-10s\n" "$name" "$type"
      done
    fi
  fi
}

# COMMAND: ses logout
ses_logout() {
  rm -f "$TOKEN_FILE"
  rm -f "$CWD_FILE"
  rm -f "$SHARED_FLAG_FILE"
  rm -f /tmp/ses_cookies
  echo "Logged out."
}

ses_rename() {
  file_id=$(find_file_id_by_name "$1")
  shift
  new_name="$*"
  IS_SHARED=$(get_shared_flag)
  if [ -z "$file_id" ] || [ -z "$new_name" ]; then
    echo "Usage: ses rename {file id} {new name}"
    return 1
  fi

  token=$(get_token)
  if [ "$IS_SHARED" = "1" ]; then
    url="$API_BASE_URL/files/shared/$file_id/name"
  else
    url="$API_BASE_URL/files/$file_id/name"
  fi

  data=$(jq -n --arg name "$new_name" '{name: $name}')

  response=$(curl -k -s -w "\n%{http_code}" -X PUT "$url" \
    -b /tmp/ses_cookies \
    -H "Content-Type: application/json" \
    -d "$data")
  http_body=$(echo "$response" | head -n -1)
  http_code=$(echo "$response" | tail -n1)

  if [ "$http_code" = "200" ] && echo "$http_body" | jq -e '.id' >/dev/null 2>&1; then
    echo "File renamed successfully!"
  else
    err_msg=$(echo "$http_body" | jq -r '.message // empty')
    if [ "$http_code" = "403" ]; then
      echo "No permission to rename the file."
    elif [ "$http_code" = "404" ]; then
      echo "File not found."
    elif [ -n "$err_msg" ]; then
      echo "Failed to rename file: $err_msg"
    else
      echo "Failed to rename file. HTTP $http_code"
    fi
  fi
}

ses_rm() {
  if [ "$1" == "-rf" ]; then
    echo "Use 'ses rm -rf <directory_name>' to remove directories."
    return
  fi

  IS_SHARED=$(get_shared_flag)
  file_name="$1"
  file_id=$(find_file_id_by_name "$file_name")

  if [ -z "$file_id" ]; then
    echo "File '$file_name' not found in current directory."
    return 1
  fi

  token=$(get_token)
  if [ "$IS_SHARED" = "1" ]; then
    url="$API_BASE_URL/files/shared/$file_id"
  else
    url="$API_BASE_URL/files/$file_id"
  fi

  # Collect both http code and response body
  response=$(curl -k -s -w "\n%{http_code}" -X DELETE -b /tmp/ses_cookies "$url")
  http_body=$(echo "$response" | head -n -1)
  http_code=$(echo "$response" | tail -n1)

  if [ "$http_code" = "200" ]; then
    echo "File '$file_name' deleted successfully."
    ses_ls
  else
    # Try to extract message
    err_msg=$(echo "$http_body" | jq -r '.message // empty')
    if [ "$http_code" = "403" ]; then
      echo "No permission to delete the file."
    elif [ "$http_code" = "404" ]; then
      echo "File not found."
    elif [ -n "$err_msg" ]; then
      echo "Failed to delete file '$file_name': $err_msg"
    else
      echo "Failed to delete file '$file_name'. HTTP $http_code"
    fi
  fi
}

ses_rm_rf() {
  IS_SHARED=$(get_shared_flag)
  if [ "$IS_SHARED" = "1" ]; then
    echo "rm -rf is disabled in Shared context."
    return 1
  fi

  dir_name="$1"
  dir_id=$(find_dir_id_by_name "$dir_name")

  if [ -z "$dir_id" ]; then
    echo "Directory '$dir_name' not found in current directory."
    return 1
  fi

  token=$(get_token)
  url="$API_BASE_URL/directories/$dir_id"

  response=$(curl -k -s -o /dev/null -w "%{http_code}" -X DELETE \
    -b /tmp/ses_cookies "$url")

  if [ "$response" = "200" ]; then
    echo "Directory '$dir_name' deleted successfully."
    ses_ls
  else
    echo "Failed to delete directory '$dir_name'. HTTP $response"
  fi
}

ses_path() {
  cwd=$(get_cwd)
  IS_SHARED=$(get_shared_flag)
  if [ "$cwd" == "/" ]; then
    echo "/"
    return
  fi
  if [ "$cwd" == "s/" ]; then
    echo "s/"
    return
  fi
  token=$(get_token)
  if [ "$IS_SHARED" = "1" ]; then
    url="$API_BASE_URL/directories/shared/$cwd"
  else
    url="$API_BASE_URL/directories/$cwd"
  fi
  response=$(curl -k -s -b /tmp/ses_cookies "$url")
  path=$(echo "$response" | jq -r '.path // empty')
  if [ "$IS_SHARED" = "1" ]; then
    path="s/${path}"
  fi
  if [ -z "$path" ] || [ "$path" == "null" ]; then
    echo "(Path not available, likely outside of your permissions)"
  else
    echo "$path"
  fi
}

ses_personal() {
  set_cwd "/"
  set_shared_flag 0
  echo "Switched to Personal Files."
}

ses_shared() {
  set_cwd "s/"
  set_shared_flag 1
  set_parent_cwd "/"
  refresh_listing
  echo "Switched to Shared Files."
}

ses_upload() {
  init_cwd_if_needed
  
  local_file="$1"
  remote_name="$2"
  cwd=$(get_cwd)
  token=$(get_token)
  IS_SHARED=$(get_shared_flag)

  if [ "$IS_SHARED" = "1" ]; then
    echo "Cannot upload files in the shared directory"
    return 1
  fi

  if [ -z "$local_file" ]; then
    echo "Usage: ses upload <local_file_path> [remote_name]"
    return 1
  fi

  if [ ! -f "$local_file" ]; then
    echo "File not found: $local_file"
    return 1
  fi

  # Default to basename if remote_name is not set
  if [ -z "$remote_name" ]; then
    remote_name=$(basename "$local_file")
  fi

  # Get file size (in bytes)
  file_size=$(stat -c %s "$local_file")

  # Get MIME type, fallback to application/octet-stream if unavailable
  if command -v file > /dev/null 2>&1; then
    mime_type=$(file --mime-type -b "$local_file")
  else
    mime_type="application/octet-stream"
  fi

  upload_url="$API_BASE_URL/files"

  response=$(curl -k -s -w "\n%{http_code}" -X POST \
    -b /tmp/ses_cookies \
    -F "name=$remote_name" \
    -F "mimeType=$mime_type" \
    -F "size=$file_size" \
    -F "directoryId=$cwd" \
    -F "fileData=@$local_file;type=$mime_type" \
    "$upload_url")

  http_body=$(echo "$response" | head -n -1)
  http_code=$(echo "$response" | tail -n1)

  if [ "$http_code" = "200" ] || [ "$http_code" = "201" ]; then
    echo "Upload successful: $remote_name"
    ses_ls
  else
    echo "Upload failed. HTTP $http_code"
    echo "$http_body"
    return 1
  fi
}

ses_mkdir() {
  init_cwd_if_needed

  IS_SHARED=$(get_shared_flag)
  if [ "$IS_SHARED" = "1" ]; then
    echo "Cannot create directories in the shared area."
    return 1
  fi

  dir_name="$1"
  if [ -z "$dir_name" ]; then
    echo "Usage: ses mkdir <directory_name>"
    return 1
  fi

  parent_id=$(get_cwd)
  token=$(get_token)

  # Build the JSON payload
  payload=$(jq -n --arg name "$dir_name" --arg parentId "$parent_id" '{name: $name, parentId: $parentId}')

  # Send the POST request
  response=$(curl -k -s -w "\n%{http_code}" -X POST "$API_BASE_URL/directories" \
    -b /tmp/ses_cookies \
    -H "Content-Type: application/json" \
    -d "$payload")

  http_body=$(echo "$response" | head -n -1)
  http_code=$(echo "$response" | tail -n1)

  if [ "$http_code" = "200" ]; then
    echo "Directory created successfully: $dir_name"
    refresh_listing
    ses_ls
  elif [ "$http_code" = "403" ]; then
    echo "You do not have permission to create a directory here."
  else
    err_msg=$(echo "$http_body" | jq -r '.message // empty')
    if [ -n "$err_msg" ]; then
      echo "Failed to create directory: $err_msg"
    else
      echo "Failed to create directory. HTTP $http_code"
    fi
  fi
}


# Find file id by name (if unique)
find_file_id_by_name() {
  file_name="$1"
  jq -r --arg name "$file_name" '.[] | select(.name==$name) | .id' /tmp/ses_files.json
}

# Find directory id by name (must be unique in current context)
find_dir_id_by_name() {
  dir_name="$1"
  jq -r --arg name "$dir_name" '.[] | select(.name==$name) | .id' /tmp/ses_dirs.json
}

refresh_listing() {
  token=$(get_token)
  cwd=$(get_cwd)
  IS_SHARED=$(get_shared_flag)
  if [ "$cwd" == "/" ]; then
    files_url="$API_BASE_URL/files/root"
    dirs_url="$API_BASE_URL/directories/root"
  elif [ "$cwd" == "s/" ]; then
    files_url="$API_BASE_URL/files/shared"
    dirs_url="$API_BASE_URL/directories/shared"
  else
    if [ "$IS_SHARED" = "1" ]; then
      files_url="$API_BASE_URL/files/shared/directory/$cwd"
      dirs_url="$API_BASE_URL/directories/shared/parent/$cwd"
    else
      files_url="$API_BASE_URL/files/directory/$cwd"
      dirs_url="$API_BASE_URL/directories/parent/$cwd"
    fi
  fi
  files_response=$(curl -k -s -b /tmp/ses_cookies "$files_url")
  echo "$files_response" > /tmp/ses_files.json
  dirs_response=$(curl -k -s -b /tmp/ses_cookies "$dirs_url")
  echo "$dirs_response" > /tmp/ses_dirs.json
}

init_cwd_if_needed() {
  cwd=$(get_cwd)
  if [ "$cwd" = "/" ] || [ -z "$cwd" ]; then
    token=$(get_token)
    # Get the root directory object for the user
    root_response=$(curl -k -s -b /tmp/ses_cookies "$API_BASE_URL/directories/base")
    # Take the first directory (if the API returns an array)
    # or .id if it returns an object
    dir_id=$(echo "$root_response" | jq -r 'if type=="array" then .[0].id else .id end')
    if [ -n "$dir_id" ] && [ "$dir_id" != "null" ]; then
      set_cwd "$dir_id"
    fi
  fi
}



# Help
ses_help() {
  cat <<EOF
SES Shell - Commands Reference
────────────────────────────────────────────────────────────────────────────
  Authentication & Session
    ses login                        - Log in (Google browser flow)
    ses logout                       - Log out of your session
    ses cookie                       - Show the current cookie

  File & Directory Navigation
    ses ls                           - List files/directories in current directory
    ses cd <dir_name>                - Change directory (by name in current listing)
    ses cd ..                        - Move up to parent directory
    ses path                         - Show the current path
    ses switch personal              - Switch to your personal files
    ses switch shared                - Switch to files shared with you

  File Operations
    ses upload <local_file> [name]   - Upload a file (optionally set a new name)
    ses rename <current> <new>       - Rename a file by name in current directory
    ses rm <file_name>               - Remove a file by name in current directory

  Directory Operations
    ses mkdir <dir_name>             - Create a new directory in the current directory
    ses rm -rf <dir_name>            - Remove a directory and its contents (disabled in shared)

  Help
    ses help                         - Show this help message

────────────────────────────────────────────────────────────────────────────
EOF
}

# Main
case "$1" in
  login)
    ses_login
    ;;
  help|--help|-h|"")
    ses_help
    ;;
  cookie)
    ses_cookie
    ;;
  logout)
    ensure_logged_in
    ses_logout
    ;;
  switch)
    ensure_logged_in
    case "$2" in
      personal) ses_personal ;;
      shared) ses_shared ;;
      *) echo "Usage: ses switch [personal|shared]";;
    esac
    ;;
  cd)
    ensure_logged_in
    shift; ses_cd "$@"
    ;;
  ls)
    ensure_logged_in
    ses_ls
    ;;
  rename)
    ensure_logged_in
    shift; ses_rename "$@"
    ;;
  rm)
    ensure_logged_in
    shift
    if [ "$1" == "-rf" ]; then
      shift
      ses_rm_rf "$@"
    else
      ses_rm "$@"
    fi
    ;;
  path)
    ensure_logged_in
    ses_path
    ;;
  upload)
    ensure_logged_in
    shift
    ses_upload "$@"
    ;;
  mkdir)
    ensure_logged_in
    shift
    ses_mkdir "$@"
    ;;
  *)
    echo "Unknown command: $1"
    ses_help
    ;;
esac