import "./Navbar.css";

import { useContext } from "react";

import { AuthContext } from "../../context/AuthContext";

import {
  FaSearch,
  FaBell,
  FaMoon,
  FaUserCircle,
} from "react-icons/fa";

const Navbar = () => {

  const { user } = useContext(AuthContext);

  return (

    <header className="navbar">

      <div className="navbar-left">

        <h2>Dashboard</h2>

        <div className="search-box">

          <FaSearch />

          <input
            type="text"
            placeholder="Search..."
          />

        </div>

      </div>

      <div className="navbar-right">

        <button className="icon-btn">
          <FaBell />
        </button>

        <button className="icon-btn">
          <FaMoon />
        </button>

        <div className="profile">

          <FaUserCircle className="profile-icon" />

          <div>

            <h4>
              {user?.fullName || "Guest"}
            </h4>

            <span>
              Fitness Member
            </span>

          </div>

        </div>

      </div>

    </header>

  );
};

export default Navbar;