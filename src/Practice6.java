class Node6{
    int val;
    Node6 next = null;

    Node6(int val){
        this.val = val;
    }

    public String toString()
    {
        return String.format("Node(%d)",val);
    }
}
public class Practice6 {
    public static Node6 reverseList(Node6 head){
        Node6 result = null;
        Node6 cur = head;
        while(cur != null){
            Node6 next = cur.next;
            cur.next = result;
            result = cur;
            cur = next;
        }
        return result;
    }

    public static Node6 t1(){
        Node6 n1 = new Node6(1);
        Node6 n2 = new Node6(3);
        Node6 n3 = new Node6(5);
        n1.next = n2;
        n2.next = n3;
        return n1;
    }

    public static void main(String[] args) {
        Node6 head = t1();
        for(Node6 cur = reverseList(head);cur != null;cur = cur.next)
        {
            System.out.println(cur);
        }
    }
}
