import java.util.Scanner;

public class RecExampleThree {
    public static int massInput(int x, int i, int arr[]) {
        Scanner sc = new Scanner(System.in);
        if (i < x) {
            arr[i] = sc.nextInt();
            return massInput(x, i += 1, arr);
        }
        else
            return 0;
    }

    public static int massOutput(int x, int i, int arr[]) {
        if (i < x) {
            System.out.print(arr[i] + " ");
            return massOutput(x, i += 1, arr);
        }
        else
            return 0;
    }

    public static void main(String[] args) {
        System.out.println("Введите длину массива");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите элементы массива");
        int x = sc.nextInt();
        int arr[] = new int[x];
        massInput(x, 0, arr);
        massOutput(x, 0, arr);
    }
}
