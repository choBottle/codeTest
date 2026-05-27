import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] count = new int[n + 1][n + 1];
        int answer = 0;

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int x = Math.min(a, b);
            int y = Math.max(a, b);

            count[x][y]++;

            if (count[x][y] > answer) {
                answer = count[x][y];
            }
        }

        System.out.println(answer);

        sc.close();
    }
}