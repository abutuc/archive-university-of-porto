"use client";

import { useEffect, useState } from "react";
import { Button } from "@/components/ui/button";
import { Input } from "@/components/ui/input";
import { FileCard } from "@/components/file/shared-file-card";
import { FileDetailsDialog } from "@/components/file/shared-file-details-dialog";
import { GridIcon, ListIcon, SearchIcon } from "lucide-react";
import {
  createDirectory,
  deleteDirectory,
  getSharedDirectories,
  getSharedDirsByParentId,
  getSharedDirectoryById,
} from "@/utils/Directory";
import { DirectoryCard } from "./directory/shared-directory-card";
import { DeleteDirectoryDialog } from "./directory/delete-directory-dialog";
import {
  getSharedFiles,
  deleteSharedFile,
  getSharedFilesByDirId,
} from "@/utils/File";
import { FileWithPermission, Directory } from "@/components/types/types";
import { NewDirectoryDialog } from "./directory/new-directory-dialog";
import { API_BASE_URL } from "@/config";
import Breadcrumbs from "./dashboard/breadcrumbs";

export function SharedFileExplorer() {
  const [files, setFiles] = useState<FileWithPermission[]>([]);
  const [directories, setDirectories] = useState<Directory[]>([]);
  const [currentDirectory, setCurrentDirectory] = useState("");
  const [showNewDirectoryInput, setShowNewDirectoryInput] = useState(false);
  const [newDirectoryName, setNewDirectoryName] = useState("");
  const [breadcrumbPath, setBreadcrumbPath] = useState<
    { id: string; name: string }[]
  >([]);

  const [viewMode, setViewMode] = useState<"grid" | "list">("grid");
  const [searchQuery, setSearchQuery] = useState("");
  const [selectedFile, setSelectedFile] = useState<FileWithPermission | null>(
    null
  );
  const [selectedDirectory, setSelectedDirectory] = useState<Directory | null>(
    null
  );
  const [user, setUser] = useState(undefined); 

  useEffect(() => {
    fetch(`${API_BASE_URL}/users/me`, {
      method: "GET",
      credentials: "include"
    })
      .then(async (res) => {
        if (res.ok) {
          const userData = await res.json();
          setUser(userData);
        } else {
          setUser(null);
        }
      })
      .catch(() => {
        setUser(null);
      });
  }, []);

  useEffect(() => {
    setCurrentDirectory("/");
  }, []);

  useEffect(() => {
    if (!currentDirectory) return;

    async function buildBreadcrumbs(dirId: string) {
      let path: { id: string; name: string }[] = [];
      if (dirId === "/") {
        path.push({ id: "/", name: "Shared" });
      } else {
        let dirToSearch: string | null = dirId;
        while (dirToSearch && dirToSearch !== "/") {
          // Defensive: skip if API fails
          let dirInfo;
          try {
            dirInfo = await getSharedDirectoryById({
              directoryId: dirToSearch,
            });
          } catch {
            break;
          }
          path.unshift({ id: dirToSearch, name: dirInfo.name });
          dirToSearch = dirInfo.parentId || "/";
        }
        path.unshift({ id: "/", name: "Shared" });
      }
      setBreadcrumbPath(path);
    }

    buildBreadcrumbs(currentDirectory);

    // Fetch children for dirs and files:
    async function fetchDirectoriesAndFiles() {
      if (currentDirectory === "/") {
        setDirectories(await getSharedDirectories());
        setFiles(await getSharedFiles());
      } else {
        setDirectories(
          await getSharedDirsByParentId({
            parentId: currentDirectory,
          })
        );
        setFiles(
          await getSharedFilesByDirId({
            directoryId: currentDirectory,
          })
        );
      }
    }
    fetchDirectoriesAndFiles();
  }, [currentDirectory]);

  // Filter files based on search query
  const filteredFiles = files.filter((file) =>
    file.name.toLowerCase().includes(searchQuery.toLowerCase())
  );

  const filteredDirectories = directories.filter((directory) =>
    directory.name.toLowerCase().includes(searchQuery.toLowerCase())
  );

  const handleDeleteFile = async (fileId: string) => {
    deleteSharedFile({ fileId });
    setFiles(files.filter((file) => file.id !== fileId));
    if (selectedFile?.id === fileId) {
      setSelectedFile(null);
    }
  };

  // Handle permission update
  const handleUpdatePermissions = (fileId: string, permissions: any) => {
    setFiles(
      files.map((file) =>
        file.id === fileId ? { ...file, permissions } : file
      )
    );
  };

  const handleCreateDirectory = async () => {
    try {
      const newDir = await createDirectory({
        name: newDirectoryName,
        parentId: currentDirectory,
        userId: user?.id,
      });
      if (!newDir) return;

      console.log("directories before:", directories);
      console.log("New directory created:", newDir);
      setDirectories([newDir, ...directories]);
      console.log("Directories after", directories);
      setNewDirectoryName("");
      setShowNewDirectoryInput(false);
    } catch (error) {
      console.error(error);
    }
  };

  const handleDeleteDirectory = async (directoryId: string) => {
    await deleteDirectory({ directoryId });
    setDirectories(directories.filter((dir) => dir.id !== directoryId));
    setSelectedDirectory(null);
    console.log("Deleting directory:", directoryId);
  };

   return (
    <div className="space-y-6">
      <div className="flex flex-col md:flex-row gap-3 items-center justify-between bg-white rounded-2xl p-4 shadow-sm">
        <div className="relative w-full md:w-72">
          <SearchIcon className="absolute left-3 top-2.5 h-4 w-4 text-muted-foreground" />
          <Input
            type="search"
            placeholder="Search directories and files..."
            className="pl-9 py-2 rounded-xl shadow-inner border border-gray-200"
            value={searchQuery}
            onChange={(e) => setSearchQuery(e.target.value)}
          />
        </div>
        <div className="flex items-center gap-2">

          <div className="flex border border-gray-200 rounded-xl overflow-hidden">
            <Button
              variant={viewMode === "grid" ? "default" : "ghost"}
              size="sm"
              className={`rounded-r-none ${viewMode === "grid" ? "bg-[#3D76F6] text-white" : "text-gray-700"}`}
              onClick={() => setViewMode("grid")}
            >
              <GridIcon className="h-4 w-4" />
            </Button>
            <Button
              variant={viewMode === "list" ? "default" : "ghost"}
              size="sm"
              className={`rounded-l-none ${viewMode === "list" ? "bg-[#3D76F6] text-white" : "text-gray-700"}`}
              onClick={() => setViewMode("list")}
            >
              <ListIcon className="h-4 w-4" />
            </Button>
            <NewDirectoryDialog
              showNewDirectoryInput={showNewDirectoryInput}
              setShowNewDirectoryInput={setShowNewDirectoryInput}
              newDirectoryName={newDirectoryName}
              setNewDirectoryName={setNewDirectoryName}
              handleCreateDirectory={handleCreateDirectory}
            />
          </div>
        </div>
      </div>

      <Breadcrumbs path={breadcrumbPath} setCurrentDirectory={setCurrentDirectory}/>

      {filteredFiles.length + filteredDirectories.length === 0 ? (
        <div className="flex flex-col items-center justify-center h-56 rounded-2xl border-2 border-dashed border-gray-200 bg-white shadow-inner">
          <p className="text-gray-400 text-base">No files or folders found</p>
        </div>
      ) : (
        <div
          className={
            viewMode === "grid"
              ? "grid grid-cols-1 sm:grid-cols-2 md:grid-cols-3 lg:grid-cols-4 gap-4"
              : "space-y-2"
          }
        >
          {filteredDirectories.map((directory) => (
            <DirectoryCard
              key={directory.id}
              directory={directory}
              viewMode={viewMode}
              onSelect={() => setCurrentDirectory(directory.id)}
              onDelete={() => setSelectedDirectory(directory)}
              onShare={() => {}}
            />
          ))}
          {filteredFiles.map((file) => (
            <FileCard
              key={file.id}
              file={file}
              viewMode={viewMode}
              onSelect={() => setSelectedFile(file)}
              onDelete={() => handleDeleteFile(file.id!)}
            />
          ))}
        </div>
      )}

      {selectedDirectory && (
        <DeleteDirectoryDialog
          directory={selectedDirectory}
          onClose={() => setSelectedDirectory(null)}
          onConfirm={() => handleDeleteDirectory(selectedDirectory.id!)}
        />
      )}
      {selectedFile && (
        <FileDetailsDialog
          file={selectedFile}
          onClose={() => setSelectedFile(null)}
          onDelete={() => handleDeleteFile(selectedFile.id!)}
          onUpdatePermissions={(permissions) =>
            handleUpdatePermissions(selectedFile.id!, permissions)
          }
          onFileUpdated={(updatedFile) => {
            setFiles((prevFiles) =>
              prevFiles.map((f) => (f.id === updatedFile.id ? updatedFile : f))
            );
            setSelectedFile(updatedFile);
          }}
        />
      )}
    </div>
  );
}
