import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. 입력 받기
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[][] grid = new int[N][N];
        
        for (int i = 0; i < M; i++) {
            int r = scanner.nextInt();
            int c = scanner.nextInt();
            
            if (r >= 1 && r <= N && c >= 1 && c <= N) {
                int row_idx = r - 1;
                int col_idx = c - 1;
                
                int value = r * c;
                
                grid[row_idx][col_idx] = value;
            }
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}