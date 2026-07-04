import "./ActivityStats.css";
import {
  FaDumbbell,
  FaFire,
  FaWalking,
  FaBed
} from "react-icons/fa";

const ActivityStats = () => {

  const cards = [
    {
      title: "Workouts",
      value: "25",
      icon: <FaDumbbell />
    },
    {
      title: "Calories",
      value: "8,250",
      icon: <FaFire />
    },
    {
      title: "Steps",
      value: "76,000",
      icon: <FaWalking />
    },
    {
      title: "Sleep Avg",
      value: "7.8h",
      icon: <FaBed />
    }
  ];

  return (

    <div className="activity-stats">

      {cards.map((item,index)=>(

        <div className="activity-card" key={index}>

          <div className="activity-icon">
            {item.icon}
          </div>

          <h3>{item.value}</h3>

          <p>{item.title}</p>

        </div>

      ))}

    </div>

  );

};

export default ActivityStats;