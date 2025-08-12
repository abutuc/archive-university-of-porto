import React, {
  createContext,
  useContext,
  useState,
  ReactNode,
  useEffect,
} from "react";
import { useMsal, useAccount } from "@azure/msal-react";
import {
  AuthenticationResult,
  InteractionRequiredAuthError,
} from "@azure/msal-browser";
import { jwtDecode } from "jwt-decode";

interface AuthContextType {
  login: () => Promise<void>;
  name: string | null;
  id: string | null;
  jobTitle: string | null;
  backendAccessToken: string | null;
  acquireBackendToken: () => Promise<string>;
  isTokenReady: boolean;
}

const AuthContext = createContext<AuthContextType | undefined>(undefined);

interface AuthProviderProps {
  children: ReactNode;
}

export const AuthProvider: React.FC<AuthProviderProps> = ({ children }) => {
  const { instance, accounts } = useMsal();
  const account = useAccount(accounts[0] || null);

  const [name, setName] = useState<string | null>(null);
  const [id, setId] = useState<string | null>(null);
  const [jobTitle, setJobTitle] = useState<string | null>(null);
  const [backendAccessToken, setBackendAccessToken] = useState<string | null>(
    null
  );
  const [isTokenReady, setIsTokenReady] = useState<boolean>(false);

  const acquireToken = async (): Promise<string> => {
    if (!account) throw new Error("No account is signed in.");

    try {
      const response: AuthenticationResult = await instance.acquireTokenSilent({
        scopes: ["openid", "profile", "email"],
        account,
      });

      const idToken = response.idToken;
      const decodedToken = jwtDecode(idToken) as {
        name?: string;
        oid?: string;
        sub?: string;
        job_title?: string;
      };

      setName(decodedToken.name || null);
      setId(decodedToken.oid || decodedToken.sub || null);
      setJobTitle(decodedToken.job_title || null);

      return idToken;
    } catch (error) {
      if (error instanceof InteractionRequiredAuthError) {
        const response = await instance.loginPopup({
          scopes: ["openid", "profile", "email"],
        });

        const idToken = response.idToken;
        const decodedToken = jwtDecode(idToken) as {
          name?: string;
          oid?: string;
          sub?: string;
          job_title?: string;
        };

        console.log("Decoded ID token (after interaction):", decodedToken);

        setName(decodedToken.name || null);
        setId(decodedToken.oid || decodedToken.sub || null);
        setJobTitle(decodedToken.job_title || null);

        return idToken;
      } else {
        console.error("Token acquisition failed", error);
        throw error;
      }
    }
  };

  const login = async (): Promise<void> => {
    try {
      const response = await instance.loginPopup({
        scopes: ["openid", "profile", "email"],
      });

      const idToken = response.idToken;
      const decodedToken = jwtDecode(idToken) as {
        name?: string;
        oid?: string;
        sub?: string;
        job_title?: string;
      };

      setName(decodedToken.name || null);
      setId(decodedToken.oid || decodedToken.sub || null);
      setJobTitle(decodedToken.job_title || null);
    } catch (error) {
      console.error("Login failed:", error);
    }
  };

  const acquireBackendToken = async (): Promise<string> => {
    if (!account) throw new Error("No account is signed in.");

    try {
      const response: AuthenticationResult = await instance.acquireTokenSilent({
        scopes: ["api://037697ed-f4ac-47a5-861b-40bf685a7f14/api.read"],
        account,
      });

      setBackendAccessToken(response.accessToken);
      setIsTokenReady(true);

      return response.accessToken;
    } catch (error) {
      if (error instanceof InteractionRequiredAuthError) {
        const response: AuthenticationResult = await instance.loginPopup({
          scopes: ["api://037697ed-f4ac-47a5-861b-40bf685a7f14/api.read"],
        });

        setBackendAccessToken(response.accessToken);
        setIsTokenReady(true);

        return response.accessToken;
      } else {
        console.error("Backend token acquisition failed", error);
        throw error;
      }
    }
  };

  // Fetch ID token if not initialized
  useEffect(() => {
    if (account && !name && !id && !jobTitle) {
      acquireToken().catch((e) =>
        console.error("Failed to acquire ID token", e)
      );
    }
  }, [account]);

  // Fetch backend token
  useEffect(() => {
    if (account && !backendAccessToken) {
      acquireBackendToken().catch((e) =>
        console.error("Initial backend token acquisition failed", e)
      );
    }
  }, [account]);

  // Debug: Confirm when ID is set
  useEffect(() => {
    if (id) {
      console.log("✅ User ID set:", id);
    }
  }, [id]);

  useEffect(() => {
    if (backendAccessToken) {
      console.log("✅ Backend access token set:", backendAccessToken);
    }
  }, [backendAccessToken]);

  const contextValue: AuthContextType = {
    login,
    name,
    id,
    jobTitle,
    backendAccessToken,
    acquireBackendToken,
    isTokenReady,
  };

  return (
    <AuthContext.Provider value={contextValue}>{children}</AuthContext.Provider>
  );
};

export const useAuth = (): AuthContextType => {
  const context = useContext(AuthContext);
  if (!context) {
    throw new Error("useAuth must be used within an AuthProvider");
  }
  return context;
};
