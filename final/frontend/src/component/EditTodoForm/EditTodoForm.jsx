import { useState } from 'react';
import './EditTodoForm.css';

function EditTodoForm({ todo, updateTodo, cancelEdit }) {
  const [formData, setFormData] = useState({ name: todo.name, startTime: todo.startTime, endTime: todo.endTime });

  const handleSubmit = (e) => {
    e.preventDefault();
    updateTodo(todo.id, formData);
    cancelEdit();
  };


  return (
    <div className="editFormParent">
    <form className='editForm'onSubmit={handleSubmit}>
      <input
        type="text"
        value={formData.name}
        onChange={(e) => setFormData({...formData, name: e.target.value})}
        required
      />
      <input
        type="datetime-local"
        value={formData.startTime}
        onChange={(e) => setFormData({...formData, startTime: e.target.value})}
      />
      <input
        type="datetime-local"
        value={formData.endTime}
        onChange={(e) => setFormData({...formData, endTime: e.target.value})}
      />
      <button className='submitEdit'  type="submit">Save</button>
      <button className='cancelEdit' onClick={cancelEdit}>Cancel</button>
    </form>
    </div>
  );
}

export default EditTodoForm;