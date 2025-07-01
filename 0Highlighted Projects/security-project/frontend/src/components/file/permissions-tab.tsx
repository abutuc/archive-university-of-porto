import { useEffect, useState } from "react";
import { Button } from "@/components/ui/button";
import { SESUser } from "../types/types";
import { PermissionsTabProps } from "../types/props";
import { API_BASE_URL } from "@/config";

export function PermissionsTab({ 
  file, 
  onUpdatePermissions
 } : PermissionsTabProps) {
  const [users, setUsers] = useState<SESUser[]>([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState<string | null>(null);
  const [revoking, setRevoking] = useState<string | null>(null);

  useEffect(() => {
    setLoading(true);
    setError(null);
    fetch(`${API_BASE_URL}/files/${file.id}/permissions/users`, {
      credentials: 'include',
    })
      .then(async (res) => {
        if (!res.ok) throw new Error(await res.text());
        return res.json();
      })
      .then((data) => setUsers(data))
      .catch((err) => setError("No other users have access to this file."))
      .finally(() => setLoading(false));
  }, [file.id]);

  // Call this to revoke user
  const handleRevoke = async (email: string) => {
    setRevoking(email);
    await fetch(`${API_BASE_URL}/access/file/${file.id}`, {
      method: "DELETE",
      headers: {
        "Content-Type": "application/json",
      },
      credentials: 'include',
      body: JSON.stringify({ email }),
    });
    setUsers(users.filter((u) => u.email !== email));
    setRevoking(null);
    if (onUpdatePermissions) onUpdatePermissions();
  };

  if (loading) return <div className="p-4">Loading permissions...</div>;
  if (error)
    return <div className="text-muted-foreground text-center">{error}</div>;

  return (
    <div className="space-y-2 py-2">
      {users.length === 0 ? (
        <div className="text-muted-foreground text-center">
          No other users have access to this file.
        </div>
      ) : (
        <div className="space-y-3">
          {users.map((user) => (
            <div
              key={user.email}
              className="flex items-center justify-between border rounded-lg p-3 shadow-sm bg-gray-50"
            >
              <div>
                <div className="font-semibold">{user.name}</div>
                <div className="text-xs text-muted-foreground">
                  {user.email}
                </div>
                <div className="text-sm mt-1">
                  <span className="font-medium">Permissions: </span>
                  {user.permissions.map((perm, i) => (
                    <span
                      key={i}
                      className="inline-block px-2 py-0.5 rounded bg-blue-100 text-blue-700 mr-2 text-xs"
                    >
                      {perm}
                    </span>
                  ))}
                </div>
              </div>
              <Button
                variant="outline"
                size="sm"
                className="text-red-600 hover:bg-red-50"
                disabled={revoking === user.email}
                onClick={() => handleRevoke(user.email)}
              >
                {revoking === user.email ? "Revoking..." : "Revoke"}
              </Button>
            </div>
          ))}
        </div>
      )}
    </div>
  );
}
