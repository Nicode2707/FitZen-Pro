import { useState } from "react";
import { createWorkout } from "../../services/workoutService";
import "./WorkoutForm.css";

const WorkoutForm = () => {
  const [formData, setFormData] = useState({
    workoutName: "",
    category: "",
    duration: "",
    caloriesBurned: "",
    description: "",
  });

  const [loading, setLoading] = useState(false);

  const handleChange = (e) => {
    setFormData({
      ...formData,
      [e.target.name]: e.target.value,
    });
  };

  const handleSubmit = async (e) => {
    e.preventDefault();

    setLoading(true);

    try {
      await createWorkout({
        workoutName: formData.workoutName,
        category: formData.category,
        duration: Number(formData.duration),
        caloriesBurned: Number(formData.caloriesBurned),
        description: formData.description,
      });

      alert("✅ Workout Added Successfully");

      setFormData({
        workoutName: "",
        category: "",
        duration: "",
        caloriesBurned: "",
        description: "",
      });
    } catch (error) {
      console.error(error);
      alert("❌ Failed to Add Workout");
    }

    setLoading(false);
  };

  return (
    <form className="workout-form" onSubmit={handleSubmit}>
      <input
        type="text"
        name="workoutName"
        placeholder="Workout Name"
        value={formData.workoutName}
        onChange={handleChange}
        required
      />

      <select
        name="category"
        value={formData.category}
        onChange={handleChange}
        required
      >
        <option value="">Select Category</option>
        <option>Strength</option>
        <option>Cardio</option>
        <option>Yoga</option>
        <option>HIIT</option>
        <option>Running</option>
        <option>Cycling</option>
        <option>Stretching</option>
      </select>

      <input
        type="number"
        name="duration"
        placeholder="Duration (minutes)"
        value={formData.duration}
        onChange={handleChange}
        required
      />

      <input
        type="number"
        name="caloriesBurned"
        placeholder="Calories Burned"
        value={formData.caloriesBurned}
        onChange={handleChange}
        required
      />

      <textarea
        rows="5"
        name="description"
        placeholder="Workout Description"
        value={formData.description}
        onChange={handleChange}
      />

      <button type="submit" disabled={loading}>
        {loading ? "Saving..." : "Add Workout"}
      </button>
    </form>
  );
};

export default WorkoutForm;