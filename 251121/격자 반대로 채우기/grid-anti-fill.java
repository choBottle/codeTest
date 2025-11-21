import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][] arr = new int[N][N];
        int num = 1;

        boolean goUp = true;  

        for (int col = N - 1; col >= 0; col--) {
            if (goUp) {
                for (int row = N - 1; row >= 0; row--) {
                    arr[row][col] = num++;
                }
            } else {
                for (int row = 0; row < N; row++) {
                    arr[row][col] = num++;
                }
            }
            goUp = !goUp;   // 방향 전환
        }

        // 출력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
