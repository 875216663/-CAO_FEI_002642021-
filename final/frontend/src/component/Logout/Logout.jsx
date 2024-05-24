import './Logout.css';


function Logout({ onLogout }) {
  return (
    <div className="controls">
      <button onClick={onLogout} className="controls__logout btn">Logout</button>
    </div>
  );
}

export default Logout;
