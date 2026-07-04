import Sidebar from "../../components/Sidebar/Sidebar";
import Navbar from "../../components/Navbar/Navbar";

import WorkoutForm from "../../components/Workout/WorkoutForm";
import WorkoutList from "../../components/Workout/WorkoutList";

import "./Workout.css";

const Workout = () => {
  return (
    <div className="dashboard">
      <Sidebar />

      <main className="dashboard-content">
        <Navbar />

        <WorkoutForm />

        <WorkoutList />
      </main>
    </div>
  );
};

export default Workout;