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
        int count=0;
        while(temp.next!=null)
        {
            count++;
            temp=temp.next;
        }
        //ListNode lhead=temp;
        ListNode curr=temp;
        temp=head;
        int c=0;
        while(temp.next!=null)
        {
            c++;
            if(c==(count/2)+1)
            {
                curr=temp;
            }
            temp=temp.next;
        }
        
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
        while(temp!=null && temp1!=null)
        {
            if(temp.val!=temp1.val)
            {
                return false;
            }
            temp=temp.next;
            temp1=temp1.next;
        }
        
        return true;
    }
}
