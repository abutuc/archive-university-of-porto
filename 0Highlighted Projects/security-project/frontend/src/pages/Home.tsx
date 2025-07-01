// src/pages/Home.jsx
import { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";
import { AuthForm } from "@/components/auth-form";
import { API_BASE_URL } from "@/config";

export default function Home() {
  const navigate = useNavigate();
  const [user, setUser] = useState(undefined); 

  useEffect(() => {
    fetch(`${API_BASE_URL}/users/me`, {
      method: "GET",
      credentials: "include"
    })
      .then(async (res) => {
        if (res.ok) {
          const userData = await res.json();
          setUser(userData);
          navigate("/dashboard");
        } else {
          setUser(null);
        }
      })
      .catch(() => {
        setUser(null);
      });
  }, []);

  return (
    <div className="flex flex-col min-h-screen bg-gradient-to-br from-[#3D76F6]/5 via-[#99BCFF]/10 to-white">
      {/* Hero Section */}
      <main className="flex-1 flex flex-col justify-center">
        <section className="w-full flex flex-col items-center justify-center py-12 px-4">
          {/* Logo and App Name */}
          <div className="flex flex-col items-center mb-8">
            <img
              src="/ses_logo.svg"
              alt="SES Logo"
              className="h-16 w-auto mb-2 drop-shadow-md"
            />
            <span className="text-2xl sm:text-3xl font-bold tracking-tight text-[#183657]">
              <span className="font-semibold text-[#3D76F6]">Secure Encrypted Storage</span>
            </span>
            {/* Optional divider for style */}
            <div className="w-20 h-1 bg-[#3D76F6] rounded-full mt-2 mb-2 opacity-25"></div>
          </div>
          {/* Hero Content (2-column on desktop, stacked on mobile) */}
          <div className="w-full max-w-6xl flex flex-col lg:flex-row items-center justify-center gap-12">
            {/* Hero Text */}
            <div className="flex-1 max-w-lg w-full flex flex-col items-center lg:items-start text-center lg:text-left">
              <h1 className="text-4xl sm:text-5xl font-bold tracking-tight text-gray-900">
                Store and share your <span className="text-[#3D76F6]">files securely</span>
              </h1>
              <p className="mt-4 text-lg text-gray-600">
                Manage, share, and store your files with advanced security. Control who can view and edit, with flexible permissions.
              </p>
              <div className="mt-6 flex flex-col sm:flex-row gap-3 justify-center lg:justify-start">
                <a
                  href="#features"
                  className="inline-flex items-center justify-center px-8 py-2 bg-[#3D76F6] text-white rounded-2xl font-semibold shadow-md hover:bg-[#2550a3] transition"
                >
                  View Features
                </a>
              </div>
            </div>
            {/* Login Card */}
            <div className="flex-1 max-w-md w-full">
              <AuthForm />
            </div>
          </div>
        </section>

        {/* Features Section */}
        <section id="features" className="bg-[#f8fbff] py-16">
          <div className="container mx-auto px-4">
            <div className="mb-12 text-center space-y-3">
              <h2 className="text-3xl sm:text-4xl font-bold text-[#3D76F6]">Key Features</h2>
              <p className="text-gray-600 max-w-2xl mx-auto">
                Our platform gives you everything you need to manage your files with total security and simplicity.
              </p>
            </div>
            <div className="grid gap-8 md:grid-cols-3 max-w-5xl mx-auto">
              <FeatureCard
                title="Advanced Organization"
                description="Create folders and use the search feature to easily find your files."
                icon={
                  <svg className="w-7 h-7" fill="none" stroke="currentColor" strokeWidth={2} viewBox="0 0 24 24">
                    <rect width="18" height="18" x="3" y="3" rx="3" />
                    <path d="M7 8h10M7 12h10M7 16h10" />
                  </svg>
                }
                color="bg-[#99BCFF]"
              />
              <FeatureCard
                title="Secure Cloud Storage"
                description="Files are encrypted and safely stored, always protected and available."
                icon={
                  <svg className="w-7 h-7" fill="none" stroke="currentColor" strokeWidth={2} viewBox="0 0 24 24">
                    <path d="M12 22s8-4 8-10V5l-8-3-8 3v7c0 6 8 10 8 10" />
                  </svg>
                }
                color="bg-[#3D76F6]/20"
              />
              <FeatureCard
                title="Permission Management"
                description="Easily decide who can view, edit or delete each file or directory, with granular control."
                icon={
                  <svg className="w-7 h-7" fill="none" stroke="currentColor" strokeWidth={2} viewBox="0 0 24 24">
                    <path d="M14 9V5a3 3 0 0 0-3-3l-4 9v11h11.28a2 2 0 0 0 2-1.7l1.38-9a2 2 0 0 0-2-2.3H14Z" />
                    <path d="M7 22V11" />
                  </svg>
                }
                color="bg-[#3D76F6]/10"
              />
            </div>
          </div>
        </section>
      </main>

      {/* Footer */}
      <footer className="bg-white/70 border-t flex flex-col sm:flex-row items-center justify-between px-6 py-5 text-xs text-gray-500">
        <div>
          © 2025 Secure File Storage. All rights reserved.
        </div>
        <nav className="flex gap-6 mt-3 sm:mt-0">
          <a className="hover:underline" href="#">Terms of Service</a>
          <a className="hover:underline" href="#">Privacy Policy</a>
        </nav>
      </footer>
    </div>
  );
}

function FeatureCard({ 
  title, 
  description, 
  icon, 
  color 
}: FeatureCardProps) {
  return (
    <div className={`rounded-2xl shadow-lg p-7 flex flex-col items-center text-center border border-gray-200 ${color}`}>
      <div className="mb-3 rounded-full p-4 bg-white shadow flex items-center justify-center">{icon}</div>
      <h3 className="font-bold text-lg text-gray-900">{title}</h3>
      <p className="text-sm text-gray-500 mt-2">{description}</p>
    </div>
  );
}

