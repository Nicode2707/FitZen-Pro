export const saveToken = (token) => {
  localStorage.setItem("fitzen_token", token);
};

export const getToken = () => {
  return localStorage.getItem("fitzen_token");
};

export const removeToken = () => {
  localStorage.removeItem("fitzen_token");
};

export const isLoggedIn = () => {
  return !!localStorage.getItem("fitzen_token");
};