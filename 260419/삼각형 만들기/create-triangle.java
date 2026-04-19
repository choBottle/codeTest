import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        long maxArea2 = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (i == j || j == k || k == i) continue;

                    boolean xParallel = (y[i] == y[j]);
                    boolean yParallel = (x[j] == x[k]);

                    if (xParallel && yParallel) {
                        long width = Math.abs(x[i] - x[j]);
                        long height = Math.abs(y[j] - y[k]);
                        long area2 = width * height;

                        if (area2 > maxArea2) {
                            maxArea2 = area2;
                        }
                    }
                }
            }
        }

        System.out.println(maxArea2);
        sc.close();
    }
}