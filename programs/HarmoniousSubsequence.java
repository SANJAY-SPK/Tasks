/* 
We define a harmonious array as an array where the difference between its maximum value and its minimum value is exactly 1.
Given an integer array nums, return the length of its longest harmonious subsequence among all its possible subsequences.
 
Example 1:
Input: nums = [1,3,2,2,5,2,3,7]
Output: 5
Explanation:
/The longest harmonious subsequence is [3,2,2,2,3].
Example 2:
Input: nums = [1,2,3,4]
Output: 2
Explanation:
The longest harmonious subsequences are [1,2], [2,3], and [3,4], all of which have a length of 2.
Example 3:
Input: nums = [1,1,1,1]
Output: 0
Explanation:
No harmonic subsequence exists.
 
Constraints:
•	1 <= nums.length <= 2 * 104
•	-109 <= nums[i] <= 109 */


package programs;

import java.util.*;
public class HarmoniousSubsequence {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        } sc.close();

        int left = 0;int right = 0;int max = 0;

        while(right<n)
        {
            if(arr[right]-arr[left]==1)
            {
                max = Math.max(max,right-left+1);
                right++;
            }
            else if(arr[right]-arr[left]>1)
            {
                left++;
            }
            else
            {
                right++;
            }
        }
        System.out.println(max);
    }
    
}
