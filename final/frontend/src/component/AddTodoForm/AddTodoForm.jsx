import { useState } from 'react';
import './AddTodoForm.css'; 
function AddTaskForm({ onAddTask , onTaskAdded ,onCancelTaskAdded}) {
  const [task, setTask] = useState({
    name: '',
    startTime: '',
    endTime: ''
  });

  function onSubmit(e) {
    e.preventDefault();
    if (!task.name || !task.startTime || !task.endTime) {
      alert('Please fill in all fields.');
      return; 
    }
    onAddTask(task);
    onTaskAdded();
    setTask({ name: '', startTime: '', endTime: '' });
  }
  

  function handleChange(e) {
    const { name, value } = e.target;
    setTask(prevTask => ({
      ...prevTask,
      [name]: value
    }));
  }

  return (
    <div className="task">
      <h2>Add a Task</h2>
      <form onSubmit={onSubmit}>
        <table className="task-form">
          <tbody>
            <tr>
              <td>
                <label>
                  Task Name:
                  <input
                    type="text"
                    name="name"
                    value={task.name}
                    onChange={handleChange}
                  />
                </label>
              </td>
            </tr>
            <tr>
              <td>
                <label>
                  Start Time:
                  <input
                    type="datetime-local"
                    name="startTime"
                    value={task.startTime}
                    onChange={handleChange}
                  />
                </label>
              </td>
            </tr>
            <tr>
              <td>
                <label>
                  End Time:
                  <input
                    type="datetime-local"
                    name="endTime"
                    value={task.endTime}
                    onChange={handleChange}
                  />
                </label>
              </td>
            </tr>
            <tr>
              <td>
                <button type="submit" className="form-btn">
                  Submit
                </button>
                <button className="delete-btn" onClick={onCancelTaskAdded}>Cancel</button>
              </td>
            </tr>
          </tbody>
        </table>
      </form>
    </div>
  );
}


export default AddTaskForm;
