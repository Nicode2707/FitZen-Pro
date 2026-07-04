import "./Login.css";
import { useState, useContext } from "react";
import { useNavigate, Link } from "react-router-dom";
import { FaEnvelope, FaLock, FaEye } from "react-icons/fa";
import toast from "react-hot-toast";

import { loginUser } from "../../services/authService";
import { AuthContext } from "../../context/AuthContext";

const Login = () => {

  const navigate = useNavigate();

  const { login } = useContext(AuthContext);

  const [formData, setFormData] = useState({
    email: "",
    password: "",
  });

  const [loading, setLoading] = useState(false);

  const handleChange = (e) => {

    setFormData({
      ...formData,
      [e.target.name]: e.target.value,
    });

  };

  const handleSubmit = async (e) => {

    e.preventDefault();

    if (!formData.email || !formData.password) {

      toast.error("Please fill all fields");
      return;

    }

    try {

      setLoading(true);

      const response = await loginUser(formData);

      // ✅ Save Token + User Details
      login(response);

      toast.success(response.message);

      navigate("/dashboard");

    } catch (error) {

      toast.error(
        error.response?.data?.message || "Invalid Email or Password"
      );

    } finally {

      setLoading(false);

    }

  };

  return (

    <div className="login-page">

      <div className="login-card">

        <h1>
          FitZen Pro 🚀
        </h1>

        <p>
          Your Personal Fitness Companion
        </p>

        <form onSubmit={handleSubmit}>

          <div className="input-box">

            <FaEnvelope />

            <input
              type="email"
              name="email"
              placeholder="Email Address"
              value={formData.email}
              onChange={handleChange}
            />

          </div>

          <div className="input-box">

            <FaLock />

            <input
              type="password"
              name="password"
              placeholder="Password"
              value={formData.password}
              onChange={handleChange}
            />

            <FaEye />

          </div>

          <button type="submit" disabled={loading}>

            {loading ? "Logging in..." : "Login"}

          </button>

        </form>

        <p>

          Don't have an account?

          <Link to="/register">
            Register
          </Link>

        </p>

      </div>

    </div>

  );

};

export default Login;