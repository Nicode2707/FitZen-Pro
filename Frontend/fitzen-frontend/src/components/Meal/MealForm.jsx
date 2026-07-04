import { useState } from "react";
import { createMeal } from "../../services/mealService";
import "./MealForm.css";

const MealForm = () => {

    const [formData, setFormData] = useState({
        mealName: "",
        mealType: "",
        calories: "",
        protein: "",
        carbs: "",
        fats: "",
        description: ""
    });

    const [loading, setLoading] = useState(false);

    const handleChange = (e) => {

        setFormData({
            ...formData,
            [e.target.name]: e.target.value
        });

    };

    const handleSubmit = async (e) => {

        e.preventDefault();

        try{

            setLoading(true);

            await createMeal({

                mealName: formData.mealName,
                mealType: formData.mealType,
                calories: Number(formData.calories),
                protein: Number(formData.protein),
                carbs: Number(formData.carbs),
                fats: Number(formData.fats),
                description: formData.description

            });

            alert("✅ Meal Added Successfully");

            setFormData({

                mealName:"",
                mealType:"",
                calories:"",
                protein:"",
                carbs:"",
                fats:"",
                description:""

            });

        }catch(error){

            console.log(error);

            alert("❌ Failed To Add Meal");

        }

        setLoading(false);

    };

    return(

        <form className="meal-form" onSubmit={handleSubmit}>

            <input
                type="text"
                name="mealName"
                placeholder="Meal Name"
                value={formData.mealName}
                onChange={handleChange}
                required
            />

            <select
                name="mealType"
                value={formData.mealType}
                onChange={handleChange}
                required
            >

                <option value="">Meal Type</option>
                <option>Breakfast</option>
                <option>Lunch</option>
                <option>Dinner</option>
                <option>Snacks</option>

            </select>

            <input
                type="number"
                name="calories"
                placeholder="Calories"
                value={formData.calories}
                onChange={handleChange}
                required
            />

            <input
                type="number"
                name="protein"
                placeholder="Protein (g)"
                value={formData.protein}
                onChange={handleChange}
                required
            />

            <input
                type="number"
                name="carbs"
                placeholder="Carbs (g)"
                value={formData.carbs}
                onChange={handleChange}
                required
            />

            <input
                type="number"
                name="fats"
                placeholder="Fats (g)"
                value={formData.fats}
                onChange={handleChange}
                required
            />

            <textarea

                rows="5"

                name="description"

                placeholder="Meal Description"

                value={formData.description}

                onChange={handleChange}

            />

            <button type="submit">

                {loading ? "Saving..." : "Add Meal"}

            </button>

        </form>

    );

};

export default MealForm;