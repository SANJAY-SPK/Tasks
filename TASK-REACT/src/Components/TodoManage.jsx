import React, { useState } from 'react';
import TodoForm from './TodoForm';
import TodoList from './TodoList';

function Manage() {
    const [todos, setTodos] = useState([]);
  
    const addTodo = (text) => {
      const newTodo = {
        id: Date.now(),
        text,
        completed: false,
      };
      setTodos((prev) => [...prev, newTodo]);
    };
  
    const toggleTodo = (id) => {
      setTodos((prev) =>
        prev.map((todo) =>
          todo.id === id ? { ...todo, completed: !todo.completed } : todo
        )
      );
    };
  
    const deleteTodo = (id) => {
      setTodos((prev) => prev.filter((todo) => todo.id !== id));
    };
  
    return (
      <div>
        <h1>Todo List</h1>
        <TodoForm addTodo={addTodo} />
        <TodoList todos={todos} toggleTodo={toggleTodo} deleteTodo={deleteTodo} />
      </div>
    );
  }
  
  export default Manage;