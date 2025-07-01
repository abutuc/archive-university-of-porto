"use client";

import { useState, useEffect } from "react";
import {
  Dialog,
  DialogContent,
  DialogHeader,
  DialogTitle,
  DialogFooter,
} from "@/components/ui/dialog";
import { Button } from "@/components/ui/button";
import { Tabs, TabsContent, TabsList, TabsTrigger } from "@/components/ui/tabs";
import type { File } from "@/types/file";
import {
  FileIcon,
  ImageIcon,
  FileTextIcon,
  FileVideoIcon,
  FileMusicIcon,
  DownloadIcon,
  TrashIcon,
  EditIcon,
  EyeIcon,
  Edit2Icon,
  Trash2Icon,
  AlertTriangleIcon,
} from "lucide-react"; // Added AlertTriangleIcon for the warning
import { API_BASE_URL } from "@/config";
import { formatFileSize } from "@/utils/Size";
import { FileWithPermission } from "../types/types";
import { FileEditModal } from "./shared-file-edit-modal";
import { FileDetailsDialogProps } from "../types/props";

export function FileDetailsDialog({
  file,
  onClose,
  onDelete,
  onUpdatePermissions,
  onFileUpdated,
}: FileDetailsDialogProps) {
  const [isOpen, setIsOpen] = useState(true);
  const [userName, setUserName] = useState("");
  const [userEmail, setUserEmail] = useState("");
  const [permissions, setPermissions] = useState<string[]>([]);
  const [loadingPerms, setLoadingPerms] = useState(true);
  const [errorPerms, setErrorPerms] = useState("");
  const [showEditModal, setShowEditModal] = useState(false);
  const [currentFile, setCurrentFile] = useState<FileWithPermission>(file);

  // --- New state for download confirmation modal
  const [showDownloadModal, setShowDownloadModal] = useState(false);
  const [isDownloading, setIsDownloading] = useState(false);

  useEffect(() => {
    const fetchUserDetails = async () => {
      try {
        const res = await fetch(
          `${API_BASE_URL}/users/${currentFile.ownerId}`,
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
          throw new Error(
            `Failed to fetch user details: ${errText} (Status: ${res.status})`
          );
        }
        const data = await res.json();
        setUserName(data.username);
        setUserEmail(data.email);
      } catch (error) {
        console.log(error);
      }
    };
    fetchUserDetails();
  }, [currentFile.ownerId]);

  useEffect(() => {
    const fetchPermissions = async () => {
      setLoadingPerms(true);
      setErrorPerms("");
      try {
        const res = await fetch(
          `${API_BASE_URL}/files/${currentFile.id}/permissions`,
          {
            method: "GET",
            headers: {
              "Content-Type": "application/json",
            },
            credentials: 'include',
          }
        );
        if (!res.ok) throw new Error("Could not load permissions");
        const data = await res.json();
        // permissions should be an array of strings, e.g. ['VIEW', 'EDIT']
        setPermissions(data.permissionType || []);
      } catch (err: any) {
        setErrorPerms(err.message);
      }
      setLoadingPerms(false);
    };
    fetchPermissions();
  }, [currentFile.id]);

  const handleClose = () => {
    setIsOpen(false);
    onClose();
  };

  // Get file icon based on type
  const getFileIcon = () => {
    switch (currentFile.type) {
      case "image":
        return <ImageIcon className="h-6 w-6" />;
      case "document":
        return <FileTextIcon className="h-6 w-6" />;
      case "video":
        return <FileVideoIcon className="h-6 w-6" />;
      case "audio":
        return <FileMusicIcon className="h-6 w-6" />;
      default:
        return <FileIcon className="h-6 w-6" />;
    }
  };

  // The function that actually downloads the file (unchanged)
  const handleFileDownload = async (currentFile: File) => {
    setIsDownloading(true);
    try {
      const res = await fetch(
        `${API_BASE_URL}/files/${currentFile.id}/download`,
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
        throw new Error(
          `Failed to fetch files: ${errText} (Status: ${res.status})`
        );
      }

      const blob = await res.blob();
      const url = window.URL.createObjectURL(blob);
      const a = document.createElement("a");
      a.href = url;
      a.download = currentFile.name;
      document.body.appendChild(a);
      a.click();
      a.remove();
      window.URL.revokeObjectURL(url);

      console.log("File downloaded:", currentFile.name);
    } catch (error) {
      console.log(error);
    }
    setIsDownloading(false);
    setShowDownloadModal(false); // Close the modal after download
  };

  return (
    <>
      {/* --- Main File Details Dialog --- */}
      <Dialog
        open={isOpen}
        onOpenChange={(open) => {
          setIsOpen(open);
          if (!open) onClose();
        }}
      >
        <DialogContent className="sm:max-w-[600px] bg-white">
          <DialogHeader>
            <DialogTitle className="flex items-center gap-2">
              <span className="text-muted-foreground">{getFileIcon()}</span>
              {currentFile.name}
            </DialogTitle>
          </DialogHeader>

          <Tabs defaultValue="details" className="mt-4">
            <TabsList className="grid w-full grid-cols-2">
              <TabsTrigger value="details">Details</TabsTrigger>
              <TabsTrigger value="permissions">Permissions</TabsTrigger>
            </TabsList>

            <TabsContent value="details" className="space-y-4 py-4">
              {currentFile.type === "image" && (
                <div className="rounded-lg overflow-hidden border">
                  <img
                    src={
                      currentFile.url ||
                      "/placeholder.svg?height=300&width=500"
                    }
                    alt={currentFile.name}
                    className="w-full h-auto max-h-[300px] object-contain bg-gray-100"
                  />
                </div>
              )}

              <div className="grid grid-cols-2 gap-4">
                <div>
                  <h4 className="text-sm font-medium text-muted-foreground">
                    Type
                  </h4>
                  <p>{currentFile.mimeType}</p>
                </div>
                <div>
                  <h4 className="text-sm font-medium text-muted-foreground">
                    Size
                  </h4>
                  <p>{formatFileSize(Number(currentFile.size))}</p>
                </div>
                <div>
                  <h4 className="text-sm font-medium text-muted-foreground">
                    Owner
                  </h4>
                  <p className="whitespace-nowrap">
                    {userName} ({userEmail})
                  </p>
                </div>
              </div>
            </TabsContent>

            <TabsContent value="permissions" className="space-y-4 py-4">
              <h4 className="text-sm font-medium text-muted-foreground">
                Your Permissions
              </h4>
              {loadingPerms ? (
                <span className="text-sm text-gray-500">Loading...</span>
              ) : errorPerms ? (
                <span className="text-sm text-red-600">{errorPerms}</span>
              ) : permissions.length === 0 ? (
                <span className="text-sm text-gray-500">No permissions.</span>
              ) : (
                <div className="flex gap-2 flex-wrap">
                  {permissions.includes("VIEW") && (
                    <span className="inline-flex items-center px-3 py-1 rounded-full bg-blue-100 text-blue-800 text-xs font-medium gap-1">
                      <EyeIcon className="w-4 h-4" /> View
                    </span>
                  )}
                  {permissions.includes("EDIT") && (
                    <span className="inline-flex items-center px-3 py-1 rounded-full bg-yellow-100 text-yellow-800 text-xs font-medium gap-1">
                      <Edit2Icon className="w-4 h-4" /> Edit
                    </span>
                  )}
                  {permissions.includes("DELETE") && (
                    <span className="inline-flex items-center px-3 py-1 rounded-full bg-red-100 text-red-800 text-xs font-medium gap-1">
                      <Trash2Icon className="w-4 h-4" /> Delete
                    </span>
                  )}
                </div>
              )}
            </TabsContent>
          </Tabs>

          <DialogFooter className="flex justify-between items-center">
            <div className="flex gap-2 bg-white">
              {/* --- Download Button now opens confirmation modal --- */}
              <Button
                variant="outline"
                size="sm"
                className="hover:bg-gray-100"
                onClick={() => setShowDownloadModal(true)}
              >
                <DownloadIcon className="mr-2 h-4 w-4" />
                Download
              </Button>
              {currentFile.permission == "EDIT" && (
                <Button
                  variant="outline"
                  size="sm"
                  className="text-grey-600 hover:bg-gray-100"
                  onClick={() => setShowEditModal(true)}
                >
                  <EditIcon className="mr-2 h-4 w-4" />
                  Edit
                </Button>
              )}
              {currentFile.permission == "DELETE" && (
                <>
                  <Button
                    variant="outline"
                    size="sm"
                    className="text-grey-600 hover:bg-gray-100"
                    onClick={() => setShowEditModal(true)}
                  >
                    <EditIcon className="mr-2 h-4 w-4" />
                    Edit
                  </Button>

                  <Button
                    variant="outline"
                    size="sm"
                    className="text-red-600 hover:bg-gray-100"
                    onClick={() => onDelete()}
                  >
                    <TrashIcon className="mr-2 h-4 w-4" />
                    Delete
                  </Button>
                </>
              )}
            </div>
            <Button
              variant="default"
              onClick={handleClose}
              className="hover:bg-gray-100"
            >
              Close
            </Button>
          </DialogFooter>
        </DialogContent>

        {showEditModal && (
          <FileEditModal
            open={showEditModal}
            onClose={() => setShowEditModal(false)}
            file={currentFile}
            onSuccess={() => {
              /* Optionally refetch permissions */
            }}
            onFileUpdated={(updatedFile) => {
              setCurrentFile(updatedFile);
              if (onFileUpdated) onFileUpdated(updatedFile); // <--- CALL HERE
            }}
          />
        )}
      </Dialog>

      {/* --- Download Confirmation Modal --- */}
      <Dialog open={showDownloadModal} onOpenChange={setShowDownloadModal}>
        <DialogContent className="sm:max-w-[420px] text-center bg-white shadow-xl rounded-xl">
          <div className="flex flex-col items-center gap-3 py-2">
            <AlertTriangleIcon className="w-12 h-12 text-yellow-500 mx-auto" />
            <DialogTitle className="text-lg font-bold">
              Are you sure you want to download this shared file?
            </DialogTitle>
            <div className="text-sm text-gray-700">
              <span>
                <b>Warning:</b> Although we have strong file validation,
                some malicious files might still pass undetected.<br />
                Only download files from users you trust.
              </span>
            </div>
          </div>
          <DialogFooter className="flex justify-center gap-3 mt-4">
            <Button
              variant="outline"
              size="sm"
              className="hover:bg-gray-100"
              onClick={() => setShowDownloadModal(false)}
              disabled={isDownloading}
            >
              Cancel
            </Button>
            <Button
              variant="destructive"
              size="sm"
              className="bg-red-600 text-white hover:bg-red-700"
              onClick={() => handleFileDownload(currentFile)}
              disabled={isDownloading}
            >
              {isDownloading ? "Downloading..." : (
                <>
                  <DownloadIcon className="mr-2 h-4 w-4" />
                  Download
                </>
              )}
            </Button>
          </DialogFooter>
        </DialogContent>
      </Dialog>
    </>
  );
}
