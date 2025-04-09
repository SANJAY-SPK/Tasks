/*786. K-th Smallest Prime Fraction
Medium
Topics
Companies
You are given a sorted integer array arr containing 1 and prime numbers, where all the integers of arr are unique. You are also given an integer k.

For every i and j where 0 <= i < j < arr.length, we consider the fraction arr[i] / arr[j].

Return the kth smallest fraction considered. Return your answer as an array of integers of size 2, where answer[0] == arr[i] and answer[1] == arr[j].

 

Example 1:

Input: arr = [1,2,3,5], k = 3
Output: [2,5]
Explanation: The fractions to be considered in sorted order are:
1/5, 1/3, 2/5, 1/2, 3/5, and 2/3.
The third fraction is 2/5.
Example 2:

Input: arr = [1,7], k = 1
Output: [1,7]
 */
package programs;
import java.util.*;
public class PrimeFraction {

    public int[] kthSmallestPrimeFraction(int[] arr, int k) {

        ArrayList<int[]> res = new ArrayList<>();
        for(int i =0;i<arr.length;i++)
        {
            for(int j =i+1;j<arr.length;j++)
            {
                res.add(new int[]{arr[i],arr[j]});
            }
        }

        res.sort((a,b)->{
            return a[0]*b[1] - a[1]*b[0];
        });

        return res.get(k-1);
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        PrimeFraction pf = new PrimeFraction();
        int[] res = pf.kthSmallestPrimeFraction(arr, k);
        System.out.println(res[0] + " " + res[1]);
    }


    
}
