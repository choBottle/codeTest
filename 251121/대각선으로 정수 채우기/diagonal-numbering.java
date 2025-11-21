import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[N][M];

        int num = 1;

        for (int startCol = 0; startCol < M; startCol++) {
            int x = 0, y = startCol;
            while (x < N && y >= 0) {
                arr[x][y] = num++;
                x++;
                y--;
            }
        }

        for (int startRow = 1; startRow < N; startRow++) {
            int x = startRow, y = M - 1;
            while (x < N && y >= 0) {
                arr[x][y] = num++;
                x++;
                y--;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}
