// Problem-1
// You are given a list of daily prices of a stock. You can buy a stock on one day and sell it later on another day after the day you bought the stock. You can perform the above operation only once. What is the maximum loss possible?
// Example
// Prices=[10,4,2,9]
// The greatest loss is incurred when you buy at a price of 10 and sell at a price of 2. Return the difference:9.
// Example
// Price=[1,2,3,4]
// The Price went up every day. Return 0.
// Sample Input for Custom Testing
// STDIN                   Function
// ———–               ————–
// •	   7   → Prices []  size n=7
// •	   1 →       prices =[1,8,4,2,10,3,2]
// •	   8
// •	   4
// •	   2
// •	  10
// •	   3
// •	   2
// Sample Output
// •	  8
// Explanation
// Using zero-based index notation, the correct answer is a[4]-a[6]=10-2=8. There is a greater difference between 10 and 1 but that would imply selling before buying, and short selling is not allowed in this problem.

package programs;
import java.util.Scanner;
public class Main
{
    public static int loss(int[] prices,int n)
    {
        if(n<2)
        {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int maxloss = 0;
        for(int i=0;i<n;i++)
        {
            max = Math.max(max,prices[i]);
            maxloss = Math.max(maxloss,max-prices[i]);
        }
        if(maxloss == 0)
        {
            return 0;
        }
        return maxloss;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for(int i=0;i<n;i++)
        {
            prices[i] = sc.nextInt();
        }
        int res = loss(prices,n);
        System.out.println("Maxloss is "  +" "+ res);
    }
}
    



