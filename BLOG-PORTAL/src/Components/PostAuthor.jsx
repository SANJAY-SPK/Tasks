import React from "react";

const PostAuthor = ({ author, date }) => (
  <p className="post-author">
    By {author} on {date}
  </p>
);

export default PostAuthor;
