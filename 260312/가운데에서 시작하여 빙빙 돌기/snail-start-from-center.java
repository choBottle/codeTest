import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[][] grid = new int[n][n];
        int r = n / 2;
        int c = n / 2;
        int num = 1;
        grid[r][c] = num++;
        
        int[] dr = {0, -1, 0, 1};
        int[] dc = {1, 0, -1, 0};
        int dir = 0;
        int step = 1;
        
        while (num <= n * n) {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < step; j++) {
                    if (num > n * n) break;
                    r += dr[dir];
                    c += dc[dir];
                    grid[r][c] = num++;
                }
                dir = (dir + 1) % 4;
            }
            step++;
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}