import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. 입력 순서: N, K, P, T (이미지 지문 기준)
        if (!sc.hasNextInt()) return;
        int N = sc.nextInt(); // 개발자 수
        int K = sc.nextInt(); // 전염 가능 횟수
        int P = sc.nextInt(); // 처음 감염자 번호
        int T = sc.nextInt(); // 악수 횟수

        int[][] shakes = new int[T][3];
        for (int i = 0; i < T; i++) {
            shakes[i][0] = sc.nextInt(); // t초
            shakes[i][1] = sc.nextInt(); // x 개발자
            shakes[i][2] = sc.nextInt(); // y 개발자
        }

        // 2. 시간(t) 기준으로 오름차순 정렬
        Arrays.sort(shakes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[0], o2[0]);
            }
        });

        // 감염 상태 및 전염 횟수 추적
        boolean[] isInfected = new boolean[N + 1];
        int[] spreadCount = new int[N + 1];

        isInfected[P] = true; // 최초 감염자

        // 3. 시뮬레이션 진행
        for (int i = 0; i < T; i++) {
            int x = shakes[i][1];
            int y = shakes[i][2];

            // 이번 악수 전의 감염 상태를 미리 저장 (동시 전염 로직을 위해)
            boolean xInfected = isInfected[x];
            boolean yInfected = isInfected[y];

            // x가 감염자이고 전염 기회가 남았을 때
            if (xInfected && spreadCount[x] < K) {
                isInfected[y] = true; // y 전염 (이미 감염됐어도 상태 유지)
                spreadCount[x]++;     // x의 전염 횟수 사용
            }

            // y가 감염자이고 전염 기회가 남았을 때
            if (yInfected && spreadCount[y] < K) {
                isInfected[x] = true; // x 전염 (이미 감염됐어도 상태 유지)
                spreadCount[y]++;     // y의 전염 횟수 사용
            }
        }

        // 4. 결과 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append(isInfected[i] ? "1" : "0");
        }
        System.out.println(sb.toString());
        
        sc.close();
    }
}