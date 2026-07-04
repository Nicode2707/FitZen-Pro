import "./UserStats.css";

const stats = [

{ title:"Workouts", value:"52" },

{ title:"Meals", value:"140" },

{ title:"Sleep Avg", value:"7.8 hrs" },

{ title:"Goals", value:"6" }

];

const UserStats = () => {

  return (

    <div className="user-stats">

      {stats.map((item,index)=>(

        <div className="stat-card" key={index}>

          <h2>{item.value}</h2>

          <p>{item.title}</p>

        </div>

      ))}

    </div>

  );

};

export default UserStats;