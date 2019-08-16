class Node7{
    int val;
    Node7 next = null;

    Node7(int val){
        this.val = val;
    }

    @Override
    public String toString() {
        return String.format("Node(%d)",val);
    }
}
public class Practice7 {
    private static Node7 partition(Node7 head,int x){
        Node7 small = null;
        Node7 smallLast = null;
        Node7 big = null;
        Node7 biglLast = null;

        for(Node7 cur = head;cur != null;cur = cur.next){
            if(cur.val < x){
                if(small == null){
                    small = cur;
                }else{
                    smallLast.next = cur;
                }
                smallLast = cur;
            }else{
                if(big == null){
                    big = cur;
                }else{
                    biglLast.next = cur;
                }
                biglLast = cur;
            }
        }
        if(small == null){
            return big;
        }else{
            smallLast.next = big;
            if(biglLast != null){
                biglLast.next = null;
            }
        }
        return small;
    }

    public static Node7 t1(){
        Node7 n1 = new Node7(6);
        Node7 n2 = new Node7(5);
        Node7 n3 = new Node7(1);
        n1.next = n2;
        n2.next = n3;
        return n1;
    }

    public static void main(String[] args) {
        Node7 head = t1();
        for(Node7 cur = partition(head,3);cur != null;cur = cur.next)
        {
            System.out.println(cur);
        }
    }
}
