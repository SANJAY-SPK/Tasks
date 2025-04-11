import React from "react";
import "./Styles/RandomQuote.css";

const RandomQuote = () => {
  const quotes = [
    "Code is like humor. When you have to explain it, it’s bad.",
    "Programs must be written for people to read.",
    "Before software can be reusable it first has to be usable.",
  ];
  const quote = quotes[Math.floor(Math.random() * quotes.length)];

  return <div className="random-quote">💬 {quote}</div>;
};

export default RandomQuote;
