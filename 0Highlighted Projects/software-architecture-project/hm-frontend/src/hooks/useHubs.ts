import { useEffect, useState } from "react";
import type { Hub } from "../types.ts";

export default function useHubs() {
  const [hubs, setHubs] = useState<Hub[]>([]);

  const getHubs = async () => {
    const response = await fetch("http://localhost/api/hubs");
    const data = await response.json();
    setHubs(data);
  };

  const addHub = async (hub: Hub) => {
    await fetch(`/api/hubs?protocol=${hub.protocol.type}`, {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
    });
    getHubs();
  };

  const removeHub = async (id: string) => {
    await fetch(`http://localhost/api/hubs/${id}`, {
      method: "DELETE",
    });
    getHubs();
  };

  const activateHub = async (id: string) => {
    const response = await fetch(`/api/hubs/${id}/activate`, {
      method: "POST",
    });
    console.log(response.ok);
    getHubs();
  };

  const deactivateHub = async (id: string) => {
    const response = await fetch(`/api/hubs/${id}/deactivate`, {
      method: "POST",
    });
    console.log(response.ok);
    getHubs();
  };

  useEffect(() => {
    getHubs();
  }, []);

  return { hubs, addHub, removeHub, activateHub, deactivateHub };
}
