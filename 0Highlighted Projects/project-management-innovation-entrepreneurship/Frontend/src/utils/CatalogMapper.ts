import { CatalogItem } from "../types/Catalog";

export function mapToOptions(
  items: CatalogItem[] = [],
  lang: string
): { value: string; label: string }[] {
  return items.map((item) => ({
    value: item.id,
    label: lang === "pt" ? item.pt_label : item.en_label,
  }));
}
