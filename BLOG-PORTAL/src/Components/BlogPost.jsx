import React from "react";
import PostTitle from "./PostTitle";
import PostContent from "./PostContent";
import PostAuthor from "./PostAuthor";
import Comments from "./Comments";
import "./Styles/BlogPost.css";

const BlogPost = ({ post }) => {
  return (
    <div className="blog-post">
      <PostTitle title={post.title} />
      <PostAuthor author={post.author} date={post.date} />
      <PostContent content={post.content} />
      <Comments comments={post.comments} />
    </div>
  );
};

export default BlogPost;
