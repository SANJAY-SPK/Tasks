function calculateDiscount() {
    const membership = document.getElementById("membership").value;
    const couponValid = document.getElementById("coupon").checked;
    const isLoggedIn = document.getElementById("loggedIn").checked;

    let discount;

    
    if (isLoggedIn && couponValid) {
        discount = (membership === "Gold" ) ? 20 :10;
    } else if (!couponValid) {
        discount = 0;
        document.getElementById("result").textContent = "Coupon is invalid, no discount applies.";
        return;
    } else {
        discount = 0;
        document.getElementById("result").textContent = "No discount applies.";
        return;
    }

  
    if (discount > 0) {
        document.getElementById("result").textContent = `You get a ${discount}% discount!`;
    } else {
        document.getElementById("result").textContent = "No discount applies.";
    }
}
