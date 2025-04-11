import React from "react";
import BlogList from "./Components/BlogList";
import Header from "./Components/Header";
import Footer from "./Components/Footer";
import RandomQuote from "./Components/RandomQuote";

function App() {
  return (
    <div className="App">
      <Header />
      <RandomQuote />
      <BlogList />
      <Footer />
    </div>
  );
}

export default App;
