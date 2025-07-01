import { defineConfig } from 'vite'
import react from '@vitejs/plugin-react'
import tailwindcss from '@tailwindcss/vite'
import path from "path"

// https://vite.dev/config/
export default defineConfig({
  base: "/",
  plugins: [tailwindcss(), react()],
  resolve: {
    alias: {
      "@": path.resolve(__dirname, "./src"),
    },
  },
  preview: {
    port: 80,
    strictPort: true,
  },
  server: {
    port: 80,
    strictPort: true,
    host: true,
    origin: "http://0.0.0.0:80",
    proxy: {
      '/api': 'http://backend:8080', // Use backend service name in Docker
    },
    watch: {
      usePolling: true,
      interval: 100,
    },
    allowedHosts: ['ses-drive.io'],
  },
})