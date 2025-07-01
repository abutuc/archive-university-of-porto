import { Directory } from "@/components/types/types";
import { API_BASE_URL } from "@/config";
import { redirect } from "react-router-dom";

async function createDirectory({
  name,
  parentId,
  userId,
}: {
  name: string;
  parentId: string;
  userId: string | undefined;
}): Promise<Directory | null> {
  if (!userId) return null;

  const path = parentId + "/" + name + "/";
  const res = await fetch(`${API_BASE_URL}/directories`, {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    },
    credentials: 'include',
    body: JSON.stringify({ name, path, parentId, userId }),
  });

  if (!res.ok) {
    const errText = await res.text();
    throw new Error(`Failed to create directory: ${errText}`);
  }

  return res.json();
}

async function getDirsByParentId({
  parentId,
}: {
  parentId: string;
}) {
  try {
    const res = await fetch(`${API_BASE_URL}/directories/parent/${parentId}`, {
      method: "GET",
      headers: {
        "Content-Type": "application/json",
      },
      credentials: 'include',
    });

    if (!res.ok) {
      const errText = await res.text();
      console.log(errText);
      throw new Error(
        `Failed to fetch subdirectories: ${errText} (Status: ${res.status})`
      );
    }
    return await res.json();
  } catch (error) {
    console.log(error);
  }
}

function getBaseDirectoryId({ userId }: { userId: string | undefined }) {
  if (!userId) {
    redirect("/");
    return "error";
  } else {
    return `user-${userId}-dir-0`;
  }
}

async function getDirectoryById({
  directoryId,
}: {
  directoryId: string;
}) {
  try {
    const res = await fetch(`${API_BASE_URL}/directories/${directoryId}`, {
      method: "GET",
      headers: {
        "Content-Type": "application/json",
      },
      credentials: 'include',
    });
    return await res.json();
  } catch (error) {
    console.log(error);
  }
}

async function deleteDirectory({
  directoryId,
}: {
  directoryId: string;
}): Promise<boolean> {
  const res = await fetch(`${API_BASE_URL}/directories/${directoryId}`, {
    method: "DELETE",
    headers: {
      "Content-Type": "application/json",
    },
    credentials: 'include',
  });

  if (!res.ok) {
    const errText = await res.text();
    throw new Error(`Failed to delete directory: ${errText}`);
  }
  return res.ok;
}

async function getSharedDirectories() {
  try {
    const res = await fetch(`${API_BASE_URL}/directories/shared`, {
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

async function getSharedDirsByParentId({
  parentId,
}: {
  parentId: string;
}) {
  const res = await fetch(
    `${API_BASE_URL}/directories/shared/parent/${parentId}`,
    {
      credentials: 'include',
    }
  );
  if (!res.ok) throw new Error(await res.text());
  return await res.json();
}

async function getSharedDirectoryById({
  directoryId,
}: {
  directoryId: string;
}) {
  const res = await fetch(`${API_BASE_URL}/directories/shared/${directoryId}`, {
    credentials: 'include',
  });
  if (!res.ok) throw new Error(await res.text());
  return await res.json();
}

export {
  createDirectory,
  getDirsByParentId,
  getBaseDirectoryId,
  getDirectoryById,
  deleteDirectory,
  getSharedDirectories,
  getSharedDirsByParentId,
  getSharedDirectoryById,
};
