import React, { useState } from 'react';
import './Todos.css';
import EditTodoForm from '../EditTodoForm/EditTodoForm';

function Todos({ todos, toggleTodoStatus, deleteTodoById, updateTodo }) {
  const [editingId, setEditingId] = useState(null);
  const [searchTerm, setSearchTerm] = useState("");

  if (!todos) {
    return <div>Loading todos...</div>;
  }

  const todoArray = Object.values(todos);
  if (todoArray.length === 0) {
    return <div>No todos found.</div>;
  }

  const handleCancel = () => {
    setEditingId(null);
  };


  const filteredTodos = todoArray.filter(todo =>
    todo.name.toLowerCase().includes(searchTerm.toLowerCase())
  );

  return (
    <div className="todos">
      <h2>Todo List</h2>
      <input
        type="text"
        placeholder="Search todos..."
        value={searchTerm}
        onChange={(e) => setSearchTerm(e.target.value)}
        className="search-box"
      />
      <ul>
        {filteredTodos.map(todo => (
          <li key={todo.id} className={`todo-item ${todo.done ? 'todo-item-completed' : ''}`}>
            {editingId === todo.id ? (
              <EditTodoForm
                todo={todo}
                updateTodo={updateTodo}
                cancelEdit={handleCancel}
              />
            ) : (
              <>
                <div className="todo-item-status">
                  <input
                    type="checkbox"
                    id={`todo-status-${todo.id}`}
                    className="checkbox-custom"
                    name={`status-${todo.id}`}
                    checked={todo.done}
                    onChange={() => toggleTodoStatus(todo.id)}
                  />
                  <label htmlFor={`todo-status-${todo.id}`}></label>
                </div>
                <div><button className="delete-button" onClick={() => deleteTodoById(todo.id)}>Delete</button></div>
                <div className="todo-item-content">
                  <h2>Task: </h2>
                  <span>{todo.name}</span>
                 
                  
                </div>
                <div className="todo-item-startTime">
                  Start Time: {todo.startTime}
                </div>
                <div className="todo-item-endTime">
                  End Time: {todo.endTime}
                </div>
                <button 
                  className="edit-button"
                  onClick={() => {
                    if (!todo.done) {  
                      setEditingId(todo.id);
                    }
                  }}
                  disabled={todo.done}  
                >
                  Edit
                </button>
              </>
            )}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default Todos;
