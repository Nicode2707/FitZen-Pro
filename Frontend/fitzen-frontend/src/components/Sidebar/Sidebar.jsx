import "./Sidebar.css";
import { NavLink } from "react-router-dom";
import {
  FaHome,
  FaDumbbell,
  FaBed,
  FaAppleAlt,
  FaBullseye,
  FaChartLine,
  FaUser,
  FaCog,
  FaSignOutAlt,
} from "react-icons/fa";

const Sidebar = () => {
  return (
    <aside className="sidebar">

      <div className="logo">
        <h2>🚀 FitZen</h2>
        <span>Fitness Tracker</span>
      </div>

      <nav>

        <NavLink
          to="/dashboard"
          className={({ isActive }) => (isActive ? "active" : "")}
        >
          <FaHome />
          Dashboard
        </NavLink>

        <NavLink
          to="/workout"
          className={({ isActive }) => (isActive ? "active" : "")}
        >
          <FaDumbbell />
          Workout
        </NavLink>

        <NavLink
          to="/sleep"
          className={({ isActive }) => (isActive ? "active" : "")}
        >
          <FaBed />
          Sleep
        </NavLink>

        <NavLink
          to="/meals"
          className={({ isActive }) => (isActive ? "active" : "")}
        >
          <FaAppleAlt />
          Meals
        </NavLink>

        <NavLink
          to="/goals"
          className={({ isActive }) => (isActive ? "active" : "")}
        >
          <FaBullseye />
          Goals
        </NavLink>

        <NavLink
          to="/activity"
          className={({ isActive }) => (isActive ? "active" : "")}
        >
          <FaChartLine />
          Activity
        </NavLink>

        <NavLink
          to="/profile"
          className={({ isActive }) => (isActive ? "active" : "")}
        >
          <FaUser />
          Profile
        </NavLink>

      </nav>

      <div className="bottom-links">

        <NavLink to="/settings">
          <FaCog />
          Settings
        </NavLink>

        <NavLink to="/login">
          <FaSignOutAlt />
          Logout
        </NavLink>

      </div>

    </aside>
  );
};

export default Sidebar;