const MovieRating = ({ title,year,rating = "Not Rated" }) => {
    return (
        <div>
            <h1>Movie Rating</h1>
            <h2>Movie:{title}</h2>
            <h2>Year: {year}</h2>
            <h2>Rating: {rating}</h2>
            <button>Like</button>
        </div>
    )
};
export default MovieRating;


