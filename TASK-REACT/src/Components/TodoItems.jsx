import React from 'react';

function TodoItem({ todo, toggleTodo, deleteTodo }) {
  return (
    <div style={cardStyle}>
      <input
        type="checkbox"
        checked={todo.completed}
        onChange={() => toggleTodo(todo.id)}
        style={{ marginRight: '1rem' }}
      />
      <span
        style={{
          textDecoration: todo.completed ? 'line-through' : 'none',
          flex: 1,
        }}
      >
        {todo.text}
      </span>
      <button onClick={() => deleteTodo(todo.id)} style={deleteButtonStyle}>
        ❌
      </button>
    </div>
  );
}

const cardStyle = {
  display: 'flex',
  alignItems: 'center',
  justifyContent: 'space-between',
  padding: '1rem',
  margin: '0.5rem 0',
  border: '1px solid #ddd',
  borderRadius: '8px',
  boxShadow: '0 2px 5px rgba(0, 0, 0, 0.49)',
  backgroundColor: '#f9f9f9',
};

const deleteButtonStyle = {
  backgroundColor: 'transparent',
  border: 'none',
  fontSize: '1.2rem',
  cursor: 'pointer',
};

export default TodoItem;
