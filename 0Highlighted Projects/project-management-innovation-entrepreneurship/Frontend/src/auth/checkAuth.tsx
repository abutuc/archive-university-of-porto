import Cookies from "js-cookie";

export function isAuthenticated() {
  const isLoggedIn = Cookies.get("isLoggedIn") === "true";

  return isLoggedIn;
}
