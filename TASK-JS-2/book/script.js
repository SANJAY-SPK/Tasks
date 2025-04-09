
let books = [

    {
        id: 1,
        title: "The Alchemist",
        author: "Paulo Coelho",
        isAvailable: true

    },

    {
        id: 2,
        title: "The Power of Now",
        author: "Eckhart Tolle",
        isAvailable: true
    }
];

function bookAvailable(title)
{
    let bookObj = books.find(book => book.title.toLowerCase() === title.toLowerCase());
    if(bookObj)
    {
        if(bookObj.isAvailable)
            {
                bookObj.isAvailable=false;
                return "you have checked out " + bookObj.title;    
            }
            else
            {
                return "sorry, Not available";
            }
    }
}

document.getElementById("userMessage").addEventListener("input", function () {
    let userInput = this.value;
    let message = bookAvailable(userInput);
    document.getElementById("outputMessage").innerText = message;
});