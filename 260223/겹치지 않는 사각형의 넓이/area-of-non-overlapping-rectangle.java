import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int OFFSET = 1000;
        int[][] grid = new int[2001][2001];

        int ax1 = sc.nextInt() + OFFSET;
        int ay1 = sc.nextInt() + OFFSET;
        int ax2 = sc.nextInt() + OFFSET;
        int ay2 = sc.nextInt() + OFFSET;
        for (int i = ax1; i < ax2; i++) {
            for (int j = ay1; j < ay2; j++) {
                grid[i][j] = 1;
            }
        }

        int bx1 = sc.nextInt() + OFFSET;
        int by1 = sc.nextInt() + OFFSET;
        int bx2 = sc.nextInt() + OFFSET;
        int by2 = sc.nextInt() + OFFSET;
        for (int i = bx1; i < bx2; i++) {
            for (int j = by1; j < by2; j++) {
                grid[i][j] = 1;
            }
        }

        int mx1 = sc.nextInt() + OFFSET;
        int my1 = sc.nextInt() + OFFSET;
        int mx2 = sc.nextInt() + OFFSET;
        int my2 = sc.nextInt() + OFFSET;
        for (int i = mx1; i < mx2; i++) {
            for (int j = my1; j < my2; j++) {
                grid[i][j] = 0;
            }
        }

        int area = 0;
        for (int i = 0; i <= 2000; i++) {
            for (int j = 0; j <= 2000; j++) {
                if (grid[i][j] == 1) {
                    area++;
                }
            }
        }

        System.out.println(area);
    }
}