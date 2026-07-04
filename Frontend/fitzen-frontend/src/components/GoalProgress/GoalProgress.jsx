import "./GoalProgress.css";

const GoalProgress = () => {
  const progress = 78;

  return (
    <div className="goal-card">

      <h2>Today's Goal 🎯</h2>

      <div className="circle">

        <svg>

          <circle cx="70" cy="70" r="60"></circle>

          <circle
            cx="70"
            cy="70"
            r="60"
            style={{
              strokeDashoffset: 377 - (377 * progress) / 100,
            }}
          ></circle>

        </svg>

        <div className="percent">

          <h1>{progress}%</h1>

          <span>Completed</span>

        </div>

      </div>

    </div>
  );
};

export default GoalProgress;