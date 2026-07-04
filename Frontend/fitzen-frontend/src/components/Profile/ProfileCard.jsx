import "./ProfileCard.css";

import { useContext } from "react";
import { AuthContext } from "../../context/AuthContext";

import {
  FaUserCircle,
  FaEnvelope,
  FaPhone,
  FaRulerVertical,
  FaWeight,
  FaVenusMars,
  FaBirthdayCake,
  FaUser,
  FaEdit,
} from "react-icons/fa";

const ProfileCard = () => {

  const { user } = useContext(AuthContext);

  return (

    <div className="profile-card">

      {/* Header */}

      <div className="profile-header">

        <FaUserCircle className="profile-avatar" />

        <h2>{user?.fullName || "Guest User"}</h2>

        <p>Fitness Member</p>

        <button>

          <FaEdit />

          Edit Profile

        </button>

      </div>

      {/* User Information */}

      <div className="profile-details">

        <div className="detail-card">

          <FaUser />

          <div>

            <h4>Full Name</h4>

            <p>{user?.fullName || "Not Available"}</p>

          </div>

        </div>

        <div className="detail-card">

          <FaEnvelope />

          <div>

            <h4>Email</h4>

            <p>{user?.email || "Not Available"}</p>

          </div>

        </div>

        <div className="detail-card">

          <FaPhone />

          <div>

            <h4>Phone</h4>

            <p>{user?.phone || "Not Available"}</p>

          </div>

        </div>

        <div className="detail-card">

          <FaBirthdayCake />

          <div>

            <h4>Age</h4>

            <p>{user?.age || "--"} Years</p>

          </div>

        </div>

        <div className="detail-card">

          <FaVenusMars />

          <div>

            <h4>Gender</h4>

            <p>{user?.gender || "--"}</p>

          </div>

        </div>

        <div className="detail-card">

          <FaRulerVertical />

          <div>

            <h4>Height</h4>

            <p>{user?.height || "--"} cm</p>

          </div>

        </div>

        <div className="detail-card">

          <FaWeight />

          <div>

            <h4>Weight</h4>

            <p>{user?.weight || "--"} kg</p>

          </div>

        </div>

      </div>

    </div>

  );

};

export default ProfileCard;