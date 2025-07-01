"use client";

import { useState } from "react";
import {
  MoreHorizontalIcon,
  FileIcon,
  ImageIcon,
  FileTextIcon,
  FileVideoIcon,
  FileMusicIcon,
  DownloadIcon,
  EditIcon,
  TrashIcon,
} from "lucide-react";
import { Button } from "@/components/ui/button";
import {
  DropdownMenu,
  DropdownMenuContent,
  DropdownMenuItem,
  DropdownMenuTrigger,
} from "@/components/ui/dropdown-menu";
import { FileCardProps } from "../types/props";
import { API_BASE_URL } from "@/config";

export function FileCard({
  file,
  viewMode,
  onSelect,
  onDelete,
}: FileCardProps) {
  const [isHovered, setIsHovered] = useState(false);

  // Get file icon based on type
const getFileIcon = () => {
    const type = file.mimeType?.toLowerCase();
    const name = file.name?.toLowerCase();

    // Images
    if (type?.startsWith("image/")) return <ImageIcon className="h-7 w-7" />;
    // Video
    if (type?.startsWith("video/")) return <FileVideoIcon className="h-7 w-7" />;
    // Audio
    if (type?.startsWith("audio/")) return <FileMusicIcon className="h-7 w-7" />;

    // PDF
    if (type === "application/pdf" || name.endsWith(".pdf"))
      return <FileTextIcon className="h-7 w-7 text-red-500" />;

    // Word Docs
    if (
      type?.includes("msword") ||
      type?.includes("officedocument.word") ||
      name.endsWith(".doc") || name.endsWith(".docx")
    )
      return <FileTextIcon className="h-7 w-7 text-blue-600" />;

    // Excel
    if (
      type?.includes("officedocument.spreadsheet") ||
      name.endsWith(".xls") || name.endsWith(".xlsx") || name.endsWith(".csv")
    )
      return <FileSpreadsheetIcon className="h-7 w-7 text-green-600" />;

    // PowerPoint
    if (
      type?.includes("officedocument.presentation") ||
      name.endsWith(".ppt") || name.endsWith(".pptx")
    )
      return <FileSymlinkIcon className="h-7 w-7 text-orange-600" />;

    // Code files: HTML, CSS, JS, PY, JAVA, C, CPP, JSON, etc.
    if (
      name.endsWith(".html") || name.endsWith(".htm") ||
      name.endsWith(".css") || name.endsWith(".js") ||
      name.endsWith(".ts") || name.endsWith(".jsx") || name.endsWith(".tsx") ||
      name.endsWith(".py") || name.endsWith(".java") || name.endsWith(".c") ||
      name.endsWith(".cpp") || name.endsWith(".cs") || name.endsWith(".rb") ||
      name.endsWith(".go") || name.endsWith(".php") || name.endsWith(".rs")
    )
      return <FileCodeIcon className="h-7 w-7 text-purple-600" />;

    // JSON, YAML, XML
    if (
      name.endsWith(".json") || type === "application/json"
    )
      return <FileJsonIcon className="h-7 w-7 text-orange-500" />;

    if (
      name.endsWith(".xml") || name.endsWith(".yaml") || name.endsWith(".yml")
    )
      return <FileType2Icon className="h-7 w-7 text-yellow-500" />;

    // Archives
    if (
      name.match(/\.(zip|rar|tar|gz|7z)$/)
    )
      return <FileArchiveIcon className="h-7 w-7 text-yellow-600" />;

    // Plain text and Markdown
    if (
      type === "text/plain" || name.endsWith(".txt") || name.endsWith(".md")
    )
      return <FileTextIcon className="h-7 w-7 text-gray-500" />;

    // Fallback
    return <FileIcon className="h-7 w-7 text-[#3D76F6]" />;
  };

  const handleFileDownload = (file: File) => {
    const fetchFileDownload = async () => {
      try {
        const res = await fetch(`${API_BASE_URL}/files/${file.id}/download`, {
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
            `Failed to fetch files: ${errText} (Status: ${res.status})`
          );
        }

        const blob = await res.blob();
        const url = window.URL.createObjectURL(blob);
        const a = document.createElement("a");
        a.href = url;
        a.download = file.name;
        document.body.appendChild(a);
        a.click();
        a.remove();
        window.URL.revokeObjectURL(url);

        console.log("File downloaded:", file.name);
      } catch (error) {
        console.log(error);
      }
    };

    fetchFileDownload();
  };

  if (viewMode === "grid") {
    return (
      <div
        className={`
          bg-[#f6f9ff] border border-gray-100 rounded-2xl shadow-sm hover:shadow-md transition cursor-pointer flex flex-col h-[220px] min-w-0
        `}
        onClick={onSelect}
        onMouseEnter={() => setIsHovered(true)}
        onMouseLeave={() => setIsHovered(false)}
      >
        {/* Icon center (never stretched) */}
        <div className="flex-1 flex items-center justify-center">
          <div className="text-[2.1rem]">{getFileIcon()}</div>
        </div>
        {/* Bottom bar with name & menu */}
        <div className="w-full border-t border-gray-100 bg-white rounded-b-2xl flex items-center justify-between px-3 py-2 min-h-[44px]">
          <span className="font-medium text-gray-700 truncate max-w-[110px]" title={file.name}>
            {file.name}
          </span>
          <DropdownMenu>
            <DropdownMenuTrigger asChild onClick={e => e.stopPropagation()}>
              <Button variant="ghost" size="icon" className="h-8 w-8">
                <MoreHorizontalIcon className="h-5 w-5" />
              </Button>
            </DropdownMenuTrigger>
            <DropdownMenuContent align="end">
              <DropdownMenuItem onClick={e => { e.stopPropagation(); /* Your detail or view logic */ }}>
                View Details
              </DropdownMenuItem>
              <DropdownMenuItem onClick={(e) => {
                    e.stopPropagation();
                    handleFileDownload(file);
                  }}>
                <DownloadIcon className="mr-2 h-4 w-4" />
                Download
              </DropdownMenuItem>
              {file.permission === "EDIT" && (
                <DropdownMenuItem className="text-grey-600" onClick={e => { e.stopPropagation(); onSelect(); }}>
                  <EditIcon className="mr-2 h-4 w-4" />
                  Edit
                </DropdownMenuItem>
              )}
              {file.permission === "DELETE" && (
                <>
                  <DropdownMenuItem className="text-grey-600" onClick={e => { e.stopPropagation(); onSelect(); }}>
                    <EditIcon className="mr-2 h-4 w-4" />
                    Edit
                  </DropdownMenuItem>
                  <DropdownMenuItem className="text-red-600" onClick={e => { e.stopPropagation(); onDelete(); }}>
                    <TrashIcon className="mr-2 h-4 w-4" />
                    Delete
                  </DropdownMenuItem>
                </>
              )}
            </DropdownMenuContent>
          </DropdownMenu>
        </div>
      </div>
    );
  }

  return (
    <div className="flex items-center p-3 rounded-xl hover:bg-[#e9f1ff] bg-white shadow transition cursor-pointer" onClick={onSelect}>
      <div className="mr-3 text-[#3D76F6]">{getFileIcon()}</div>
      <span className="flex-1 text-gray-700 truncate">{file.name}</span>
      <DropdownMenu>
        <DropdownMenuTrigger asChild onClick={e => e.stopPropagation()}>
          <Button variant="ghost" size="icon" className="h-8 w-8"><MoreHorizontalIcon className="h-5 w-5" /></Button>
        </DropdownMenuTrigger>
          <DropdownMenuContent align="end">
            <DropdownMenuItem onClick={(e) => {
                    e.stopPropagation();
                    handleFileDownload(file);
                  }}>
              <DownloadIcon className="mr-2 h-4 w-4" />
              Download
            </DropdownMenuItem>
            {file.permission == "DELETE" && (
              <DropdownMenuItem
                className="text-red-600"
                onClick={(e) => {
                  e.stopPropagation();
                  onDelete();
                }}
              >
                <TrashIcon className="mr-2 h-4 w-4" />
                Delete
              </DropdownMenuItem>
            )}
          </DropdownMenuContent>
        </DropdownMenu>
    </div>
  );
}
