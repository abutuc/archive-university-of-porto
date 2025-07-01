// src/pages/Dashboard.jsx
import { useEffect, useState } from "react"
import { useNavigate } from "react-router-dom";
import { DashboardHeader } from "@/components/dashboard/header"
import { DashboardShell } from "@/components/dashboard/shell"
import { FileExplorer } from "@/components/file-explorer"
import { API_BASE_URL } from "@/config"

export default function Dashboard() {
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
      <DashboardHeader heading="Files" text="Manage your files and folders." />
      <div className="grid gap-4">
        <FileExplorer />
      </div>
    </DashboardShell>
  )
}
