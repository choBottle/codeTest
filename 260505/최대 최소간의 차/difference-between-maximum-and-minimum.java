import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];

        int minVal = 10000;
        int maxVal = 1;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < minVal) minVal = arr[i];
            if (arr[i] > maxVal) maxVal = arr[i];
        }

        long minTotalCost = Long.MAX_VALUE;

        for (int start = minVal; start <= maxVal; start++) {
            int end = start + K;
            long currentCost = 0;

            for (int i = 0; i < N; i++) {
                if (arr[i] < start) {
                    currentCost += (start - arr[i]);
                } else if (arr[i] > end) {
                    currentCost += (arr[i] - end);
                }
            }

            if (currentCost < minTotalCost) {
                minTotalCost = currentCost;
            }
        }

        if (maxVal - minVal <= K) {
            System.out.println(0);
        } else {
            System.out.println(minTotalCost);
        }
    }
}