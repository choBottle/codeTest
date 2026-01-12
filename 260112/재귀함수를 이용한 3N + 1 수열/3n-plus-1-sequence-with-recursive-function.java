import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        System.out.println(countSteps(n));
        
        sc.close();
    }

    public static int countSteps(int n) {
        if (n == 1) {
            return 0;
        }

        if (n % 2 == 0) {
            return 1 + countSteps(n / 2);
        } else {
            return 1 + countSteps(3 * n + 1);
        }
    }
}