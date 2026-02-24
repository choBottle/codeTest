import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[][] grid = new int[201][201];
        
        for (int i = 1; i <= n; i++) {
            int x1 = sc.nextInt() + 100;
            int y1 = sc.nextInt() + 100;
            int x2 = sc.nextInt() + 100;
            int y2 = sc.nextInt() + 100;
            
            int color = (i % 2 != 0) ? 1 : 2;
            
            for (int x = x1; x < x2; x++) {
                for (int y = y1; y < y2; y++) {
                    grid[x][y] = color;
                }
            }
        }
        
        int blueArea = 0;
        for (int i = 0; i < 201; i++) {
            for (int j = 0; j < 201; j++) {
                if (grid[i][j] == 2) {
                    blueArea++;
                }
            }
        }
        
        System.out.println(blueArea);
    }
}