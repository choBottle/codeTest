import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        printFlower(n);
        sc.close();
    }

    public static void printFlower(int n) {
        if (n == 0) {
            return;
        }

        System.out.print(n + " ");

        printFlower(n - 1);

        System.out.print(n + " ");
    }
}