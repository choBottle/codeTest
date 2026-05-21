import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        int x = 1;
        while (true) {
            boolean isValid = true;
            int current = x;
            for (int i = 0; i < n; i++) {
                current *= 2;
                if (current < a[i] || current > b[i]) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                System.out.println(x);
                break;
            }
            x++;
        }
    }
}