import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // 좌표 오프셋 (음수 좌표를 양수 인덱스로 바꾸기 위함)
        int OFFSET = 100;
        // -100 ~ 100 범위는 총 200개의 칸이 필요함
        boolean[][] visited = new boolean[201][201];

        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt() + OFFSET;
            int y1 = sc.nextInt() + OFFSET;
            int x2 = sc.nextInt() + OFFSET;
            int y2 = sc.nextInt() + OFFSET;

            for (int x = x1; x < x2; x++) {
                for (int y = y1; y < y2; y++) {
                    visited[x][y] = true;
                }
            }
        }

        // true인 칸의 개수 세기
        int totalArea = 0;
        for (int i = 0; i <= 200; i++) {
            for (int j = 0; j <= 200; j++) {
                if (visited[i][j]) {
                    totalArea++;
                }
            }
        }

        System.out.println(totalArea);
    }
}