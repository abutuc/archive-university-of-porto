import { FolderIcon } from "lucide-react";
import { DirectoryCardProps } from "../types/props";

export function DirectoryCard({
  directory,
  viewMode,
  onSelect,
}: DirectoryCardProps) {
  if (viewMode === "grid") {
    return (
      <div className="bg-white border border-gray-100 rounded-2xl shadow hover:shadow-lg transition cursor-pointer flex flex-col min-h-[220px] max-h-[220px]">
        <div
          className="flex-1 flex flex-col items-center justify-center"
          onClick={onSelect}
        >
          <FolderIcon className="h-12 w-12 mb-2 text-[#3D76F6]" />
          <span className="font-semibold text-gray-800">{directory.name}</span>
        </div>
      </div>
    );
  }

  return (
    <div className="flex items-center p-3 rounded-xl hover:bg-[#e9f1ff] bg-white shadow transition cursor-pointer">
      <FolderIcon className="mr-3 text-[#3D76F6]" onClick={onSelect} />
      <span onClick={onSelect} className="font-semibold flex-1 text-gray-700 truncate">{directory.name}</span>
    </div>
  );
}