public class RecExampleOneTwo {
    public static void m2(int x) {
        if((2*x+1)<20) {
            m2(2*x+1);
        }
        System.out.println("x="+x);
    }
    public static void main(String[] args) {
        m2(1);
    }
}
