import React, { useState } from "react";
import BlogPost from "./BlogPost";
import Filter from "./Filter";
import "./styles/BlogList.css";

const allPosts = [
  {
    id: 1,
    title: "Mastering React",
    content: "React is a JavaScript library for building user interfaces...",
    author: "Jane Doe",
    date: "April 8, 2025",
    comments: ["Great post!", "Very informative!"],
  },
  {
    id: 2,
    title: "Understanding Hooks",
    content: "Hooks let you use state and other React features without writing a class.",
    author: "John Smith",
    date: "April 7, 2025",
    comments: ["Loved it!", "More on useEffect please!"],
  },
  {
    id: 3,
    title: "JavaScript Fundamentals",
    content: "Variables, functions, loops – the foundation of web development.",
    author: "Emily Johnson",
    date: "April 6, 2025",
    comments: ["Nice summary!", "Super useful."],
  },
  {
    id: 4,
    title: "Async JavaScript Explained",
    content: "Promises, async/await – learn to handle asynchronous operations.",
    author: "David Lee",
    date: "April 5, 2025",
    comments: ["Thanks!", "This cleared my confusion."],
  },
  {
    id: 5,
    title: "CSS Grid vs Flexbox",
    content: "Learn when to use grid and when to use flex layout in CSS.",
    author: "Nina Patel",
    date: "April 4, 2025",
    comments: ["This is gold!", "Flexbox master now!"],
  },
  {
    id: 6,
    title: "Deploying React Apps",
    content: "How to deploy React apps to Netlify, Vercel, or GitHub Pages.",
    author: "Alex Turner",
    date: "April 3, 2025",
    comments: ["Straightforward guide!", "Deployed in 5 minutes!"],
  },
  {
    id: 7,
    title: "Writing Clean Code",
    content: "Code should be easy to understand, modify, and extend.",
    author: "Sophie Lee",
    date: "April 2, 2025",
    comments: ["Bookmarked!", "Every dev should read this."],
  },
];

const BlogList = () => {
  const [filteredPosts, setFilteredPosts] = useState(allPosts);

  const handleFilterChange = (query) => {
    const lower = query.toLowerCase();
    const filtered = allPosts.filter(
      (post) =>
        post.title.toLowerCase().includes(lower) ||
        post.author.toLowerCase().includes(lower)
    );
    setFilteredPosts(filtered);
  };

  return (
    <div className="blog-list">
      <Filter onFilterChange={handleFilterChange} />
      {filteredPosts.map((post) => (
        <BlogPost key={post.id} post={post} />
      ))}
    </div>
  );
};

export default BlogList;
