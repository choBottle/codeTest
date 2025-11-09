import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            if (n == 0) break;
            arr[count++] = n;
        }

        if (count == 0) {
            System.out.println(0);
            sc.close();
            return;
        }

        int start = Math.max(0, count - 3); 
        int sum = 0;
        for (int i = start; i < count; i++) {
            sum += arr[i];
        }

        System.out.println(sum);
        sc.close();
    }
}
