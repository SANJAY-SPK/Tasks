/*Given the head of a sorted linked list,
 delete all duplicates such that each element appears only once.
  Return the linked list sorted as well.


Example 1:
Input: head = [1,1,2]
Output: [1,2]

Example 2:
Input: head = [1,1,2,3,3]
Output: [1,2,3] */

package programs;
import java.util.*;
public class RemobeDuplicates {
    public class ListNode 
    {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode deleteDuplicates(ListNode head) 
    {
        ListNode current = head;
        while(current != null && current.next!=null)
        {
            if(current.val == current.next.val)
            {
                current.next = current.next.next;
            }
            else
            {
                current = current.next;
            }
        }

        return head;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RemobeDuplicates rd = new RemobeDuplicates();
        ListNode head = rd.new ListNode(1);
        head.next = rd.new ListNode(1);
        head.next.next = rd.new ListNode(2);
        head.next.next.next = rd.new ListNode(3);
        head.next.next.next.next = rd.new ListNode(3);
        ListNode result = rd.deleteDuplicates(head);
        while(result!=null)
        {
            System.out.print(result.val + " ");
            result = result.next;
        }
        sc.close();
    }
       
    
}
