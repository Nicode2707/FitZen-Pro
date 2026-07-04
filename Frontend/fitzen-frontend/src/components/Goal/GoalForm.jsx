import { useState } from "react";
import { createGoal } from "../../services/goalService";
import "./GoalForm.css";

const GoalForm = () => {
  const [goal, setGoal] = useState({
    goalType: "",
    targetValue: "",
    currentValue: "",
    deadline: "",
  });

  const [loading, setLoading] = useState(false);

  const handleChange = (e) => {
    setGoal({
      ...goal,
      [e.target.name]: e.target.value,
    });
  };

  const handleSubmit = async (e) => {
    e.preventDefault();

    setLoading(true);

    try {
      await createGoal({
        goalType: goal.goalType,
        targetValue: Number(goal.targetValue),
        currentValue: Number(goal.currentValue),
        deadline: goal.deadline,
      });

      alert("✅ Goal Added Successfully");

      setGoal({
        goalType: "",
        targetValue: "",
        currentValue: "",
        deadline: "",
      });

    } catch (err) {
      console.log(err);
      alert("❌ Failed to Add Goal");
    }

    setLoading(false);
  };

  return (
    <form className="goal-form" onSubmit={handleSubmit}>

      <select
        name="goalType"
        value={goal.goalType}
        onChange={handleChange}
        required
      >
        <option value="">Select Goal</option>
        <option>Weight Loss</option>
        <option>Weight Gain</option>
        <option>Calories</option>
        <option>Workout</option>
        <option>Water Intake</option>
        <option>Sleep</option>
      </select>

      <input
        type="number"
        placeholder="Target Value"
        name="targetValue"
        value={goal.targetValue}
        onChange={handleChange}
        required
      />

      <input
        type="number"
        placeholder="Current Progress"
        name="currentValue"
        value={goal.currentValue}
        onChange={handleChange}
        required
      />

      <input
        type="date"
        name="deadline"
        value={goal.deadline}
        onChange={handleChange}
        required
      />

      <button type="submit" disabled={loading}>
        {loading ? "Saving..." : "Add Goal"}
      </button>

    </form>
  );
};

export default GoalForm;