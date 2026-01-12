import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        long product = (long) n1 * n2 * n3;

        System.out.println(sumDigits(product));
        
        sc.close();
    }

    public static int sumDigits(long n) {
        if (n == 0) {
            return 0;
        }
        
        return (int)(n % 10) + sumDigits(n / 10);
    }
}