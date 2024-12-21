/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
       if(head==null)
       {
          return null;
       }
       Node current=head;
       while(current!=null)
       {
        Node duplicate = new Node(current.val);
        duplicate.next=current.next;
        current.next=duplicate;
        current = current.next.next;
       }
       current=head;
       while(current!=null)
       {
        if(current.random!=null)
        {
            current.next.random=current.random.next;
        }
        current =current.next.next;
       }
       Node newhead=head.next;
       Node orig=head;
       Node copie=head.next;
       while(orig!=null)
       {
        orig.next=orig.next.next;
        if(copie.next!=null)
        {
            copie.next=copie.next.next;
        }
        copie=copie.next;
        orig=orig.next;
       }
       return newhead;
    }
}
