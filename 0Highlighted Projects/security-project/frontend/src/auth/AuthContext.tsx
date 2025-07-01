import React, { createContext, useContext, useState, ReactNode } from "react";
import { jwtDecode } from "jwt-decode";
import { API_BASE_URL } from "@/config";

// Define shape of the decoded JWT (based on Google's id_token)
interface DecodedToken {
  email: string;
  name: string;
  sub: string;
  // Optionally include: picture, exp, iat, etc.
}

// Define shape of user context
interface User {
  email: string;
  name: string;
  sub: string;
}

interface AuthContextType {
  token: string | null;
  user: User | null;
  login: (googleToken: string) => void;
  logout: () => void;
}

const AuthContext = createContext<AuthContextType | undefined>(undefined);

interface AuthProviderProps {
  children: ReactNode;
}

export const AuthProvider: React.FC<AuthProviderProps> = ({ children }) => {
  const [token, setToken] = useState<string | null>(null);
  const [user, setUser] = useState<User | null>(null);

  const login = async (googleToken: string) => {
    const resp = await fetch(`${API_BASE_URL}/auth/login`, {
      method: 'POST',
      headers: { 'Content-Type': 'application/json' },
      credentials: 'include',
      body: JSON.stringify({ credential: googleToken }),
    });
    if (!resp.ok) throw new Error('Login failed');

    const decoded = jwtDecode<DecodedToken>(googleToken);
    setUser({
      email: decoded.email,
      name: decoded.name,
      sub: decoded.sub,
    });
    
  };

  const logout = () => {
    setToken(null);
    setUser(null);
  };

  return (
    <AuthContext.Provider value={{ token, user, login, logout }}>
      {children}
    </AuthContext.Provider>
  );
};

export const useAuth = (): AuthContextType => {
  const context = useContext(AuthContext);
  if (!context) {
    throw new Error("useAuth must be used within an AuthProvider");
  }
  return context;
};
