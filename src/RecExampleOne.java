import java.util.Scanner;

public class RecExampleOne {
    public static void m(int x) {
        System.out.println("x="+x);
        if((2*x+1)<20) {
            m(2*x+1);
        }
    }

    public static void m2(int x) {
        if((2*x+1)<20) {
            m2(2*x+1);
        }
        System.out.println("x="+x);
    }

    private static int step=0;
    public static void m3(int x) {
        space();
        System.out.println(""+x+"-> ");
        step++;
        if ((2*x+1) <20) {
            m3(2*x+1);
        }
        step --;
        space();
        System.out.println(""+x+ " <-");
    }
    public static void space() {
        for (int i = 0; i < step; i++) {
            System.out.print(" ");
        }
    }

    public static int fact(int n) {
        int result;
        if (n == 1)
            return 1;
        else {
            result=fact(n - 1) * n;
            return result;
        }
    }

    public static int f(int s){

        if (s == 0){
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

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер примера (1-5):");
        int w = sc.nextInt();
        switch (w) {
            case 1: {
                m(1);
                break;
            }
            case 2: {
                m2(1);
                break;
            }
            case 3: {
                m3(1);
                break;
            }
            case 4: {
                System.out.println("Введите число факториал которого хотите найти");
                System.out.println(fact(sc.nextInt()));
                break;
            }
            case 5: {
                System.out.println("Введите номер числа Фибоначчи");
                System.out.println("\nЧисло Фибоначчи:" + f(sc.nextInt()));
                break;
            }
            default: {
                System.out.println("Неверный номер");
            }
        }
    }
}
