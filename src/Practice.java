class Node{
    int val;
    Node next = null;

    Node(int val){
        this.val = val;
    }

    @Override
    public String toString() {
        return String.format("Node(%d)",val);
    }
}

public class Practice {
    public static Node heBing(Node n1,Node n2){
        Node h1 = n1;
        Node last = null;
        Node h2 = n2;
        Node result = null;
        while(h1 != null && h2 != null){
            if(h1.val < h2.val){
                if(result == null){
                    result = h1;
                }else{
                    last.next = h1;
                }
                last = h1;
                h1 = h1.next;
            }else{
                if(result == null){
                    result = h2;
                }else{
                    last.next = h2;
                }
                last = h2;
                h2 = h2.next;
            }
        }
        if(h1 != null){
            last.next = h1;
        }else{
            last.next = h2;
        }
        return result;
    }

    private static Node L1(){
        Node n1 = new Node(1);
        Node n2 = new Node(3);
        Node n3 = new Node(5);
        n1.next = n2;
        n2.next = n3;
        return n1;
    }
    private static Node L2(){
        Node n1 = new Node(2);
        Node n2 = new Node(4);
        Node n3 = new Node(6);
        n1.next = n2;
        n2.next = n3;
        return n1;
    }

    public static void main(String[] args) {
        Node head1 = L1();
        Node head2 = L2();
        Node result = heBing(head1,head2);
        for(Node cur = result;cur != null;cur = cur.next){
            System.out.println(cur);
        }
    }
}
