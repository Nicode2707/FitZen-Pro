import api from "./api";

export const createWorkout = async (workoutData) => {
  const response = await api.post("/workouts", workoutData);
  return response.data;
};