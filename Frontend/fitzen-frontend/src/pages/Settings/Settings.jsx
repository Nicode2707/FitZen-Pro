import Sidebar from "../../components/Sidebar/Sidebar";
import Navbar from "../../components/Navbar/Navbar";

import AccountSettings from "../../components/Settings/AccountSettings";
import AppSettings from "../../components/Settings/AppSettings";

import "./Settings.css";

const Settings = () => {
  return (
    <div className="dashboard">

      <Sidebar />

      <main className="dashboard-content">

        <Navbar />

        <div className="settings-page">

          <div className="settings-header">

            <h1>⚙️ Settings</h1>

            <p>
              Manage your FitZen account and application preferences.
            </p>

          </div>

          <AccountSettings />

          <AppSettings />

        </div>

      </main>

    </div>
  );
};

export default Settings;