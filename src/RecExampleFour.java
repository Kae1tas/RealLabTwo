import java.util.Scanner;

public class RecExampleFour {
    static double eps = 0.00000001;

    public static double fx(double x) {
        return (Math.pow(x, 3) - 4 * Math.pow(x, 2) + x + 6);
    }
    public static double dfx(double x) {
        return (3 * x * x - 8 * x + 1);
    }

    public static void solveRec(double x0, double x1) {
        System.out.println(x1);
        x1 = x0 - fx(x0) / dfx(x0);
        if (Math.abs(x1 - x0) > eps) {
            x0 = x1;
            x1 = x0 - fx(x0) / dfx(x0);
            solveRec(x0, x1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input x0");
        double x0 = sc.nextDouble();
        System.out.println("Нахождение корня с применением рекурсивного алгоритма");
        double x1 = x0 - fx(x0) / dfx(x0);
        solveRec(x0, x1);
    }
}
