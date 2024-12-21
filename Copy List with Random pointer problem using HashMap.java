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
        if(head == null)
        {
            return null;
        }
       
        HashMap<Node,Node> h=new HashMap<>();
       
        Node current=head;
        while(current!=null)
        {
            Node newnode=new Node(current.val);   
            h.put(current,newnode);
            current=current.next;
        }
        
        
        current=head;
        while(current!=null)
        {
           
            Node duplicate=h.get(current);
            
            duplicate.random=h.get(current.random);
            duplicate.next=h.get(current.next);
            current=current.next;
        }
        return h.get(head);

    }
}
