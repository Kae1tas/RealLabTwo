import java.util.Scanner;

public class RecExampleOneFour {
    public static int fact(int n) {
        int result;
        if (n == 1)
            return 1;
        else {
            result=fact(n - 1) * n;
            return result;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число, факториал которого хотите найти");
        System.out.println(fact(sc.nextInt()));
    }
}
