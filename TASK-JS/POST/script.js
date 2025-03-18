document.addEventListener("DOMContentLoaded", function () {
    const images = document.querySelectorAll(".gallery-image");
    const likeButtons = document.querySelectorAll(".button");
    const likeCounts = document.querySelectorAll(".like-count");

    
    images.forEach((image) => {
        image.addEventListener("mouseover", () => {
            image.style.boxShadow = "0 0 10px rgba(0, 0, 0, 0.5)";
        });

        image.addEventListener("mouseout", () => {
            image.style.boxShadow = "none";
        });
    });

    
    likeButtons.forEach((button, index) => {
        button.addEventListener("click", () => {
            let currentLikes = parseInt(likeCounts[index].textContent);
            likeCounts[index].textContent = currentLikes + 1;
        });
    });
});
