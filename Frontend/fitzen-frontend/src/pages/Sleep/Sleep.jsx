import "./Sleep.css";

import Sidebar from "../../components/Sidebar/Sidebar";
import Navbar from "../../components/Navbar/Navbar";

import SleepForm from "../../components/Sleep/SleepForm";
import SleepList from "../../components/Sleep/SleepList";

const Sleep = () => {

    return(

        <div className="dashboard">

            <Sidebar/>

            <main className="dashboard-content">

                <Navbar/>

                <div className="sleep-header">

                    <h1>😴 Sleep Tracker</h1>

                    <p>
                        Track your sleep quality and daily sleeping habits.
                    </p>

                </div>

                <SleepForm/>

                <SleepList/>

            </main>

        </div>

    );

};

export default Sleep;