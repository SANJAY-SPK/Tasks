/*  692. Top K Frequent Words
Medium
Topics
Companies
Given an array of strings words and an integer k, return the k most frequent strings.

Return the answer sorted by the frequency from highest to lowest. Sort the words with the same frequency by their lexicographical order.

 

Example 1:

Input: words = ["i","love","leetcode","i","love","coding"], k = 2
Output: ["i","love"]
Explanation: "i" and "love" are the two most frequent words.
Note that "i" comes before "love" due to a lower alphabetical order.
Example 2:

Input: words = ["the","day","is","sunny","the","the","the","sunny","is","is"], k = 4
Output: ["the","is","sunny","day"]
Explanation: "the", "is", "sunny" and "day" are the four most frequent words, with the number of occurrence being 4, 3, 2 and 1 respectively.
 

Constraints:

1 <= words.length <= 500
1 <= words[i].length <= 10
words[i] consists of lowercase English letters.
k is in the range [1, The number of unique words[i]]
 

Follow-up: Could you solve it in O(n log(k)) time and O(n) extra space? */

package programs;
import java.util.*;
public class FrequencyWords {

    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> hm = new HashMap<>();  
        ArrayList<String> nums = new ArrayList<>();  
        for (int i = 0; i < words.length; i++) 
        {  
            if (hm.containsKey(words[i])) 
            {  
                hm.put(words[i], hm.get(words[i]) + 1);  
            } 
            else 
            {  
            hm.put(words[i], 1);  
            }  
        }  

        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
            (a, b) -> a.getValue().equals(b.getValue()) 
                ? a.getKey().compareTo(b.getKey()) 
                : b.getValue() - a.getValue()
        );

        pq.addAll(hm.entrySet());

        while (k-- > 0 && !pq.isEmpty()) {
            nums.add(pq.poll().getKey());
        }

        return nums;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
            FrequencyWords obj = new FrequencyWords();
            int n = sc.nextInt();
            int k = sc.nextInt();
            String[] words = new String[n];
            for(int i=0;i<n;i++)
            {
                words[i] = sc.next();
            }
            List<String> res = obj.topKFrequent(words, k);
            System.out.println(res);
            sc.close(); // Close the scanner to prevent resource leaks
        }
    }

    

