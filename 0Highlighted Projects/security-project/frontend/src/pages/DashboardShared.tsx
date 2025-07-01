// src/pages/Dashboard.jsx
import { useEffect, useState } from "react"
import { useNavigate } from "react-router-dom";
import { API_BASE_URL } from "@/config"
import { DashboardHeader } from "@/components/dashboard/header"
import { DashboardShell } from "@/components/dashboard/shell"
import { SharedFileExplorer } from "@/components/shared-file-explorer"

export default function DashboardShared() {
  useEffect(() => {
    document.title = "Dashboard"
    // Optional: set meta description
    const metaDescription = document.querySelector('meta[name="description"]')
    if (metaDescription) {
      metaDescription.setAttribute("content", "Manage your files and folders")
    }
  }, [])

    const [user, setUser] = useState(undefined);
    const navigate = useNavigate();
  
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
            navigate("/login");
          }
        })
        .catch(() => {
          setUser(null);
          navigate("/login");
        });
    }, []);

  return (
    <DashboardShell>
      <DashboardHeader heading="Shared Files" text="Manage files and folders shared with you." />
      <div className="grid gap-4">
        <SharedFileExplorer />
      </div>
    </DashboardShell>
  )
}
