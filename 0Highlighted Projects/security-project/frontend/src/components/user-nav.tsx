import { useNavigate } from "react-router-dom";
import { Avatar, AvatarFallback, AvatarImage } from "@/components/ui/avatar";
import { Button } from "@/components/ui/button";
import {
  DropdownMenu,
  DropdownMenuContent,
  DropdownMenuItem,
  DropdownMenuLabel,
  DropdownMenuSeparator,
  DropdownMenuTrigger,
} from "@/components/ui/dropdown-menu";
import { handleLogout } from "@/utils/Authentication";
import { useEffect, useState } from "react";
import { API_BASE_URL } from "@/config";

export function UserNav() {
  const navigate = useNavigate();
  const [user, setUser] = useState(undefined); 
  const [username, setUsername] = useState<string | null>(null);

  const handleMyPageClick = () => {
    const url = `https://ses-drive.io/pages/${username}`;
    window.open(url, "_blank");
  };

  useEffect(() => {
    const fetchUsername = async (userId: string) => {
      try {
        const res = await fetch(`${API_BASE_URL}/users/${userId}`, {
          credentials: 'include',
        });

        if (!res.ok) throw new Error("Failed to fetch user profile");

        const data = await res.json();
        setUsername(data.username);
      } catch (err) {
        console.error(err);
      }
    };

    fetch(`${API_BASE_URL}/users/me`, {
      method: "GET",
      credentials: "include"
    })
      .then(async (res) => {
        if (res.ok) {
          const userData = await res.json();
          setUser(userData);
          if (userData?.id) {
            fetchUsername(userData?.id);
          }
        } else {
          setUser(null);
        }
      })
      .catch(() => {
        setUser(null);
      });
  }, []);

  return (
    <DropdownMenu>
      <DropdownMenuTrigger asChild>
        <Button variant="ghost" className="relative h-8 w-8 rounded-full">
          <Avatar className="h-8 w-8">
            <AvatarImage src={"/placeholder.svg"} alt={user?.id} />
            <AvatarFallback>{user?.username.charAt(0)}</AvatarFallback>
          </Avatar>
        </Button>
      </DropdownMenuTrigger>
      <DropdownMenuContent className="w-56" align="end" forceMount>
        <DropdownMenuLabel className="font-normal">
          <div className="flex flex-col space-y-1">
            <p className="text-sm font-medium leading-none">{user?.name}</p>
            <p className="text-xs leading-none text-muted-foreground">
              {user?.email}
            </p>
          </div>
        </DropdownMenuLabel>
        <DropdownMenuSeparator />
        <DropdownMenuItem onClick={handleMyPageClick}>My page</DropdownMenuItem>
        <DropdownMenuItem onClick={() => handleLogout({ navigate })}>
          Log out
        </DropdownMenuItem>
      </DropdownMenuContent>
    </DropdownMenu>
  );
}
