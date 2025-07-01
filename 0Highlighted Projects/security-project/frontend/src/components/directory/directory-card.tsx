import { FolderIcon, TrashIcon, ShareIcon } from "lucide-react";
import { DirectoryCardProps } from "../types/props";

export function DirectoryCard({
  directory,
  viewMode,
  onSelect,
  onShare,
  onDelete,
}: DirectoryCardProps) {
  if (viewMode === "grid") {
    return (
      <div className="bg-white border border-gray-100 rounded-2xl shadow hover:shadow-lg transition cursor-pointer flex flex-col min-h-[220px] max-h-[220px] justify-between overflow-hidden">
        <div className="flex flex-col items-center py-8" onClick={onSelect}>
          <FolderIcon className="h-12 w-12 mb-2 text-[#3D76F6]" />
          <span className="font-semibold text-gray-800">{directory.name}</span>
        </div>
        <div className="flex border-t border-gray-100">
          {directory.name !== "public_html" && (
            <button className="flex-1 p-3 text-red-600 hover:bg-gray-50 transition" onClick={onDelete}>
              <TrashIcon className="h-5 w-5 mx-auto" />
            </button>
          )}
          <button className="flex-1 p-3 text-[#3D76F6] hover:bg-gray-50 transition" tabIndex={-1} onClick={onShare}>
            <ShareIcon className="h-5 w-5 mx-auto" />
          </button>
        </div>
      </div>
    );
  }

  return (
    <div className="flex items-center p-3 rounded-xl hover:bg-[#e9f1ff] bg-white shadow transition cursor-pointer">
      <FolderIcon className="mr-3 text-[#3D76F6]" onClick={onSelect} />
      <span onClick={onSelect} className="font-semibold flex-1 text-gray-700 truncate">{directory.name}</span>
      {directory.name !== "public_html" && (
        <button className="text-red-600 mx-2 hover:bg-gray-200 p-1 rounded" onClick={onDelete}><TrashIcon /></button>
      )}
      <button className="text-[#3D76F6] mx-1 hover:bg-gray-200 p-1 rounded" tabIndex={-1} onClick={onShare}><ShareIcon /></button>
    </div>
  );
}
