import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] bomb = new int[N];

        for (int i = 0; i < N; i++) {
            bomb[i] = sc.nextInt();
        }

        boolean[] exploded = new boolean[N];

        // 같은 번호의 폭탄끼리 거리가 K 이내이면 폭발
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (j - i > K) {
                    break;
                }

                if (bomb[i] == bomb[j]) {
                    exploded[i] = true;
                    exploded[j] = true;
                }
            }
        }

        Map<Integer, Integer> countMap = new HashMap<>();

        for (int i = 0; i < N; i++) {
            if (exploded[i]) {
                countMap.put(bomb[i], countMap.getOrDefault(bomb[i], 0) + 1);
            }
        }

        int answer = 0;
        int maxCount = 0;

        for (int number : countMap.keySet()) {
            int count = countMap.get(number);

            if (count > maxCount) {
                maxCount = count;
                answer = number;
            } else if (count == maxCount) {
                answer = Math.max(answer, number);
            }
        }

        System.out.println(answer);

        sc.close();
    }
}