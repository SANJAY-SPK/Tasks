/*Problem-1
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.
 
Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:
Input: nums = [0]
Output: [0]
 
Constraints:
•	1 <= nums.length <= 104
•	-231 <= nums[i] <= 231 - 1 */



package programs;


import java.util.*;
public class Releativeorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int r= 0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[r] = arr[i];
                r++;
            }
        }
        for(int i=r;i<n;i++){
            arr[i] = 0;
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        }
    
}
