import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] hill = new int[N];

        for (int i = 0; i < N; i++) {
            hill[i] = sc.nextInt();
        }

        int answer = Integer.MAX_VALUE;

        // 최종 언덕 높이 범위를 [start, start + 17]로 만든다고 가정
        for (int start = 0; start <= 100; start++) {
            int end = start + 17;
            int cost = 0;

            for (int i = 0; i < N; i++) {
                if (hill[i] < start) {
                    int diff = start - hill[i];
                    cost += diff * diff;
                } else if (hill[i] > end) {
                    int diff = hill[i] - end;
                    cost += diff * diff;
                }
            }

            answer = Math.min(answer, cost);
        }

        System.out.println(answer);

        sc.close();
    }
}