function RandomQuote() {
    const quotes = [
        "The greatest glory in living lies not in never falling, but in rising every time we fall.",
        "The way to get started is to quit talking and begin doing.",
        "Your time is limited, so don't waste it living someone else's life.",
        "If life were predictable it would cease to be life, and be without flavor.",
        "Don't watch the clock; do what it does. Keep going.",
    ];
    const randomIndex = Math.floor(Math.random() * quotes.length);
    return <p>Quote of the Day: {quotes[randomIndex]}</p>;
}

export default RandomQuote;
 