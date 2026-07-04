import "./SleepList.css";

import {
  FaMoon,
  FaClock,
  FaCalendarAlt,
  FaStar,
} from "react-icons/fa";

const sleepData = [
  {
    id: 1,
    hours: 8,
    quality: "Excellent",
    bedTime: "11:00 PM",
    wakeTime: "07:00 AM",
    date: "Today",
  },
  {
    id: 2,
    hours: 7,
    quality: "Good",
    bedTime: "11:30 PM",
    wakeTime: "06:30 AM",
    date: "Yesterday",
  },
  {
    id: 3,
    hours: 6.5,
    quality: "Average",
    bedTime: "12:30 AM",
    wakeTime: "07:00 AM",
    date: "2 Days Ago",
  },
];

const SleepList = () => {
  return (
    <div className="sleep-list">

      <div className="sleep-title">

        <FaMoon />

        <h2>Recent Sleep Records</h2>

      </div>

      {sleepData.map((sleep) => (

        <div className="sleep-card" key={sleep.id}>

          <div className="sleep-left">

            <h3>{sleep.hours} Hours</h3>

            <p>{sleep.quality}</p>

          </div>

          <div className="sleep-right">

            <span>

              <FaClock />

              {sleep.bedTime}

            </span>

            <span>

              <FaClock />

              {sleep.wakeTime}

            </span>

            <span>

              <FaCalendarAlt />

              {sleep.date}

            </span>

            <span>

              <FaStar />

              {sleep.quality}

            </span>

          </div>

        </div>

      ))}

    </div>
  );
};

export default SleepList;