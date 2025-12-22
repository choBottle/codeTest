import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(countReal(A, B));
    }

    public static int countReal(int current, int end) {
        if (current > end) return 0;
        
        int check = isTarget(current) ? 1 : 0;
        return check + countReal(current + 1, end);
    }

    public static boolean isTarget(int n) {
        if (n % 3 == 0) return true;

        return contains369(n);
    }

    public static boolean contains369(int n) {
        if (n == 0) return false;
        int digit = n % 10;
        if (digit == 3 || digit == 6 || digit == 9) return true;
        return contains369(n / 10);
    }
}