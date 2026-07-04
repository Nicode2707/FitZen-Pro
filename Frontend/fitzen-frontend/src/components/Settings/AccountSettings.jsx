import "./AccountSettings.css";

const AccountSettings = () => {

  return (

    <div className="account-settings">

      <h2>🔐 Account</h2>

      <div className="setting-item">

        <span>Change Password</span>

        <button>Update</button>

      </div>

      <div className="setting-item">

        <span>Change Email</span>

        <button>Edit</button>

      </div>

      <div className="setting-item">

        <span>Logout</span>

        <button className="logout-btn">Logout</button>

      </div>

    </div>

  );

};

export default AccountSettings;