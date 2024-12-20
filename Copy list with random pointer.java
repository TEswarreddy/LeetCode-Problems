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
        Node current = head;
        while(current!=null)
        {
            Node newnode= new Node(current.val);
            newnode.next=current.next;
            current.next=newnode;
            current=newnode.next;
        }
        current=head;
        while(current!=null)
        {
            if(current.random !=null)
            {
                current.next.random=current.random.next;
            }
            current=current.next.next;
        }
        current=head;
        Node newHead=head.next;
        Node newcurrent=newHead;
        while(current!=null)
        {
            current.next=newcurrent.next;
            current=current.next;
            if(current!=null)
                newcurrent.next=current.next;
                newcurrent=newcurrent.next;
        }
        return newHead;
    }
}
