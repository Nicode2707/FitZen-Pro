import "./MealList.css";

import {
  FaUtensils,
  FaFire,
  FaDrumstickBite,
  FaBreadSlice,
  FaCheese,
} from "react-icons/fa";

const meals = [
  {
    id: 1,
    mealName: "Chicken Rice",
    mealType: "Lunch",
    calories: 650,
    protein: 42,
    carbs: 58,
    fats: 18,
  },
  {
    id: 2,
    mealName: "Oats & Banana",
    mealType: "Breakfast",
    calories: 380,
    protein: 18,
    carbs: 62,
    fats: 7,
  },
  {
    id: 3,
    mealName: "Paneer Salad",
    mealType: "Dinner",
    calories: 420,
    protein: 30,
    carbs: 18,
    fats: 22,
  },
];

const MealList = () => {
  return (
    <div className="meal-list">

      <div className="meal-title">

        <FaUtensils />

        <h2>Today's Meals</h2>

      </div>

      {meals.map((meal) => (

        <div className="meal-card" key={meal.id}>

          <div className="meal-left">

            <h3>{meal.mealName}</h3>

            <p>{meal.mealType}</p>

          </div>

          <div className="meal-right">

            <span>
              <FaFire />
              {meal.calories} kcal
            </span>

            <span>
              <FaDrumstickBite />
              {meal.protein} g
            </span>

            <span>
              <FaBreadSlice />
              {meal.carbs} g
            </span>

            <span>
              <FaCheese />
              {meal.fats} g
            </span>

          </div>

        </div>

      ))}

    </div>
  );
};

export default MealList;