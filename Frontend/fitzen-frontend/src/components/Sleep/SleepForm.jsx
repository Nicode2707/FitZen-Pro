import { useState } from "react";
import "./SleepForm.css";
import { createSleep } from "../../services/sleepService";

const SleepForm = () => {

    const [formData, setFormData] = useState({

        sleepHours: "",
        sleepQuality: "",
        bedTime: "",
        wakeTime: "",
        sleepDate: ""

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

            await createSleep({

                sleepHours:Number(formData.sleepHours),

                sleepQuality:formData.sleepQuality,

                bedTime:formData.bedTime,

                wakeTime:formData.wakeTime,

                sleepDate:formData.sleepDate

            });

            alert("✅ Sleep Record Added");

            setFormData({

                sleepHours:"",
                sleepQuality:"",
                bedTime:"",
                wakeTime:"",
                sleepDate:""

            });

        }

        catch(error){

            console.log(error);

            alert("❌ Failed to Save");

        }

        setLoading(false);

    };

    return(

        <form
        className="sleep-form"
        onSubmit={handleSubmit}
        >

            <input

                type="number"

                step="0.5"

                placeholder="Sleep Hours"

                name="sleepHours"

                value={formData.sleepHours}

                onChange={handleChange}

                required

            />

            <select

                name="sleepQuality"

                value={formData.sleepQuality}

                onChange={handleChange}

                required

            >

                <option value="">Sleep Quality</option>

                <option>Excellent</option>

                <option>Good</option>

                <option>Average</option>

                <option>Poor</option>

            </select>

            <label>Bed Time</label>

            <input

                type="time"

                name="bedTime"

                value={formData.bedTime}

                onChange={handleChange}

                required

            />

            <label>Wake Time</label>

            <input

                type="time"

                name="wakeTime"

                value={formData.wakeTime}

                onChange={handleChange}

                required

            />

            <label>Sleep Date</label>

            <input

                type="date"

                name="sleepDate"

                value={formData.sleepDate}

                onChange={handleChange}

                required

            />

            <button type="submit">

                {

                    loading

                    ?

                    "Saving..."

                    :

                    "Save Sleep"

                }

            </button>

        </form>

    );

};

export default SleepForm;