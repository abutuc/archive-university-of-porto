"use client";

import type React from "react";

import { useState, useRef } from "react";
import { Progress } from "@/components/ui/progress";
import { UploadIcon } from "lucide-react";
import { cn } from "@/lib/utils";
import { API_BASE_URL } from "@/config";

interface FileCreate {
  name: string;
  storageName: string;
  mimeType: string;
  size: number;
  directoryId: string;
  ownerId: string;
}

interface FileUploaderProps {
  onUpload: (files: FileCreate[]) => void;
  currentDirectory: string;
}

export function FileUploader({
  onUpload,
  currentDirectory,
}: FileUploaderProps) {
  const [isDragging, setIsDragging] = useState(false);
  const [isUploading, setIsUploading] = useState(false);
  const [uploadProgress, setUploadProgress] = useState(0);
  const fileInputRef = useRef<HTMLInputElement>(null);

  const handleDragOver = (e: React.DragEvent<HTMLDivElement>) => {
    e.preventDefault();
    setIsDragging(true);
  };

  const handleDragLeave = () => {
    setIsDragging(false);
  };

  const handleDrop = (e: React.DragEvent<HTMLDivElement>) => {
    e.preventDefault();
    setIsDragging(false);
    if (e.dataTransfer.files) {
      handleFiles(e.dataTransfer.files);
    }
  };

  const handleFileInputChange = (e: React.ChangeEvent<HTMLInputElement>) => {
    if (e.target.files) {
      handleFiles(e.target.files);
    }
  };

  const handleFiles = async (fileList: FileList) => {
    setIsUploading(true);
    setUploadProgress(0);

    const filesArray = Array.from(fileList);

    for (const file of filesArray) {
      const formData = new FormData();
      formData.append("fileData", file); // key should match your DTO/form class
      formData.append("name", file.name);
      formData.append("mimeType", file.type);
      formData.append("directoryId", currentDirectory.toString());
      formData.append("size", file.size.toString());

      console.log("Uploading file:", file);
      console.log("Form data:", currentDirectory.toString());

      // Simulate progress (optional)
      setUploadProgress(10);

      try {
        const response = await fetch(`${API_BASE_URL}/files`, {
          method: "POST",
          body: formData,
          credentials: 'include',
        });

        await new Promise((resolve) => setTimeout(resolve, 300));
        setUploadProgress(80);
        if (!response.ok) {
          const error = await response.json();
          setIsUploading(false);
          setUploadProgress(0);
          return;
        }

        const uploadedFile = await response.json();

        await new Promise((resolve) => setTimeout(resolve, 300));
        setUploadProgress(100);



        // Optionally, notify parent
        onUpload([uploadedFile]);
      } catch (err: any) {
        console.error("Upload error:", err);
        setIsUploading(false);
        setUploadProgress(0);
        return;
      }
    }

    setIsUploading(false);
    setUploadProgress(0);
  };

  const getFileType = (mimeType: string): string => {
    if (mimeType.startsWith("image/")) return "image";
    if (mimeType.startsWith("video/")) return "video";
    if (mimeType.startsWith("audio/")) return "audio";
    if (
      mimeType.includes("pdf") ||
      mimeType.includes("document") ||
      mimeType.includes("text")
    )
      return "document";
    return "other";
  };

  const formatFileSize = (bytes: number): number => {
    if (bytes === 0) return 0;
    const k = 1024;
    //const sizes = ["Bytes", "KB", "MB", "GB"];
    const i = Math.floor(Math.log(bytes) / Math.log(k));
    return Number.parseInt((bytes / Math.pow(k, i)).toFixed(2));
  };

  return (
    <div
      id="file-upload"
      className={cn(
        "border-2 border-dashed rounded-2xl bg-white shadow-inner p-8 text-center transition-colors select-none cursor-pointer",
        isDragging ? "border-[#3D76F6] bg-[#f2f8ff]" : "border-gray-300! hover:border-[#3D76F6]/80!"
      )}
      onDragOver={handleDragOver}
      onDragLeave={handleDragLeave}
      onDrop={handleDrop}
      onClick={() => {
        // This will trigger the hidden input when the area is clicked
        if (!isUploading) fileInputRef.current?.click();
      }}
    >
      <input
        ref={fileInputRef}
        type="file"
        multiple
        className="hidden"
        onChange={handleFileInputChange}
      />
      <div className="flex flex-col items-center justify-center space-y-2">
        <UploadIcon className="h-10 w-10 text-[#3D76F6]" />
        <h3 className="font-semibold text-gray-800">Upload Files</h3>
        <p className="text-sm text-gray-500">Drag and drop files here or click to browse</p>
      </div>
      {isUploading && (
        <div className="mt-4 space-y-2">
          <Progress value={uploadProgress} className="h-2 w-full rounded-xl" />
          <p className="text-sm text-gray-400">Uploading... {uploadProgress}%</p>
        </div>
      )}
    </div>
  );
}

