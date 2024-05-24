import { useState, useEffect } from 'react';

import './App.css';
import {
  LOGIN_STATUS,
  CLIENT,
  SERVER,
} from './constants';
import {
  fetchLogin,
  fetchLogout,
  fetchSession,
  fetchtodos,
  fetchAddTask,
  fetchUpdateStatues,
  fetchDeleteTask,
  fetchUpdateTask,
} from './services';

import LoginForm from './component/LoginForm/LoginForm';
import Loading from './component/Loading/loading';
import Status from './Status';
import LoggedinForm from './component/LoggedinForm/LoggedinForm';

function App() {
  const [ error, setError ] = useState('');
  const [ username, setUsername] = useState('');
  const [ loginStatus, setLoginStatus ] = useState(LOGIN_STATUS.PENDING); 
  const [todos, setTodos] = useState([]);
  
  function onLogin(username) {
    fetchLogin(username)
      .then(() => {
        setError('');
        setUsername(username);
        setLoginStatus(LOGIN_STATUS.IS_LOGGED_IN);
        return fetchtodos();  // 添加这行代码来获取 todos
      })
      .then(todos => {
        setTodos(todos);  // 设置获取到的 todos 到状态
      })
      .catch(err => {
        setError(err?.error || 'ERROR');
      });
  }

  function toggleTodoStatus(id) {
    setError('');
    fetchUpdateStatues(id).then(() => {
      // 添加成功后，重新从服务器获取完整的todos列表
      fetchtodos().then(newTodosList => {
        setTodos(newTodosList); // 确保这里获得的每个todo的id都是唯一的
      });
    }).catch(error => console.error("Error adding todo:", error));
  }

  function deleteTodoById(id) {
    setError('');
    fetchDeleteTask(id).then(() => {
      fetchtodos().then(newTodosList => {
        setTodos(newTodosList);
      });
    }).catch(error => console.error("Error adding todo:", error));
  }

  
  
  function onLogout() {
    setError('');
    setUsername('');
    setLoginStatus(LOGIN_STATUS.NOT_LOGGED_IN);
    fetchLogout() 
    .catch( err => {
      setError(err?.error || 'ERROR'); 
    });
  }

  const updateTodo = (id, task) => {
    fetchUpdateTask(id, task) 
    .then(() => {
      fetchtodos().then(newTodosList => {
        setTodos(newTodosList);
      });
    })
    .catch(error => console.error("Error adding todo:", error));
    
  };

 
  
  function onAddTask(task) {
    fetchAddTask(task).then(() => {

      fetchtodos().then(newTodosList => {
        setTodos(newTodosList); 
      });
    }).catch(error => console.error("Error adding todo:", error));
  }

  function checkForSession() {
    fetchSession()
    .then( session => { 
      setUsername(session.username);
      setLoginStatus(LOGIN_STATUS.IS_LOGGED_IN);
      return fetchtodos(); 
    })
    .catch( err => {
      if( err?.error === SERVER.AUTH_MISSING ) {
        return Promise.reject({ error: CLIENT.NO_SESSION }) 
      }
      return Promise.reject(err);
    })
    .then( todos => {
      setTodos(todos);
    })
    .catch( err => {
      if( err?.error === CLIENT.NO_SESSION ) { 
        setLoginStatus(LOGIN_STATUS.NOT_LOGGED_IN);
        return;
      }
      setError(err?.error || 'ERROR');
    });

  }

  useEffect(
    () => {
      checkForSession();
    },
    [] 
  );

  return (
    <div className="app">
      <main className="">
        { error && <Status error={error}/> }
        { loginStatus === LOGIN_STATUS.PENDING && <Loading className="login__waiting">Loading user...</Loading> }
        { loginStatus === LOGIN_STATUS.NOT_LOGGED_IN && <LoginForm onLogin={onLogin}/> }
        { loginStatus === LOGIN_STATUS.IS_LOGGED_IN && < LoggedinForm onLogout={onLogout}  username={username} todos={todos} onAddTask={onAddTask} toggleTodoStatus={toggleTodoStatus} deleteTodoById={deleteTodoById} updateTodo={updateTodo}/> }
    
      </main>
    </div>
  );
}

export default App;
