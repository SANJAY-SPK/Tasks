import { useState } from 'react';

function TodoForm({ addTodo }) {
  const [text, setText] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();
    if (text.trim()) {
      addTodo(text);
      setText('');
    }
  };

  return (
    <form onSubmit={handleSubmit} className="todo-form">
      <input 
        type="text" 
        placeholder="Add a todo..." 
        value={text} 
        onChange={(e) => setText(e.target.value)} 
      />
      <button type="submit">Add</button>
    </form>
  );
}

export default TodoForm;