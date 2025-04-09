package programs;

public class BitwiseLogicalOperations {

    public static void main(String[] args) {
        int mask1 = 0b0101; 
        int mask2 = 0b0011; 

        // Demonstrating bitwise operators
        System.out.println("Bitwise AND (&): " + (mask1 & mask2)); 
        System.out.println("Bitwise OR (|): " + (mask1 | mask2));  
        System.out.println("Bitwise XOR (^): " + (mask1 ^ mask2)); 
        System.out.println("Left Shift (<<): " + (mask1 << 1));    
        System.out.println("Right Shift (>>): " + (mask1 >> 1));   

        boolean condition1 = false;
        boolean condition2 = true;

        System.out.println("\nLogical AND (&&):");
        if (condition1 && expensiveOperation()) {
            System.out.println("This won't be printed because condition1 is false (short-circuited).");
        }

        System.out.println("\nBitwise AND (&):");
        if (condition1 & expensiveOperation()) {
            System.out.println("This will evaluate both operands, even though condition1 is false.");
        }

        System.out.println("\nLogical OR (||):");
        if (condition2 || expensiveOperation()) {
            System.out.println("This is printed because condition2 is true (short-circuited).");
        }

        System.out.println("\nBitwise OR (|):");
        if (condition2 | expensiveOperation()) {
            System.out.println("This will evaluate both operands, even though condition2 is true.");
        }
    }

    private static boolean expensiveOperation() {
        System.out.println("Expensive operation executed!");
        return true;
    }
}
