/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode curr=slow;
        
        ListNode prev=null;
        ListNode next=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;

            prev=curr;
            curr=next;
        }
        ListNode lhead=prev;
        temp=head;
        ListNode temp1=lhead;
        slow.next=null;
        while(temp!=null && temp1!=null)
        {
            if(temp.val!=temp1.val)
            {
                return false;
            }
            
            temp=temp.next;
            temp1=temp1.next;
        }
        if(temp==slow && temp1==null) return true;  //for odd no of Listnodes 
                                                    //it is not neccessary because the
                                                    // middle value whatevernuber is there
        
        return true; //for even no of ListNodes
    }
}
