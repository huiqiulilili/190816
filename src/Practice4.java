class Node4{
    int val;
    Node4 next = null;

    Node4(int val){
        this.val = val;
    }

    @Override
    public String toString() {
        return String.format("Node(%d)",val);
    }
}

public class Practice4 {

    public static Node4 deleteDuplication(Node4 head){
        Node4 fake = new Node4(0);
        fake.next = head;
        Node4 prev = fake;

        Node4 p1 = head;
        Node4 p2 = head.next;

        while(p2 != null){
            if(p1.val != p2.val){
                prev = p1;
                p1 = p2;
                p2 = p2.next;
            }else{
                while(p2 != null &&  p1.val == p2.val){
                    p2 = p2.next;
                }
                prev.next = p2;
                p1 = p2;
                if(p2 != null){
                    p2 = p2.next;
                }
            }
        }
        return fake.next;
    }

    public static Node4 t1(){
        Node4 n1 = new Node4(1);
        Node4 n2 = new Node4(3);
        Node4 n3 = new Node4(3);

        Node4 n4 = new Node4(4);
        Node4 n5 = new Node4(4);
        Node4 n6 = new Node4(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        return n1;
    }

    public static void main(String[] args) {
        Node4 head = t1();
        for(Node4 cur = deleteDuplication(head);cur != null;cur = cur.next)
        {
            System.out.println(cur);
        }
    }
}
