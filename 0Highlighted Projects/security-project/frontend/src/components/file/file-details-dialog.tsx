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
import { formatDistanceToNow } from "date-fns";
import { PermissionsTab } from "@/components/permissions-tab";
import {
  FileIcon,
  ImageIcon,
  FileTextIcon,
  FileVideoIcon,
  FileMusicIcon,
  DownloadIcon,
  TrashIcon,
  ShareIcon,
  EditIcon,
} from "lucide-react";
import { API_BASE_URL } from "@/config";
import { formatFileSize } from "@/utils/Size";
import { FileEditModal } from "./file-edit-modal";

interface FileDetailsDialogProps {
  file: File;
  onClose: () => void;
  onDelete: () => void;
  onUpdatePermissions: (permissions: any) => void;
  onFileUpdated?: (file: File) => void;
}

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
  const [showShareDialog, setShowShareDialog] = useState(false);
  const [shareEmail, setShareEmail] = useState("");
  const [shareLoading, setShareLoading] = useState(false);
  const [shareError, setShareError] = useState("");
  const [shareSuccess, setShareSuccess] = useState(false);
  const [sharePermission, setSharePermission] = useState<
    "VIEW" | "EDIT" | "DELETE"
  >("VIEW");
  const [showEditModal, setShowEditModal] = useState(false);
  const [currentFile, setCurrentFile] = useState<FileWithPermission>(file);

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

  const handleFileDownload = (currentFile: File) => {
    const fetchFileDownload = async () => {
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
    };

    fetchFileDownload();
  };

  const handleShareFile = async () => {
    setShareLoading(true);
    setShareError("");
    setShareSuccess(false);

    try {
      const res = await fetch(
        `${API_BASE_URL}/access/${sharePermission}/file/${currentFile.id}`,
        {
          method: "POST",
          headers: {
            "Content-Type": "application/json",
          },
          body: JSON.stringify({ email: shareEmail }),
          credentials: 'include',
        }
      );

      if (!res.ok) {
        const errText = await res.text();
        throw new Error(errText || "Failed to share file");
      }
      setShareSuccess(true);
      setShareEmail("");
      setTimeout(() => setShowShareDialog(false), 1500);
    } catch (error: any) {
      setShareError(
        JSON.parse(error.message)["message"] || "Error sharing file"
      );
    } finally {
      setShareLoading(false);
    }
  };

  return (
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
                    currentFile.url || "/placeholder.svg?height=300&width=500"
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
              {/* <div>
                <h4 className="text-sm font-medium text-muted-foreground">Uploaded</h4>
                <p>{formatDistanceToNow(new Date(file.uploadedAt), { addSuffix: true })}</p>
              </div> */}
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

          <TabsContent value="permissions">
            <PermissionsTab
              file={currentFile}
              onUpdatePermissions={onUpdatePermissions}
            />
          </TabsContent>
        </Tabs>

        <DialogFooter className="flex justify-between items-center">
          <div className="flex gap-2 bg-white">
            <Button
              variant="outline"
              size="sm"
              className="hover:bg-gray-100"
              onClick={() => handleFileDownload(currentFile)}
            >
              <DownloadIcon className="mr-2 h-4 w-4" />
              Download
            </Button>
            <Button
              variant="outline"
              size="sm"
              className="hover:bg-gray-100"
              onClick={() => setShowShareDialog(true)}
            >
              <ShareIcon className="mr-2 h-4 w-4" />
              Share
            </Button>
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
          </div>
          <Button
            variant="default"
            onClick={handleClose}
            className="hover:bg-gray-100"
          >
            Close
          </Button>
        </DialogFooter>

        {showShareDialog && (
          <Dialog open={showShareDialog} onOpenChange={setShowShareDialog}>
            <DialogContent className="max-w-[400px] bg-white">
              <DialogHeader>
                <DialogTitle>Share File</DialogTitle>
              </DialogHeader>
              <div className="space-y-2 py-2">
                <label
                  htmlFor="share-permission"
                  className="block text-sm text-gray-700"
                >
                  Permission type:
                </label>
                <select
                  id="share-permission"
                  className="w-full border px-3 py-2 rounded focus:outline-none focus:ring mb-2"
                  value={sharePermission}
                  onChange={(e) =>
                    setSharePermission(
                      e.target.value as "VIEW" | "EDIT" | "DELETE"
                    )
                  }
                  disabled={shareLoading}
                >
                  <option value="VIEW">View</option>
                  <option value="EDIT">Edit</option>
                  <option value="DELETE">Delete</option>
                </select>
                <label
                  htmlFor="share-email"
                  className="block text-sm text-gray-700"
                >
                  Enter the email to share{" "}
                  <span className="font-bold">{currentFile.name}</span> with:
                </label>
                <input
                  id="share-email"
                  type="email"
                  placeholder="user@example.com"
                  value={shareEmail}
                  onChange={(e) => setShareEmail(e.target.value)}
                  className="w-full border px-3 py-2 rounded focus:outline-none focus:ring"
                  disabled={shareLoading}
                />
                {shareError && (
                  <p className="text-red-600 text-sm">{shareError}</p>
                )}
                {shareSuccess && (
                  <p className="text-green-600 text-sm">
                    File shared successfully!
                  </p>
                )}
              </div>
              <DialogFooter>
                <Button
                  variant="outline"
                  onClick={() => setShowShareDialog(false)}
                  disabled={shareLoading}
                >
                  Cancel
                </Button>
                <Button
                  variant="default"
                  onClick={handleShareFile}
                  disabled={!shareEmail || shareLoading}
                >
                  {shareLoading ? "Sharing..." : "Share"}
                </Button>
              </DialogFooter>
            </DialogContent>
          </Dialog>
        )}
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
  );
}
