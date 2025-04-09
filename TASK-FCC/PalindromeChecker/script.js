// Function to check if a string is a palindrome
function checkPalindrome() {
    // Get the input value
    const input = document.getElementById("text-input").value;

    // Check if the input is empty
    if (!input.trim()) {
        alert("Please input a value.");
        return;
    }

    // Remove non-alphanumeric characters and convert to lowercase
    const cleanedInput = input.replace(/[^a-zA-Z0-9]/g, "").toLowerCase();

    // Reverse the cleaned input
    const reversedInput = cleanedInput.split("").reverse().join("");

    // Check if the cleaned input is equal to the reversed input
    const isPalindrome = cleanedInput === reversedInput;

    // Display the result
    const result = document.getElementById("result");
    if (isPalindrome) {
        result.textContent = `${input} is a palindrome.`;
        result.style.color = "green";
    } else {
        result.textContent = `${input} is not a palindrome.`;
        result.style.color = "red";
    }
}

// Add event listener to the button
document.getElementById("check-btn").addEventListener("click", checkPalindrome);