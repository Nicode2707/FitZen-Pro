import "./TaskCard.css";

const TaskCard = () => {
  return (
    <div className="task-card">

      <h2>Today's Tasks ✅</h2>

      <ul>

        <li>✔ Morning Workout</li>

        <li>✔ Drink 3.5L Water</li>

        <li>⬜ Evening Walk</li>

        <li>⬜ Sleep before 11 PM</li>

      </ul>

    </div>
  );
};

export default TaskCard;