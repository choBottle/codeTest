import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt(); 

        int[][] map = new int[N + 1][N + 1]; 

        for (int i = 1; i <= M; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            map[x][y] = i; 
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                System.out.print(map[i][j]);
                if (j < N) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
