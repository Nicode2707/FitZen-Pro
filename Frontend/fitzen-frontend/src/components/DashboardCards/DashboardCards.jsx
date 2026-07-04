import "./DashboardCards.css";
import {
  FaFire,
  FaWalking,
  FaTint,
  FaBed,
} from "react-icons/fa";

const cards = [
  {
    title: "Calories Burned",
    value: "850 kcal",
    sub: "+12% Today",
    icon: <FaFire />,
    color: "orange",
  },
  {
    title: "Steps",
    value: "8,450",
    sub: "Goal 10,000",
    icon: <FaWalking />,
    color: "blue",
  },
  {
    title: "Water Intake",
    value: "2.8 L",
    sub: "Goal 3.5 L",
    icon: <FaTint />,
    color: "cyan",
  },
  {
    title: "Sleep",
    value: "7h 45m",
    sub: "Excellent",
    icon: <FaBed />,
    color: "purple",
  },
];

const DashboardCards = () => {
  return (
    <div className="cards-grid">
      {cards.map((card, index) => (
        <div className={`dashboard-card ${card.color}`} key={index}>
          <div className="card-icon">
            {card.icon}
          </div>

          <h4>{card.title}</h4>

          <h2>{card.value}</h2>

          <span>{card.sub}</span>
        </div>
      ))}
    </div>
  );
};

export default DashboardCards;