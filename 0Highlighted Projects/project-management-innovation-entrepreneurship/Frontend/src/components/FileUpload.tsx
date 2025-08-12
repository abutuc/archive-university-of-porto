import React, { useRef } from "react";
import { TrashBinIcon } from "../assets/icons";

import { FileIcon } from "../assets/icons";
import Button from "./Button";
import { t } from "i18next";

interface FileUploadProps {
  files: File[] | undefined;
  visibleAttachments?: string[];
  onAddFiles: (files: FileList, index: number) => void;
  onRemoveFile: (fileIndex: number, index: number) => void;
  index: number;
}

const FileUpload: React.FC<FileUploadProps> = ({
  files,
  onAddFiles,
  onRemoveFile,
  index,
  visibleAttachments,
}) => {
  const fileInputRef = useRef<HTMLInputElement | null>(null);

  const handleFileChange = (e: React.ChangeEvent<HTMLInputElement>) => {
    if (e.target.files) {
      onAddFiles(e.target.files, index);
    }
  };

  return (
    <div className="space-y-3">
      <label className="block text-sm font-medium text-gray-700 text-center">
        {t("upload_receipt")}
      </label>

      <div className="flex items-center justify-center gap-3">
        <Button
          size="sm"
          variant="outline"
          onClick={() => fileInputRef.current?.click()}
          endIcon={<FileIcon className="w-4 h-4" />}
        >
          {t("add_files")}
        </Button>
        <input
          type="file"
          multiple
          className="hidden"
          ref={fileInputRef}
          onChange={handleFileChange}
        />
      </div>

      {visibleAttachments
        ? visibleAttachments.length > 0 && (
            <ul className="space-y-2">
              {visibleAttachments.map((name, fileIndex) => (
                <li
                  key={fileIndex}
                  className="flex items-center justify-between rounded-md border border-gray-300 dark:border-gray-700 bg-white dark:bg-gray-800 px-4 py-2 shadow-sm text-sm text-gray-800 dark:text-white"
                >
                  <span className="truncate">{name}</span>
                  <button
                    onClick={() => onRemoveFile(fileIndex, index)}
                    className="ml-3 text-red-600 hover:text-red-800 dark:text-red-400"
                    title="Remove"
                  >
                    <TrashBinIcon className="w-4 h-4" />
                  </button>
                </li>
              ))}
            </ul>
          )
        : files &&
          files.length > 0 && (
            <ul className="space-y-2">
              {files.map((file, fileIndex) => (
                <li
                  key={fileIndex}
                  className="flex items-center justify-between rounded-md border border-gray-300 dark:border-gray-700 bg-white dark:bg-gray-800 px-4 py-2 shadow-sm text-sm text-gray-800 dark:text-white"
                >
                  <span className="truncate">{file.name}</span>
                  <button
                    onClick={() => onRemoveFile(fileIndex, index)}
                    className="ml-3 text-red-600 hover:text-red-800 dark:text-red-400"
                    title="Remove"
                  >
                    <TrashBinIcon className="w-4 h-4" />
                  </button>
                </li>
              ))}
            </ul>
          )}
    </div>
  );
};

export default FileUpload;
