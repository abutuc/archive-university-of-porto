import { useState } from "react";
import {
  Dialog,
  DialogContent,
  DialogHeader,
  DialogTitle,
  DialogFooter,
} from "@/components/ui/dialog";
import { Button } from "@/components/ui/button";
import { Input } from "@/components/ui/input";
import { API_BASE_URL } from "@/config";

export function FileEditModal({
  open,
  onClose,
  file,
  onSuccess,
  onFileUpdated,
}) {
  const [newName, setNewName] = useState(file.name);
  const [newFile, setNewFile] = useState<File | null>(null);
  const [loading, setLoading] = useState(false);

  // Handle file input change
  const handleFileChange = (e: React.ChangeEvent<HTMLInputElement>) => {
    if (e.target.files && e.target.files[0]) {
      const fileSelected = e.target.files[0];
      if (fileSelected.type !== file.mimeType) {
        // Don't allow setting the file
        e.target.value = ""; // Clear the input (optional, but nice UX)
        setNewFile(null);
        return;
      }
      setNewFile(fileSelected);
    }
  };

  // Handle save (calls the endpoints)
  const handleSave = async () => {
    setLoading(true);

    let success = false;

    // 1. If filename changed, call the name update endpoint
    if (newName !== file.name) {
      const res = await fetch(`${API_BASE_URL}/files/${file.id}/name`, {
        method: "PUT",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify({ name: newName }),
        credentials: 'include',
      });
      if (!res.ok) {
        setLoading(false);
        return;
      }
      success = true;
    }

    // 2. If file content is updated, call the file update endpoint (multipart)
    if (newFile) {
      const formData = new FormData();
      formData.append("fileData", newFile);
      formData.append("name", newName);
      formData.append("mimeType", newFile.type);
      formData.append("directoryId", file.directoryId);
      formData.append("size", newFile.size.toString());

      const res = await fetch(`${API_BASE_URL}/files/${file.id}`, {
        method: "PUT",
        credentials: 'include',
        body: formData,
      });
      if (!res.ok) {
        setLoading(false);
        return;
      }
      success = true;
    }

    setLoading(false);
    if (success) {
      // Pass the updated info back up:
      onFileUpdated && onFileUpdated({ ...file, name: newName });
      onSuccess && onSuccess();
      onClose();
    }
  };

  return (
    <Dialog open={open} onOpenChange={onClose}>
      <DialogContent className="bg-white max-w-md">
        <DialogHeader>
          <DialogTitle>Edit File</DialogTitle>
        </DialogHeader>
        <div className="space-y-4 py-2">
          <label className="block text-sm text-gray-700">
            File Name
            <Input
              value={newName}
              onChange={(e) => setNewName(e.target.value)}
              disabled={loading}
              className="mt-1"
            />
          </label>
          <label className="block text-sm text-gray-700">
            New File Content (optional)
            <Input
              type="file"
              onChange={handleFileChange}
              accept={file.mimeType} // restrict browser picker if possible
              disabled={loading}
              className="mt-1"
            />
            <div className="text-xs text-muted-foreground mt-1">
              {`Only "${file.mimeType}" files allowed.`}
            </div>
            {newFile && (
              <div className="text-xs text-muted-foreground mt-1">
                {newFile.name}
              </div>
            )}
          </label>
        </div>
        <DialogFooter>
          <Button variant="outline" onClick={onClose} disabled={loading}>
            Cancel
          </Button>
          <Button
            variant="default"
            onClick={handleSave}
            disabled={loading || (!newFile && newName === file.name)}
          >
            {loading ? "Saving..." : "Save"}
          </Button>
        </DialogFooter>
      </DialogContent>
    </Dialog>
  );
}
