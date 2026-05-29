import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] stone = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            stone[i] = sc.nextInt();
        }

        int[] dp = new int[N + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);

        dp[1] = stone[1];

        for (int i = 2; i <= N; i++) {
            for (int j = Math.max(1, i - K); j < i; j++) {
                int maxValue = Math.max(dp[j], stone[i]);
                dp[i] = Math.min(dp[i], maxValue);
            }
        }

        System.out.println(dp[N]);

        sc.close();
    }
}