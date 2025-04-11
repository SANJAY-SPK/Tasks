import React from "react";
import "./Styles/Comments.css";

const Comments = ({ comments }) => (
  <div className="comments">
    <h4>Comments:</h4>
    <ul>
      {comments.map((comment, index) => (
        <li key={index}>{comment}</li>
      ))}
    </ul>
  </div>
);

export default Comments;
