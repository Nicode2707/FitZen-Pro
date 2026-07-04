import { BrowserRouter, Routes, Route, Navigate } from "react-router-dom";

import Login from "../pages/Login/Login";
import Register from "../pages/Register/Register";
import Dashboard from "../pages/Dashboard/Dashboard";

import Workout from "../pages/Workout/Workout";
import Meal from "../pages/Meals/Meal";
import Sleep from "../pages/Sleep/Sleep";

import Goals from "../pages/Goals/Goals";
import Activity from "../pages/Activity/Activity";
import Profile from "../pages/Profile/Profile";
import Settings from "../pages/Settings/Settings";

const AppRoutes = () => {
  return (
    <BrowserRouter>
      <Routes>

        {/* Default Route */}
        <Route path="/" element={<Navigate to="/login" replace />} />

        {/* Authentication */}
        <Route path="/login" element={<Login />} />
        <Route path="/register" element={<Register />} />

        {/* Dashboard */}
        <Route path="/dashboard" element={<Dashboard />} />

        {/* Fitness Modules */}
        <Route path="/workout" element={<Workout />} />
        <Route path="/meals" element={<Meal />} />
        <Route path="/sleep" element={<Sleep />} />
        <Route path="/goals" element={<Goals />} />
        <Route path="/activity" element={<Activity />} />
        <Route path="/profile" element={<Profile />} />
        <Route path="/settings" element={<Settings />} />

        {/* Invalid URL */}
        <Route path="*" element={<Navigate to="/dashboard" replace />} />

      </Routes>
    </BrowserRouter>
  );
};

export default AppRoutes;