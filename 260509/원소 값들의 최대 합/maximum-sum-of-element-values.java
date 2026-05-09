import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        long maxSum = 0;

        for (int start = 1; start <= n; start++) {
            long currentSum = 0;
            int currentPos = start;

            for (int i = 0; i < m; i++) {
                int value = arr[currentPos];
                currentSum += value;
                currentPos = value;
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        System.out.println(maxSum);
        
        sc.close();
    }
}