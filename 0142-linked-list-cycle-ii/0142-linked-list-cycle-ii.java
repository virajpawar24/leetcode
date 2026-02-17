/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
     //   if(head.next == null) return null;
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null){
            if(slow.next == null) return null;
            slow = slow.next;
            if(fast.next == null) return null;
            fast = fast.next.next;
            if(slow == fast ){
                //cycle detected
                ListNode entry = head;
                while(entry != slow){
                    entry = entry.next;
                    slow = slow.next;
                }
                return entry;

            }

        }
        return null;
      
    }
}