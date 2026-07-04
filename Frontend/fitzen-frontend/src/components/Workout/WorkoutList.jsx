import "./WorkoutList.css";
import {
  FaDumbbell,
  FaFire,
  FaClock,
  FaRunning,
} from "react-icons/fa";

const workouts = [
  {
    id: 1,
    name: "Chest Workout",
    category: "Strength",
    duration: 45,
    calories: 420,
  },
  {
    id: 2,
    name: "Morning Run",
    category: "Cardio",
    duration: 30,
    calories: 320,
  },
  {
    id: 3,
    name: "Yoga Session",
    category: "Flexibility",
    duration: 40,
    calories: 180,
  },
];

const WorkoutList = () => {
  return (
    <div className="workout-list">

      <div className="section-title">
        <FaRunning />
        <h2>Recent Workouts</h2>
      </div>

      {workouts.map((item) => (

        <div className="workout-card" key={item.id}>

          <div className="workout-icon">
            <FaDumbbell />
          </div>

          <div className="workout-info">

            <h3>{item.name}</h3>

            <p>{item.category}</p>

          </div>

          <div className="workout-stats">

            <span>
              <FaClock />
              {item.duration} min
            </span>

            <span>
              <FaFire />
              {item.calories} kcal
            </span>

          </div>

        </div>

      ))}

    </div>
  );
};

export default WorkoutList;