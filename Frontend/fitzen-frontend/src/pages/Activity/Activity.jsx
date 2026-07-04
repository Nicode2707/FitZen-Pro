import Sidebar from "../../components/Sidebar/Sidebar";
import Navbar from "../../components/Navbar/Navbar";

import ActivityStats from "../../components/Activity/ActivityStats";
import ActivityTimeline from "../../components/Activity/ActivityTimeline";

import "./Activity.css";

const Activity = () => {
  return (
    <div className="dashboard">

      <Sidebar />

      <main className="dashboard-content">

        <Navbar />

        <div className="activity-page">

          <div className="activity-header">
            <h1>📈 Activity</h1>
            <p>Your complete fitness journey in one place.</p>
          </div>

          <ActivityStats />

          <ActivityTimeline />

        </div>

      </main>

    </div>
  );
};

export default Activity;