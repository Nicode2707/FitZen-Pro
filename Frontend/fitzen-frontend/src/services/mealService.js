import api from "./api";

export const createMeal = async (mealData) => {
  const response = await api.post("/meals", mealData);
  return response.data;
};