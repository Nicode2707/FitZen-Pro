import api from "./api";

export const createSleep = async (sleepData) => {
  const response = await api.post("/sleep", sleepData);
  return response.data;
};