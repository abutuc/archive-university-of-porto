import { API_BASE_URL } from "@/config";

async function getFilesByDirId({
  baseDirectoryId,
}: {
  baseDirectoryId: string;
}) {
  try {
    const res = await fetch(
      `${API_BASE_URL}/files/directory/${baseDirectoryId}`,
      {
        method: "GET",
        headers: {
          "Content-Type": "application/json",
        },
        credentials: 'include',
      }
    );

    if (!res.ok) {
      const errText = await res.text();
      console.log(errText);
      return [];
    }
    return await res.json();
  } catch (error) {
    console.log(error);
  }
}

async function getSharedFiles() {
  try {
    const res = await fetch(`${API_BASE_URL}/files/shared`, {
      method: "GET",
      headers: {
        "Content-Type": "application/json",
      },
      credentials: 'include',
    });
    if (!res.ok) {
      const errText = await res.text();
      console.log(errText);
      return [];
    }
    return await res.json();
  } catch (error) {
    console.log(error);
  }
}

async function deleteFile({
  fileId,
}: {
  fileId: string;
}) {
  try {
    const res = await fetch(`${API_BASE_URL}/files/${fileId}`, {
      method: "DELETE",
      headers: {
        "Content-Type": "application/json",
      },
      credentials: 'include',
    });
    if (!res.ok) {
      const errText = await res.text();
      console.log(errText);
      throw new Error(
        `Failed to delete file: ${errText} (Status: ${res.status})`
      );
    }
  } catch (error) {
    console.log(error);
  }
}

async function deleteSharedFile({
  fileId,
}: {
  fileId: string;
}) {
  try {
    const res = await fetch(`${API_BASE_URL}/files/shared/${fileId}`, {
      method: "DELETE",
      headers: {
        "Content-Type": "application/json",
      },
      credentials: 'include',
    });
    if (!res.ok) {
      const errText = await res.text();
      console.log(errText);
      throw new Error(
        `Failed to delete file: ${errText} (Status: ${res.status})`
      );
    }
  } catch (error) {
    console.log(error);
  }
}

async function getSharedFilesByDirId({
  directoryId,
}: {
  directoryId: string;
}) {
  const res = await fetch(
    `${API_BASE_URL}/files/shared/directory/${directoryId}`,
    {
      credentials: 'include',
    }
  );
  if (!res.ok) throw new Error(await res.text());
  return await res.json();
}

export {
  getFilesByDirId,
  deleteFile,
  getSharedFiles,
  deleteSharedFile,
  getSharedFilesByDirId,
};
