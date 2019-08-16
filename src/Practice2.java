
public class Practice2 {
    private static int intc(){
        System.out.println(1);
        return 0;
    }

    static int a = inta();

    static {
        System.out.println(2);
    }

    static  int c = intc();

    private static int inta(){
        System.out.println(3);
        return 0;
    }

    public static void main(String[] args) {

    }
}
