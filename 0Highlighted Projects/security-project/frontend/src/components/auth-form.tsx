import { useState } from "react";
import { useNavigate } from "react-router-dom";
import { GoogleLogin } from "@react-oauth/google";
import { Tabs, TabsContent, TabsList, TabsTrigger } from "@/components/ui/tabs";
import { useAuth } from "@/auth/AuthContext";

export function AuthForm() {
  const [isLoading, setIsLoading] = useState(false);
  const navigate = useNavigate();
  const { login } = useAuth();

  const handleGoogleSuccess = async (credentialResponse: any) => {
    const credential = credentialResponse?.credential;
    if (credential) {
      setIsLoading(true);
      try {
        await login(credential); // <--- await here!
        navigate("/dashboard");
      } catch (error) {
        console.error("Login failed:", error);
      } finally {
        setIsLoading(false);
      }
    }
  };

  const handleGoogleFailure = () => {
    console.error("Google login failed");
    setIsLoading(false);
  };

  return (
    <Tabs defaultValue="login" className="w-full">
      <TabsContent value="login">
        <div className="p-8 bg-white border border-gray-200 rounded-2xl shadow-xl flex flex-col items-center space-y-6">
          <img src="/ses_logo.svg" alt="SES Logo" className="h-10 mb-2" />
          <p className="text-base text-gray-600 font-medium">
            Sign in with your Google account to access your secure cloud storage.
          </p>
          <div className="w-full flex justify-center">
            <GoogleLogin
              onSuccess={handleGoogleSuccess}
              onError={handleGoogleFailure}
              useOneTap
              theme="outline"
              size="large"
              shape="pill"
            />
          </div>
          {isLoading && (
            <div className="text-xs text-[#3D76F6] font-semibold animate-pulse">Authenticating...</div>
          )}
        </div>
      </TabsContent>
    </Tabs>
  );
}
