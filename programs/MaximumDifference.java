// Date: 03/10/2021
/*Given an integer array nums, return the maximum difference between two successive elements in its sorted form. If the array contains less than two elements, return 0.
You must write an algorithm that runs in linear time and uses linear extra space.
 
Example 1:
Input: nums = [3,6,9,1]
Output: 3
Explanation: The sorted form of the array is [1,3,6,9], either (3,6) or (6,9) has the maximum difference 3.
Example 2:
Input: nums = [10]
Output: 0
Explanation: The array contains less than 2 elements, therefore return 0.
 
Constraints:
•	1 <= nums.length <= 105
•	0 <= nums[i] <= 109*/


package programs;

import java.util.*;

public class MaximumDifference {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();

        System.out.println(maximumGap(nums));
    }

    public static int maximumGap(int[] nums) {
        if (nums.length < 2) {
            return 0; // If there are less than 2 elements, return 0
        }

        // Step 1: Find the minimum and maximum values in the array
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        // Step 2: Calculate bucket size and number of buckets
        int n = nums.length;
        int bucketSize = Math.max(1, (max - min) / (n - 1)); // Ensure bucket size is at least 1
        int bucketCount = (max - min) / bucketSize + 1;

        // Step 3: Initialize buckets
        int[] bucketMin = new int[bucketCount];
        int[] bucketMax = new int[bucketCount];
        Arrays.fill(bucketMin, Integer.MAX_VALUE);
        Arrays.fill(bucketMax, Integer.MIN_VALUE);

        // Step 4: Place elements into buckets
        for (int num : nums) {
            int bucketIndex = (num - min) / bucketSize;
            bucketMin[bucketIndex] = Math.min(bucketMin[bucketIndex], num);
            bucketMax[bucketIndex] = Math.max(bucketMax[bucketIndex], num);
        }

        // Step 5: Calculate the maximum gap
        int maxGap = 0;
        int previousMax = min; // Start with the minimum value
        for (int i = 0; i < bucketCount; i++) {
            if (bucketMin[i] == Integer.MAX_VALUE) {
                // Skip empty buckets
                continue;
            }
            // Update the maximum gap
            maxGap = Math.max(maxGap, bucketMin[i] - previousMax);
            previousMax = bucketMax[i];
        }

        return maxGap;
    }
}