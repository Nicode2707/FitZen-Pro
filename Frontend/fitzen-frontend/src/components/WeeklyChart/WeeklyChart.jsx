import "./WeeklyChart.css";

import {
  ResponsiveContainer,
  LineChart,
  Line,
  XAxis,
  YAxis,
  Tooltip,
  CartesianGrid,
} from "recharts";

const data = [
  { day: "Mon", workout: 30 },
  { day: "Tue", workout: 45 },
  { day: "Wed", workout: 60 },
  { day: "Thu", workout: 50 },
  { day: "Fri", workout: 70 },
  { day: "Sat", workout: 90 },
  { day: "Sun", workout: 65 },
];

const WeeklyChart = () => {
  return (
    <div className="weekly-chart">

      <div className="chart-header">
        <h2>Weekly Activity</h2>
        <span>Workout Minutes</span>
      </div>

      <ResponsiveContainer width="100%" height={320}>
        <LineChart data={data}>

          <CartesianGrid
            strokeDasharray="3 3"
            stroke="#2e3a52"
          />

          <XAxis
            dataKey="day"
            stroke="#cbd5e1"
          />

          <YAxis
            stroke="#cbd5e1"
          />

          <Tooltip
            contentStyle={{
              background: "#1f2937",
              border: "none",
              borderRadius: "12px",
              color: "#fff",
            }}
          />

          <Line
            type="monotone"
            dataKey="workout"
            stroke="#7c3aed"
            strokeWidth={4}
            dot={{ r: 6 }}
            activeDot={{ r: 9 }}
          />

        </LineChart>
      </ResponsiveContainer>

    </div>
  );
};

export default WeeklyChart;