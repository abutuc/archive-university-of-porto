"use client";

import { useEffect, useState } from "react";
import {
  Dialog,
  DialogContent,
  DialogHeader,
  DialogTitle,
  DialogFooter,
} from "@/components/ui/dialog";
import { Button } from "@/components/ui/button";
import { Input } from "@/components/ui/input";
import { Tabs, TabsContent, TabsList, TabsTrigger } from "@/components/ui/tabs";
import { API_BASE_URL } from "@/config";
import { DirectoryPermissionsTab } from "../permissions-tab-directory";

// Directory Permissions type for tab
type DirectoryPermission = {
  id: string;
  name: string;
  email: string;
  permissions: ("VIEW" | "EDIT" | "DELETE")[];
};

interface DirectoryShareModalProps {
  open: boolean;
  onClose: () => void;
  directoryId: string;
}

export function DirectoryShareModal({
  open,
  onClose,
  directoryId,
}: DirectoryShareModalProps) {
  const [email, setEmail] = useState("");
  const [permission, setPermission] = useState<"VIEW" | "EDIT" | "DELETE">(
    "VIEW"
  );
  const [loading, setLoading] = useState(false);
  const [error, setError] = useState("");
  const [success, setSuccess] = useState(false);
  const [permissionsTab, setPermissionsTab] = useState<DirectoryPermission[]>(
    []
  );
  const [loadingPermissions, setLoadingPermissions] = useState(false);
  const [permissionsError, setPermissionsError] = useState("");
  const [activeTab, setActiveTab] = useState<"share" | "permissions">("share");

  // Fetch current directory permissions on open
  useEffect(() => {
    if (!open) return;
    setLoadingPermissions(true);
    fetch(`${API_BASE_URL}/directories/${directoryId}/permissions/users`, {
      credentials: 'include',
    })
      .then(async (res) => {
        if (!res.ok) throw new Error(await res.text());
        return res.json();
      })
      .then((data) => {
        setPermissionsTab(data);
        setPermissionsError("");
      })
      .catch((err) => setPermissionsError("Failed to load permissions"))
      .finally(() => setLoadingPermissions(false));
  }, [open, directoryId, success]); // refetch after share

  // Share Directory
  const handleShare = async () => {
    setLoading(true);
    setError("");
    setSuccess(false);
    try {
      const res = await fetch(
        `${API_BASE_URL}/access/${permission}/directory/${directoryId}`,
        {
          method: "POST",
          headers: {
            "Content-Type": "application/json",
          },
          body: JSON.stringify({ email }),
          credentials: 'include',
        }
      );
      if (!res.ok) {
        const errText = await res.text();
        setError(JSON.parse(errText).message || "Failed to share directory");
        setLoading(false);
        return;
      }
      setSuccess(true);
      setEmail("");
      setTimeout(() => {
        setSuccess(false);
        // Don't auto-close, user may want to share again or check permissions
      }, 1200);
    } catch (e) {
      setError("Failed to share directory");
    }
    setLoading(false);
  };

 return (
    <Dialog open={open} onOpenChange={onClose}>
      <DialogContent className="max-w-[600px] bg-white rounded-2xl shadow-xl">
        <DialogHeader>
          <DialogTitle>Share Directory</DialogTitle>
        </DialogHeader>

        <Tabs
          defaultValue={activeTab}
          onValueChange={(v) => setActiveTab(v as any)}
        >
          <TabsList className="w-full mb-2 grid grid-cols-2">
            <TabsTrigger value="share">Share</TabsTrigger>
            <TabsTrigger value="permissions">Permissions</TabsTrigger>
          </TabsList>

          <TabsContent value="share">
            <div className="space-y-2 py-2">
              <label className="block text-sm text-gray-700">
                Permission type:
              </label>
              <select
                className="w-full border px-3 py-2 rounded focus:outline-none focus:ring mb-2"
                value={permission}
                onChange={(e) =>
                  setPermission(e.target.value as "VIEW" | "EDIT" | "DELETE")
                }
                disabled={loading}
              >
                <option value="VIEW">View</option>
                <option value="EDIT">Edit</option>
                <option value="DELETE">Delete</option>
              </select>
              <label className="block text-sm text-gray-700">
                Enter the email to share with:
              </label>
              <Input
                type="email"
                placeholder="user@example.com"
                value={email}
                onChange={(e) => setEmail(e.target.value)}
                disabled={loading}
              />
              {error && <p className="text-red-600 text-sm">{error}</p>}
              {success && (
                <p className="text-green-600 text-sm">
                  Directory shared successfully!
                </p>
              )}
            </div>
            <DialogFooter>
              <Button variant="outline" onClick={onClose} disabled={loading}>
                Cancel
              </Button>
              <Button
                variant="default"
                onClick={handleShare}
                disabled={!email || loading}
              >
                {loading ? "Sharing..." : "Share"}
              </Button>
            </DialogFooter>
          </TabsContent>

          <TabsContent value="permissions">
            <DirectoryPermissionsTab directoryId={directoryId} />
          </TabsContent>
        </Tabs>
      </DialogContent>
    </Dialog>
  );
}
