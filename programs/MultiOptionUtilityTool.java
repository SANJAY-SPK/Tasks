/*Java task - 2 
 1) Multi-Option Utility Tool 
Question: A convenience store manager wants a single console tool for tasks like checking 
product prices, summing daily sales, or doing a basic unit conversion. Develop a Java 
program that: 
1. Presents a menu (e.g., 1) Check Price, 2) Calculate Sales Total, 3) Convert Units, 4) 
Exit). 
2. Uses loop + switch-case (or if-else) to handle each menu selection. 
3. Demonstrates input validation and clear output for each operation. 
*/

package programs;
import java.util.*;

public class MultiOptionUtilityTool {
    
    public static int inputValidation(Scanner sc) {
        int choice;
        while (true) {
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                if (choice >= 1 && choice <= 4) {
                    return choice;
                }
            } else {
                sc.next(); // Clear invalid input
            }
            System.out.print("Invalid choice. Please enter a number between 1 and 4: ");
        }
    }

    public static void checkPrice(Scanner sc) {
        Map<String, Double> productPrices = new HashMap<>();
        productPrices.put("milk", 2.5);
        productPrices.put("bread", 1.5);
        productPrices.put("eggs", 3.0);
        
        sc.nextLine(); // Consume leftover newline
        System.out.print("Enter product name: ");
        String product = sc.nextLine().trim();
        
        if (productPrices.containsKey(product)) {
            System.out.println("Price of " + product + " is: Rs. " + productPrices.get(product));
        } else {
            System.out.println("Product not found.");
        }
    }

    public static void calculateSalesTotal(Scanner sc) {
        double total = 0;
        System.out.println("Enter sales amounts (enter -1 to finish):");
        while (true) {
            if (sc.hasNextDouble()) {
                double sale = sc.nextDouble();
                if (sale == -1) break;
                if (sale < 0) {
                    System.out.println("Invalid input. Enter a positive value.");
                } else {
                    total += sale;
                }
            } else {
                System.out.println("Invalid input. Enter a numeric value.");
                sc.next(); // Clear invalid input
            }
        }
        System.out.println("Total sales: Rs. " + total);
    }

    public static void convertUnits(Scanner sc) {
        System.out.println("Unit Conversion: 1) Inches to Centimeters, 2) Pounds to Kilograms");
        System.out.print("Choose conversion type: ");

        int conversionType;
        while (true) {
            if (sc.hasNextInt()) {
                conversionType = sc.nextInt();
                break;
            } else {
                System.out.print("Invalid input. Enter 1 or 2: ");
                sc.next(); // Clear invalid input
            }
        }
        
        if (conversionType == 1) {
            System.out.print("Enter value in inches: ");
            while (!sc.hasNextDouble()) {
                System.out.print("Invalid input. Enter a valid number: ");
                sc.next();
            }
            double inches = sc.nextDouble();
            System.out.println(inches + " inches = " + (inches * 2.54) + " cm");
        } else if (conversionType == 2) {
            System.out.print("Enter value in pounds: ");
            while (!sc.hasNextDouble()) {
                System.out.print("Invalid input. Enter a valid number: ");
                sc.next();
            }
            double pounds = sc.nextDouble();
            System.out.println(pounds + " lbs = " + (pounds * 0.453592) + " kg");
        } else {
            System.out.println("Invalid choice for conversion.");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\nMulti-Option Utility Tool");
            System.out.println("1) Check Price");
            System.out.println("2) Calculate Sales Total");
            System.out.println("3) Convert Units");
            System.out.println("4) Exit");
            System.out.print("Enter your choice: ");

            choice = inputValidation(sc);
            
            switch (choice) {
                case 1:
                    checkPrice(sc);
                    break;
                case 2:
                    calculateSalesTotal(sc);
                    break;
                case 3:
                    convertUnits(sc);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return; // Exit program
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }
}
