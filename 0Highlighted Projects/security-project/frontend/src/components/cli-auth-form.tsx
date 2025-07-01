import { useState } from "react";
import { useNavigate } from "react-router-dom";
import { GoogleLogin } from "@react-oauth/google";

export function CliLoginForm() {
  const [isLoading, setIsLoading] = useState(false);
  const [posted, setPosted] = useState(false);
  const navigate = useNavigate();

  // 1. Extract state param from the URL
  const state = new URLSearchParams(window.location.search).get("state");

  const handleGoogleSuccess = (credentialResponse: any) => {
    const credential = credentialResponse?.credential;
    if (credential && state) {
      setIsLoading(true);
      fetch("https://ses-drive.io/terminal", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({ token: credential, state }),
      }).then(() => {
        setPosted(true);
        navigate("/cli-complete");
      }).catch(() => {
        // Show an error if POST fails (e.g. CLI not running)
        alert("Could not contact CLI. Is it running?");
      }).finally(() => setIsLoading(false));
    }
  };

  const handleGoogleFailure = () => {
    alert("Google login failed. Please try again.");
  };

  return (
    <div className="p-8 flex flex-col items-center">
      <h1 className="text-xl font-bold mb-4">CLI Google Login</h1>
      <p className="mb-4 text-gray-600">
        Sign in with your Google account to authenticate the CLI.
      </p>
      <GoogleLogin
        onSuccess={handleGoogleSuccess}
        onError={handleGoogleFailure}
        useOneTap
        width="300"
      />
      {isLoading && <p className="mt-4 text-blue-600">Logging in, please wait…</p>}
      {posted && <p className="mt-4 text-green-700">Login complete! You may now return to your CLI.</p>}
    </div>
  );
}
