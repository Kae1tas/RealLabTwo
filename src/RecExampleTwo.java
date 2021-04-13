import java.util.Scanner;

public class RecExampleTwo {
    public static void decToBin(int n) {
        if (n/2 != 0) {
            decToBin((int) n/2);
        }
        System.out.print(n%2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input number");
        int n = sc.nextInt();
        decToBin(n);
    }
}
