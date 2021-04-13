import java.util.Scanner;

public class RecExampleFourTwo {
    static double eps = 0.00000001;

    public static double f(double x) {
        return (Math.pow(x, 3) - 4 * Math.pow(x, 2) + x + 6);
    }

    public static void divideTwoRec(double a, double b) {
        System.out.println((a + b) / 2);
        if (Math.abs(b - a) > eps) {
            double x = (a + b) / 2;
            if (f(a) * f(x) > 0) {
                a = x;
            }
            else {
                b = x;
            }
            divideTwoRec(a, b);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a");
        double a = sc.nextDouble();
        System.out.println("b");
        double b = sc.nextDouble();

        divideTwoRec(a, b);
    }
}
