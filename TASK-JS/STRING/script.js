function normalizeMessage() {  
    let inputField = document.getElementById("userMessage");  
    let message = inputField.value.trim();  
    let output = document.getElementById("outputMessage");  

    if (message.length === 0) {  
        alert("Please enter a message.");  
        output.textContent = "";  
        return;  
    }  

    message = message.length < 10 ? message.toUpperCase() : message.toLowerCase();  

    output.textContent = "Transformed Message: " + message;  
}  