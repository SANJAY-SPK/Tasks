// import UserName from "./Components/UserName";
// import UserAge from "./Components/UserAge";
import Gallery from "./Components/Gallery";
import FruitCart from "./Components/FruitCart";
import BlogPost from "./Components/BlogPost";
import Footer from "./Components/Footer";
import Date from "./Components/Date";
import RandomQuote from "./Components/RandomQuote";
import Result from "./Components/Result";
import Movie from "./Components/MovieRating";
import UserStatus from "./Components/UserStatus";
import Counter from "./Components/Counter";
import { ThemeProvider } from "./Components/ThemeContext";
import Home from "./Components/Home";
import Manage from "./Components/TodoManage";
function App() {
  return (
    <div>
      {/* <h1>React App</h1>
       <RandomQuote />
      <Date />
      <Gallery />
      <FruitCart />
      <BlogPost />
      <Movie title="Inception" year="2011" rating="9.5" />
      <Movie title="Interstellar" year="2014" rating="9" />
      <Movie title="The Dark Knight" year="2008" rating="9.5" /> 
      <Result /> 
      <UserStatus name="Sanjay" isOnline={true} age={21}/>
      <UserStatus name="Prasadh" isOnline={false} age={21}/> */}
      {/* <ThemeProvider>
        <Home />
      </ThemeProvider> */}
      <Manage/>
      
    </div>
  );
}

export default App;