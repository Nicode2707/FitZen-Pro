import "./Achievement.css";
import { FaTrophy, FaMedal, FaFire } from "react-icons/fa";

const Achievement = () => {
  return (
    <div className="achievement-card">

      <h2>Achievements 🏆</h2>

      <div className="achievement-list">

        <div className="achievement-item">
          <FaTrophy className="gold" />
          <div>
            <h4>Workout Champion</h4>
            <span>Completed 30 workouts</span>
          </div>
        </div>

        <div className="achievement-item">
          <FaMedal className="silver" />
          <div>
            <h4>10K Steps</h4>
            <span>Reached daily goal</span>
          </div>
        </div>

        <div className="achievement-item">
          <FaFire className="orange" />
          <div>
            <h4>7 Day Streak</h4>
            <span>Stayed consistent</span>
          </div>
        </div>

      </div>

    </div>
  );
};

export default Achievement;