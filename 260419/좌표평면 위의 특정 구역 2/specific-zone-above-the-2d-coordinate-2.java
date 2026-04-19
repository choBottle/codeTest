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

        long minArea = Long.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int minX = 40001, maxX = 0;
            int minY = 40001, maxY = 0;

            for (int j = 0; j < n; j++) {
                if (i == j) continue;

                if (x[j] < minX) minX = x[j];
                if (x[j] > maxX) maxX = x[j];
                if (y[j] < minY) minY = y[j];
                if (y[j] > maxY) maxY = y[j];
            }

            long currentArea = (long)(maxX - minX) * (maxY - minY);
            
            if (currentArea < minArea) {
                minArea = currentArea;
            }
        }

        System.out.println(minArea);
    }
}