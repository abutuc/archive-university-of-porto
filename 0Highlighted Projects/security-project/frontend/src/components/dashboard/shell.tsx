import type React from "react"
import { DashboardNav } from "@/components/dashboard/nav"
import { UserNav } from "@/components/user-nav"

export function DashboardShell({
  children 
} : { 
  children: React.ReactNode
}) {
  return (
    <div className="flex min-h-screen flex-col bg-gradient-to-br from-[#e9f1ff] via-[#f8fbff] to-white">
      {/* Main app header */}
      <header className="sticky top-0 z-40 border-b bg-white/90 backdrop-blur flex items-center px-0 md:px-8 shadow-sm">
        <div className="flex items-center gap-3 h-20 w-full max-w-7xl mx-auto px-6">
          <img src="/ses_logo.svg" alt="SES Logo" className="h-6 w-auto" />
          <span className="text-xl font-bold text-[#183657] tracking-tight">
            <span className="text-[#3D76F6] font-semibold">Secure Encrypted Storage</span>
          </span>
          <div className="ml-auto">
            <UserNav />
          </div>
        </div>
      </header>
      <div className="flex flex-1 w-full max-w-7xl mx-auto gap-6 px-4 sm:px-8 py-8">
        {/* Sidebar */}
        <aside className="hidden md:flex flex-col w-56 pt-8">
          <DashboardNav />
        </aside>
        {/* Main content */}
        <main className="flex-1">
          <div className="space-y-8">{children}</div>
        </main>
      </div>
    </div>
  );

}
