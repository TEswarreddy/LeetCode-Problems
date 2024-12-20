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
    public boolean hasCycle(ListNode head) {
        ListNode temp=head;
        if(temp==null || temp.next==null)
        {
            return false;
        }
        ListNode fast=head;
        ListNode slow=head;
        while(true)
        {
            if(fast.next == null ||fast.next.next == null )
            {
                break;
            }
            slow=slow.next;
            fast=fast.next.next;
            if(fast == slow)
            {
                return true;
            }
        }
        return false;
        
    }
}
