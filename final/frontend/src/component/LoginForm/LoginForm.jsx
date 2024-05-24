import { useState } from 'react';
import './LoginForm.css';

function LoginForm({ onLogin }) {

  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');

  function onChangeUsername(e) {
    setUsername(e.target.value);
  }

  function onChangePassword(e) {
    setPassword(e.target.value);
  }


  function onSubmit(e) {
    e.preventDefault(); 
    if(username) {  
      onLogin(username);
    }
  }

  return (
  <div className="login">
    <form className="login__form" onSubmit={onSubmit}>
      <label>
        <h2>Login</h2>
        <div>
          <span>Username:</span>
          <input className="login__username" value={username} onChange={onChangeUsername}/>
        </div>
        <div>
          <span>Password:</span>
          <input className="login__password" type="password" onChange={onChangePassword}/>
        </div>  
      </label>
      <button className="login__button" type="submit">Login</button>
    </form>
  </div>
);


}

export default LoginForm;
