import "./Dashboard.css";

import Sidebar from "../../components/Sidebar/Sidebar";
import Navbar from "../../components/Navbar/Navbar";

import DashboardCards from "../../components/DashboardCards/DashboardCards";
import WeeklyChart from "../../components/WeeklyChart/WeeklyChart";
import GoalProgress from "../../components/GoalProgress/GoalProgress";
import WaterProgress from "../../components/WaterProgress/WaterProgress";
import Achievement from "../../components/Achievement/Achievement";
import ActivityTable from "../../components/ActivityTable/ActivityTable";
import TaskCard from "../../components/TaskCard/TaskCard";

const Dashboard = () => {
  return (
    <div className="dashboard">

      <Sidebar />

      <main className="dashboard-content">

        <Navbar />

        <section className="dashboard-header">

          <h1>Welcome Back 👋</h1>

          <p>
            Track your workouts, meals, sleep and goals from one place.
          </p>

        </section>

        <DashboardCards />

        <WeeklyChart />

        <div className="dashboard-row">

          <GoalProgress />

          <WaterProgress />

        </div>

        <Achievement />

        <ActivityTable />

        <TaskCard />

      </main>

    </div>
  );
};

export default Dashboard;