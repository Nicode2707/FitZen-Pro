import { createContext, useState } from "react";
import { saveToken, removeToken } from "../utils/storage";

export const AuthContext = createContext();

export default function AuthProvider({ children }) {

  const [user, setUser] = useState(
    JSON.parse(localStorage.getItem("user")) || null
  );

  const login = (response) => {

    saveToken(response.token);

   const userData = {
  fullName: response.fullName,
  email: response.email,
  phone: response.phone,
  age: response.age,
  gender: response.gender,
  height: response.height,
  weight: response.weight,
};

localStorage.setItem("user", JSON.stringify(userData));
setUser(userData);
  };

  const logout = () => {

    removeToken();

    localStorage.removeItem("user");

    setUser(null);
  };

  return (
    <AuthContext.Provider
      value={{
        user,
        login,
        logout,
      }}
    >
      {children}
    </AuthContext.Provider>
  );
}