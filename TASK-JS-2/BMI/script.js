var result = document.getElementById('bmi');

var calculate = function()
{
    var weight = parseFloat(document.getElementById("weight").value);
    var h1 = parseFloat(document.getElementById("height").value);
    var height = h1/100;
    var bmi = weight /(height * height);
    result.textContent = bmi.toFixed(2);
    if(bmi < 18.5)
    {
        document.getElementById("bmi-category").innerHTML = "Underweight";
    }
    else if(bmi >= 18.5 && bmi <= 24.9)
    {
        document.getElementById("bmi-category").innerHTML = "Healthy Weight";
    }
    else if (bmi >= 25 && bmi <= 29.9)
    {
        document.getElementById("bmi-category").innerHTML = "overweight";
    }
    else if (bmi >= 30 && bmi <= 34.9)
    {
        document.getElementById("bmi-category").innerHTML = "Obesity (class 1)";
    }
    else if (bmi >= 35 && bmi <= 39.9)
    {
        document.getElementById("bmi-category").innerHTML = "Obesity (class 2)";
    }
    else if(bmi >= 40)
    {
        document.getElementById("bmi-category").innerHTML = "Obesity (class 3) - Extremely obese";
    }
    else 
    {
        document.getElementById("bmi-category").innerHTML = "Invalid Input";
    }
};