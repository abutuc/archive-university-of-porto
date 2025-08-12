export const msalConfig = {
  auth: {
    clientId: "a71d02de-19f0-4dce-9c5a-4c606e1d067e",
    authority:
      "https://login.microsoftonline.com/dfacb40f-5ce3-450a-b043-6fc9c30d95c7",
    redirectUri: "http://localhost:5173",
  },
  cache: {
    cacheLocation: "localStorage",
    storeAuthStateInCookie: false,
  },
};

export const loginRequest = {
  scopes: ["openid", "profile", "email"],
};
