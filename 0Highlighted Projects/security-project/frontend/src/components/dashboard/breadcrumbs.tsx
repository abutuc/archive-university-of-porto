import { BreadcrumbsProps } from "../types/props";

export function Breadcrumbs({
  path,
  setCurrentDirectory,
} : BreadcrumbsProps) {

  return (
    <nav className="mb-3 flex items-center text-gray-400 text-sm flex-wrap">
      {path.map((dir, idx) => (
        <span key={dir.id} className="flex items-center">
          {idx !== 0 && <span className="mx-2 text-gray-300 font-bold">/</span>}
          <button
            onClick={() => setCurrentDirectory(dir.id)}
            className={`transition font-medium hover:underline ${idx === path.length - 1
              ? "text-gray-700 cursor-default"
              : "text-[#3D76F6]"
              }`}
            disabled={idx === path.length - 1}
          >
            {dir.name === "" ? "Home" : dir.name}
          </button>
        </span>
      ))}
    </nav>
  );
}

export default Breadcrumbs;