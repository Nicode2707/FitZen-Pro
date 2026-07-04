import "./ActivityTable.css";

const data = [
  { activity: "Morning Run", duration: "45 min", calories: 420 },
  { activity: "Upper Body Workout", duration: "60 min", calories: 520 },
  { activity: "Cycling", duration: "30 min", calories: 280 },
  { activity: "Yoga", duration: "40 min", calories: 190 },
];

const ActivityTable = () => {
  return (
    <div className="activity-table">

      <h2>Recent Activity 📋</h2>

      <table>

        <thead>

          <tr>
            <th>Activity</th>
            <th>Duration</th>
            <th>Calories</th>
          </tr>

        </thead>

        <tbody>

          {data.map((item, index) => (

            <tr key={index}>

              <td>{item.activity}</td>

              <td>{item.duration}</td>

              <td>{item.calories}</td>

            </tr>

          ))}

        </tbody>

      </table>

    </div>
  );
};

export default ActivityTable;