import "./ActivityTimeline.css";

const history = [

{
time:"Today",
activity:"🏋 Chest Workout Completed"
},

{
time:"Today",
activity:"🥗 Lunch Logged"
},

{
time:"Yesterday",
activity:"😴 Slept 7.8 Hours"
},

{
time:"Yesterday",
activity:"🚶 12,000 Steps Completed"
},

{
time:"2 Days Ago",
activity:"💧 Water Goal Completed"
}

];

const ActivityTimeline=()=>{

return(

<div className="timeline">

<h2>Recent Activity</h2>

{history.map((item,index)=>(

<div className="timeline-item" key={index}>

<div className="timeline-dot"></div>

<div>

<h4>{item.activity}</h4>

<p>{item.time}</p>

</div>

</div>

))}

</div>

);

};

export default ActivityTimeline;