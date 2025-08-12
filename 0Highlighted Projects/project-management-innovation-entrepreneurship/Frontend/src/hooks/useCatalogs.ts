// hooks/useCatalogs.ts
import { useEffect, useState } from "react";
import { CatalogItem } from "../types/Catalog";
import { useAuth } from "../auth/AuthContext";
import { API_BASE_URL } from "../config";

const endpoints = [
  "companies",
  "directions",
  "units",
  "offices",
  "employee_types",
  "document_types",
  "travel_types",
  "expenditure_types",
] as const;

type Endpoint = (typeof endpoints)[number];

// Cache duration in milliseconds (1 hour)
const CACHE_DURATION = 1 * 60 * 60 * 1000;
const CACHE_KEY = 'app_catalogs_cache';

interface CacheData {
  timestamp: number;
  data: Partial<Record<Endpoint, CatalogItem[]>>;
}

export function useCatalogs() {
  const [data, setData] = useState<Partial<Record<Endpoint, CatalogItem[]>>>({});
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState<string | null>(null);
  const { backendAccessToken } = useAuth();

  useEffect(() => {
    const loadCachedData = () => {
      try {
        // Try to load data from localStorage
        const cachedDataString = localStorage.getItem(CACHE_KEY);
        if (!cachedDataString) return null;
        
        const cachedData: CacheData = JSON.parse(cachedDataString);
        
        // Check if cache is still valid
        const isExpired = Date.now() - cachedData.timestamp > CACHE_DURATION;
        if (isExpired) return null;
        
        return cachedData.data;
      } catch (err) {
        console.error('Error accessing cache:', err);
        return null;
      }
    };

    const saveDataToCache = (data: Partial<Record<Endpoint, CatalogItem[]>>) => {
      try {
        const cacheData: CacheData = {
          timestamp: Date.now(),
          data: data
        };
        localStorage.setItem(CACHE_KEY, JSON.stringify(cacheData));
      } catch (err) {
        console.error('Error saving to cache:', err);
      }
    };

    const fetchFromAPI = async () => {
      setLoading(true);
      try {
        const results = await Promise.all(
          endpoints.map(async (endpoint) => {
            const res = await fetch(`${API_BASE_URL}/catalogs/${endpoint}`, {
              headers: {
                "Content-Type": "application/json",
                Authorization: `Bearer ${backendAccessToken}`,
              },
            });
            if (!res.ok) throw new Error(`Failed to fetch ${endpoint}`);
            const json: CatalogItem[] = await res.json();
            return [endpoint, json] as const;
          })
        );

        const newData = Object.fromEntries(results);
        setData(newData);
        setLoading(false);
        
        // Save fresh data to cache
        saveDataToCache(newData);
      } catch (err: any) {
        setError(err.message);
        setLoading(false);
      }
    };

    // Try to load from cache first
    const cachedData = loadCachedData();
    
    if (cachedData) {
      // Use cached data immediately
      setData(cachedData);
      setLoading(false);
    } else {
      // No valid cache, fetch from API
      fetchFromAPI();
    }
  }, [backendAccessToken]);

  return { catalogs: data, loading, error };
}