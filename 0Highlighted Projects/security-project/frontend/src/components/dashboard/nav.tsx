import { Link, useLocation } from "react-router-dom"
import { Button } from "@/components/ui/button"
import { FileIcon, ShareIcon, UploadIcon } from "lucide-react"

export function DashboardNav() {
  const { pathname } = useLocation();

  const navItems = [
    { title: "All Files", href: "/dashboard", icon: <FileIcon className="mr-2 h-5 w-5" /> },
    { title: "Shared with me", href: "/dashboard/shared", icon: <ShareIcon className="mr-2 h-5 w-5" /> }
  ];

  return (
    <nav className="flex flex-col gap-2">
      <Button
        variant="default"
        className="justify-start mb-5 bg-[#3D76F6] hover:bg-[#183657] text-white font-semibold rounded-xl shadow"
        onClick={() => document.getElementById("file-upload")?.click()}
      >
        <UploadIcon className="mr-2 h-5 w-5" />
        Upload Files
      </Button>
      {navItems.map((item) => (
        <Link key={item.href} to={item.href}>
          <span
            className={
              `flex items-center rounded-lg px-4 py-2 text-base font-medium transition
               ${pathname === item.href
                ? "bg-[#3D76F6]/10 text-[#3D76F6] font-bold"
                : "hover:bg-[#e9f1ff] text-gray-700"}`
            }
          >
            {item.icon}
            <span>{item.title}</span>
          </span>
        </Link>
      ))}
    </nav>
  );
}
