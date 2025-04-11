import React, { useState } from "react";
import "./styles/Filter.css";

const Filter = ({ onFilterChange }) => {
  const [searchTerm, setSearchTerm] = useState("");

  const handleChange = (e) => {
    const value = e.target.value;
    setSearchTerm(value);
    onFilterChange(value);
  };

  return (
    <div className="filter-container">
      <input
        type="text"
        placeholder="Search by title or author..."
        value={searchTerm}
        onChange={handleChange}
        className="filter-input"
      />
    </div>
  );
};

export default Filter;
