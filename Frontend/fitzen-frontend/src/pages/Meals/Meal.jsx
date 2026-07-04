import "./Meal.css";

import Sidebar from "../../components/Sidebar/Sidebar";
import Navbar from "../../components/Navbar/Navbar";

import MealForm from "../../components/Meal/MealForm";
import MealList from "../../components/Meal/MealList";

const Meal = () => {

    return(

        <div className="dashboard">

            <Sidebar/>

            <main className="dashboard-content">

                <Navbar/>

                <div className="meal-header">

                    <h1>🍽 Meal Tracker</h1>

                    <p>
                        Track your daily nutrition and calories.
                    </p>

                </div>

                <MealForm/>

                <MealList/>

            </main>

        </div>

    );

};

export default Meal;