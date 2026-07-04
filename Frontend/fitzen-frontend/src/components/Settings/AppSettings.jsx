import "./AppSettings.css";

const AppSettings = () => {

  return (

    <div className="app-settings">

      <h2>🎨 Application</h2>

      <div className="setting-row">

        <span>Dark Mode</span>

        <input type="checkbox" defaultChecked />

      </div>

      <div className="setting-row">

        <span>Email Notifications</span>

        <input type="checkbox" defaultChecked />

      </div>

      <div className="setting-row">

        <span>Workout Reminders</span>

        <input type="checkbox" />

      </div>

      <div className="setting-row">

        <span>Meal Notifications</span>

        <input type="checkbox" defaultChecked />

      </div>

    </div>

  );

};

export default AppSettings;