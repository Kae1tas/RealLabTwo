import java.util.Scanner;

public class RecExampleOneFive {
    public static int f(int s) {
        if (s == 0) {
            System.out.println("fib0");
            return 0;
        }
        else if (s == 1) {
            System.out.println("fib1");
            return 1;
        }
        else {
            System.out.println("fib" + s);
            return f(s-2)+f(s-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер числа Фибоначчи");
        System.out.println("\nЧисло Фибоначчи:" + f(sc.nextInt()));
    }
}
