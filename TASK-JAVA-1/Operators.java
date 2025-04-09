/*1) Data Types & Operators Demo 
Question: A junior developer on your project is unsure how Java handles different data 
types and operators. Write a demonstration program that: 
1. Declares variables of each primitive data type (int, double, boolean, etc.). 
2. Applies arithmetic, comparison, and logical operators to them. 
3. Prints the outcomes with descriptive messages. 
4. Follows proper coding standards (naming conventions, indentation). */


public class Operators {

    public static void main(String[] args) {
        // 1. Primitive Data Types Declaration
        int num1 = 10;
        int num2 = 20;
        boolean bool1 = true;
        boolean bool2 = false;
        byte byte1 = 10;
        byte byte2 = 20;
        // 2. Arithmetic Operators
        System.out.println("Arithmetic Operators");
        System.out.println("Addition: " + (num1 + num2));   
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Modulus: " + (num1 % num2));
        System.out.println("Increment: " + (++num1));
        System.out.println("Decrement: " + (--num2));
        // 3. Comparison Operators
        System.out.println("Comparison Operators");
        System.out.println("Equal to: " + (num1 == num2));
        System.out.println("Not Equal to: " + (num1 != num2));
        System.out.println("Greater than: " + (num1 > num2));
        System.out.println("Less than: " + (num1 < num2));
        System.out.println("Greater than or Equal to: " + (num1 >= num2));
        System.out.println("Less than or Equal to: " + (num1 <= num2));
        // 4. Logical Operators
        System.out.println("Logical Operators");
        System.out.println("AND: " + (bool1 && bool2));
        System.out.println("OR: " + (bool1 || bool2));
        System.out.println("NOT: " + (!bool1));
        // 5. Bitwise Operators
        System.out.println("Bitwise Operators");
        System.out.println("AND: " + (byte1 & byte2));
        System.out.println("OR: " + (byte1 | byte2));
        System.out.println("XOR: " + (byte1 ^ byte2));
        System.out.println("Complement: " + (~byte1));
        System.out.println("Left Shift: " + (byte1 << 2));
        System.out.println("Right Shift: " + (byte1 >> 2));
        System.out.println("Zero Fill Right Shift: " + (byte1 >>> 2));
    }
    
}
