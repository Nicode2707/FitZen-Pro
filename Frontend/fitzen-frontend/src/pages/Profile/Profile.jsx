import "./Profile.css";

import Sidebar from "../../components/Sidebar/Sidebar";
import Navbar from "../../components/Navbar/Navbar";
import ProfileCard from "../../components/Profile/ProfileCard";

const Profile = () => {

  return (

    <div className="dashboard">

      <Sidebar />

      <main className="dashboard-content">

        <Navbar />

        <ProfileCard />

      </main>

    </div>

  );

};

export default Profile;