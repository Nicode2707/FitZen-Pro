import "./WaterProgress.css";
import { FaTint } from "react-icons/fa";

const WaterProgress = () => {
  return (
    <div className="water-card">

      <div className="water-top">

        <FaTint />

        <h2>Water Intake</h2>

      </div>

      <div className="water-progress">

        <div className="fill"></div>

      </div>

      <h1>2.8L</h1>

      <span>Goal 3.5L</span>

    </div>
  );
};

export default WaterProgress;