import Sidebar from "../../components/Sidebar/Sidebar";
import Navbar from "../../components/Navbar/Navbar";

import GoalForm from "../../components/Goal/GoalForm";
import GoalList from "../../components/Goal/GoalList";

import "./Goals.css";

const Goals = () => {
  return (
    <div className="dashboard">

      <Sidebar />

      <main className="dashboard-content">

        <Navbar />

        <div className="goal-page">

          <div className="page-header">
            <h1>🎯 Goals</h1>
            <p>
              Create your fitness goals and track your progress every day.
            </p>
          </div>

          <GoalForm />

          <GoalList />

        </div>

      </main>

    </div>
  );
};

export default Goals;