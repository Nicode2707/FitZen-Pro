import api from "./api";

export const createGoal = async (goalData) => {

  const response = await api.post("/goals", goalData);

  return response.data;

};