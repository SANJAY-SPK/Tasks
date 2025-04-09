/*2) Stock Quantity Checker 
Question: A warehouse system needs to classify stock quantities (e.g., “low,” “medium,” 
“high”) and includes simple loops for numeric checks. Create a Java program that: 
1. Prompts a user for a stock amount, using if-else to categorize the value (e.g., <50 
= low, 50–200 = medium, >200 = high). 
2. Uses a for loop to print numbers 1–10 but skip 5 with continue. 
3. Uses a while loop that keeps adding 10 to a running total until it exceeds 100, then 
stops using break.  */


import java.util.*;
public class StockChecker {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the stock amount: ");
        int stock = sc.nextInt();
        if(stock<50)
        {
            System.out.println("Low");
        }
        else if(stock>=50 && stock<=200)
        {
            System.out.println("Medium");
        }
        else
        {
            System.out.println("High");
        }
        System.out.println("Numbers from 1 to 10 excluding 5 are: ");   
        for(int i=1;i<=10;i++)
        {
            if(i==5)
            {
                continue;
            }
            System.out.println(i);
        }
        int sum=0;
        while(true)
        {
            sum+=10;
            if(sum>100)
            {
                break;
            }
        }
        sc.close();
        System.out.println("Sum is: "+sum); 
    }
    
    
}
