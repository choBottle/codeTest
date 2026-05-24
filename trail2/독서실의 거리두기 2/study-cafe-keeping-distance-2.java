import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());
        String seats = br.readLine().trim();

        int INF = 1_000_000;
        int[] left = new int[n];
        int[] right = new int[n];

        int last = -INF;
        for (int i = 0; i < n; i++) {
            if (seats.charAt(i) == '1') {
                last = i;
            }
            left[i] = i - last;
        }

        last = INF;
        for (int i = n - 1; i >= 0; i--) {
            if (seats.charAt(i) == '1') {
                last = i;
            }
            right[i] = last - i;
        }

        int existingMin = INF;
        int prev = -1;

        for (int i = 0; i < n; i++) {
            if (seats.charAt(i) == '1') {
                if (prev != -1) {
                    existingMin = Math.min(existingMin, i - prev);
                }
                prev = i;
            }
        }

        int bestNewSeat = 0;

        for (int i = 0; i < n; i++) {
            if (seats.charAt(i) == '0') {
                int nearest = Math.min(left[i], right[i]);
                bestNewSeat = Math.max(bestNewSeat, nearest);
            }
        }

        int answer = Math.min(existingMin, bestNewSeat);
        System.out.println(answer);
    }
}