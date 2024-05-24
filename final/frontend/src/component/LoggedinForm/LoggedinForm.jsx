import Logout from '../Logout/Logout';
import Todos from '../Todos/Todos';
import AddTodoForm from '../AddTodoForm/AddTodoForm';
import { useState } from 'react';
import './LoggedinForm.css';




function LoggedinForm({ onLogout, username, todos ,onAddTask ,toggleTodoStatus ,deleteTodoById, updateTodo}) {
  
  const [addTask, setAddTask] = useState(false);

  function handleAddTaskClick() {
    setAddTask(true);
  }

  function handleTaskAdded() {
    setAddTask(false); 
  }

  function onCancelTaskAdded() {
    setAddTask(false); 
  }
  return (
    <div className="content">
      <h1>Hello, {username},Welcome to this task manager!!</h1>
      <button className='addTask' onClick={handleAddTaskClick}>New Task</button>
      {addTask &&<AddTodoForm onAddTask={onAddTask} onTaskAdded={handleTaskAdded} onCancelTaskAdded={onCancelTaskAdded}/>}
      <Todos  todos={todos} toggleTodoStatus={toggleTodoStatus} deleteTodoById={deleteTodoById} updateTodo={updateTodo}/>
      <Logout onLogout={onLogout} />
    </div>
  );
}

export default LoggedinForm;
