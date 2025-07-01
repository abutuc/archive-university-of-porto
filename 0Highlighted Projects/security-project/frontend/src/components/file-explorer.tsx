"use client";

import { useEffect, useState } from "react";
import { Button } from "@/components/ui/button";
import { Input } from "@/components/ui/input";
import { FileCard } from "@/components/file/file-card";
import { FileUploader } from "@/components/file-uploader";
import { FileDetailsDialog } from "@/components/file/file-details-dialog";
import { GridIcon, ListIcon, FolderPlusIcon, SearchIcon } from "lucide-react";
import {
  createDirectory,
  getDirsByParentId,
  getBaseDirectoryId,
  getDirectoryById,
  deleteDirectory,
} from "@/utils/Directory";
import { DirectoryCard } from "./directory/directory-card";
import { DeleteDirectoryDialog } from "./directory/delete-directory-dialog";
import { getFilesByDirId, deleteFile } from "@/utils/File";
import { File, Directory } from "@/components/types/types";
import { NewDirectoryDialog } from "./directory/new-directory-dialog";
import { DirectoryShareModal } from "./directory/directory-share-modal";
import { API_BASE_URL } from "@/config";
import Breadcrumbs from "./dashboard/breadcrumbs";

export function FileExplorer() {
  const [files, setFiles] = useState<File[]>([]);
  const [directories, setDirectories] = useState<Directory[]>([]);
  const [currentDirectory, setCurrentDirectory] = useState("");
  const [showNewDirectoryInput, setShowNewDirectoryInput] = useState(false);
  const [newDirectoryName, setNewDirectoryName] = useState("");
  const [breadcrumbPath, setBreadcrumbPath] = useState<
    { id: string; name: string }[]
  >([]);

  const [viewMode, setViewMode] = useState<"grid" | "list">("grid");
  const [searchQuery, setSearchQuery] = useState("");
  const [selectedFile, setSelectedFile] = useState<File | null>(null);
  const [showShareDirectoryModal, setShowShareDirectoryModal] = useState(false);
  const [shareDirectoryId, setShareDirectoryId] = useState<string | null>(null);
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
    if (user && user.id) {
      setCurrentDirectory(getBaseDirectoryId({ userId: user.id }));
    }
  }, [user]);


  useEffect(() => {
    async function buildBreadcrumbs() {
      const path: { id: string; name: string }[] = [];
      let dirToSearch = currentDirectory;

      while (dirToSearch) {
        const dirInfo = await getDirectoryById({
          directoryId: dirToSearch,
        });

        if (!dirInfo) break;

        path.unshift({ id: dirToSearch, name: dirInfo.name });

        dirToSearch = dirInfo.parentId ?? null;
      }

      setBreadcrumbPath(path);
    }

    async function fetchDirectories() {
      setDirectories(
        await getDirsByParentId({
          parentId: currentDirectory,
        })
      );
    }

    async function fetchFiles() {
      setFiles(
        await getFilesByDirId({
          baseDirectoryId: currentDirectory,
        })
      );
    }

    if (currentDirectory) {
      buildBreadcrumbs();
      fetchDirectories();
      fetchFiles();
    }
  }, [currentDirectory]);

  // Filter files based on search query
  const filteredFiles = files.filter((file) =>
    file.name.toLowerCase().includes(searchQuery.toLowerCase())
  );

  const filteredDirectories = directories.filter((directory) =>
    directory.name.toLowerCase().includes(searchQuery.toLowerCase())
  );

  const handleFileUpload = async (newFiles: File[]) => {
    for (const file in newFiles) {
      setFiles((prevFiles) => [...prevFiles, newFiles[file]]);
    }
  };

  const handleDeleteFile = async (fileId: string) => {
    deleteFile({ fileId });
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
      {/* Search, view switch, New Directory button */}
      <div className="flex flex-col md:flex-row gap-3 items-center justify-between bg-white rounded-2xl p-4 shadow-sm">
        <div className="relative w-full md:w-72">
          <SearchIcon className="absolute left-3 top-2.5 h-4 w-4 text-gray-400" />
          <Input
            type="search"
            placeholder="Search directories and files..."
            className="pl-9 py-2 rounded-xl shadow-inner border border-gray-200"
            value={searchQuery}
            onChange={(e) => setSearchQuery(e.target.value)}
          />
        </div>
        <div className="flex items-center gap-2">
          {!currentDirectory.includes("public-html") && (
            <Button
              variant="outline"
              size="sm"
              className="rounded-xl border-[#3D76F6] hover:bg-[#e9f1ff] text-[#3D76F6] font-semibold"
              onClick={() => setShowNewDirectoryInput(true)}
            >
              <FolderPlusIcon className="mr-2 h-4 w-4" />
              New Directory
            </Button>
          )}

          <div className="flex border border-gray-200 rounded-xl overflow-hidden">
            <Button
              variant={viewMode === "grid" ? "default" : "ghost"}
              size="sm"
              className={`rounded-r-none ${viewMode === "grid" ? "bg-[#3D76F6] text-white" : "text-gray-700 hover:bg-[#e9f1ff]"}`}
              onClick={() => setViewMode("grid")}
            >
              <GridIcon className="h-4 w-4" />
            </Button>
            <Button
              variant={viewMode === "list" ? "default" : "ghost"}
              size="sm"
              className={`rounded-l-none ${viewMode === "list" ? "bg-[#3D76F6] text-white" : "text-gray-700 hover:bg-[#e9f1ff]"}`}
              onClick={() => setViewMode("list")}
            >
              <ListIcon className="h-4 w-4" />
            </Button>
          </div>
          <NewDirectoryDialog
            showNewDirectoryInput={showNewDirectoryInput}
            setShowNewDirectoryInput={setShowNewDirectoryInput}
            newDirectoryName={newDirectoryName}
            setNewDirectoryName={setNewDirectoryName}
            handleCreateDirectory={handleCreateDirectory}
          />
        </div>
      </div>

      {/* Breadcrumbs */}
      <Breadcrumbs path={breadcrumbPath} setCurrentDirectory={setCurrentDirectory}/>

      {/* Uploader */}
      <FileUploader onUpload={handleFileUpload} currentDirectory={currentDirectory} />

      {/* File/folder list */}
      {filteredFiles.length + filteredDirectories.length === 0 ? (
        <div className="flex flex-col items-center justify-center h-56 rounded-2xl border-2 border-dashed border-gray-200 bg-white shadow-inner">
          <p className="text-gray-400 text-base">No files or folders found</p>
        </div>
      ) : (
        <div className={viewMode === "grid"
          ? "grid grid-cols-1 sm:grid-cols-2 md:grid-cols-3 lg:grid-cols-4 gap-6"
          : "space-y-2"}>
          {filteredDirectories.map((directory) => (
            <DirectoryCard
              key={directory.id}
              directory={directory}
              viewMode={viewMode}
              onSelect={() => setCurrentDirectory(directory.id)}
              onDelete={() => setSelectedDirectory(directory)}
              onShare={() => {
                setShareDirectoryId(directory.id);
                setShowShareDirectoryModal(true);
              }}
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

      {/* Modals */}
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
          onUpdatePermissions={(permissions) => handleUpdatePermissions(selectedFile.id!, permissions)}
          onFileUpdated={(updatedFile) => {
            setFiles((prevFiles) => prevFiles.map((f) => (f.id === updatedFile.id ? updatedFile : f)));
            setSelectedFile(updatedFile);
          }}
        />
      )}
      {showShareDirectoryModal && shareDirectoryId && (
        <DirectoryShareModal
          open={showShareDirectoryModal}
          onClose={() => setShowShareDirectoryModal(false)}
          directoryId={shareDirectoryId}
        />
      )}
    </div>
  );
}

