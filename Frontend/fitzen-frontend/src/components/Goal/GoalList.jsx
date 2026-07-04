import "./GoalList.css";
import { FaBullseye } from "react-icons/fa";

const goals = [
  {
    id: 1,
    goal: "Weight Loss",
    progress: 65,
    target: "75 kg",
  },
  {
    id: 2,
    goal: "Workout",
    progress: 80,
    target: "30 Days",
  },
  {
    id: 3,
    goal: "Water Intake",
    progress: 45,
    target: "3 Litres",
  },
];

const GoalList = () => {
  return (
    <div className="goal-list">

      <h2>
        <FaBullseye /> Your Goals
      </h2>

      {goals.map((item) => (

        <div className="goal-card" key={item.id}>

          <div className="goal-top">

            <h3>{item.goal}</h3>

            <span>{item.target}</span>

          </div>

          <div className="progress">

            <div
              className="progress-fill"
              style={{ width: `${item.progress}%` }}
            ></div>

          </div>

          <p>{item.progress}% Completed</p>

        </div>

      ))}

    </div>
  );
};

export default GoalList;