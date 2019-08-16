import java.util.List;

class ListNode{
    int val;
    ListNode next = null;

    ListNode(int val){
        this.val = val;
    }

    public String toString(){
        return String.format("ListNode(%d)",val);
    }
}

public class Practice3 {
    private static ListNode merge(ListNode head1,ListNode head2){
        ListNode n1 = head1;
        ListNode n2 = head2;
        ListNode last = null;
        ListNode result = null;

        while(n1 != null && n2 != null){
            if(n1.val < n2.val){
                if(result == null){
                    result = n1;
                }else{
                    last.next = n1;
                }
                last = n1;
                n1 = n1.next;
            }else{
                if(result == null){
                    result = n2;
                }else{
                    last.next = n2;
                }
                last = n2;
                n2 = n2.next;
            }
        }
        if(n1 != null){
            last.next = n1;
        }else{
            last.next = n2;
        }
        return result;
    }

    public static ListNode t1(){
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        return n1;
    }
    public static ListNode t2(){
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(4);
        ListNode n3 = new ListNode(6);
        n1.next = n2;
        n2.next = n3;
        return n1;
    }
    public static void main(String[] args) {
        ListNode head1 = t1();
        ListNode head2 = t2();
        for(ListNode cur = merge(head1,head2);cur != null;cur = cur.next){
            System.out.println(cur);
        }
    }
}
