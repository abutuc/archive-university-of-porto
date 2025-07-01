import { jwtDecode } from "jwt-decode";
import { API_BASE_URL } from "@/config";

interface DecodedJwt {
  sub: string;
  email: string;
  user_id: number;
}

async function handleLogin(
  e: React.FormEvent<HTMLFormElement>,
  {
    setIsLoading,
    navigate,
  }: {
    setIsLoading: (loading: boolean) => void;
    navigate: Function;
  }
) {
  e.preventDefault();
  setIsLoading(true);

  const formData = new FormData(e.currentTarget);
  const email = formData.get("email") as string;
  const password = formData.get("password") as string;

  try {
    const res = await fetch(`${API_BASE_URL}/auth/login`, {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify({ email, password }),
    });

    if (!res.ok) {
      const errText = await res.text();
      throw new Error(`Login failed: ${errText}`);
    }

    navigate("/dashboard");
  } catch {
  } finally {
    setIsLoading(false);
  }
}

async function handleRegister(
  e: React.FormEvent<HTMLFormElement>,
  {
    setIsLoading,
    navigate,
  }: {
    setIsLoading: (loading: boolean) => void;
    navigate: Function;
  }
) {
  e.preventDefault();
  setIsLoading(true);

  const formData = new FormData(e.currentTarget);
  const username = formData.get("username") as string;
  const email = formData.get("email") as string;
  const password = formData.get("password") as string;

  try {
    const res = await fetch(`${API_BASE_URL}/auth/signup`, {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify({ username, email, password }),
    });

    if (!res.ok) {
      const errText = await res.text();
      throw new Error(`Signup failed: ${errText}`);
    }


    navigate("/dashboard");
  } catch (error){
    console.error("Registration failed:", error);
  } finally {
    setIsLoading(false);
  }
}

function handleLogout({ navigate }) {
  fetch(`${API_BASE_URL}/auth/logout`, {
    method: "POST",
    credentials: "include",
  })
    .then(() => {
      navigate("/");
    })
    .catch((error) => {
      console.error("Logout failed:", error);
    });
}


export {handleLogin, handleRegister, handleLogout};