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

        int minMaxPoints = n;

        for (int i = 0; i <= 100; i += 2) {
            for (int j = 0; j <= 100; j += 2) {
                int q1 = 0, q2 = 0, q3 = 0, q4 = 0;

                for (int k = 0; k < n; k++) {
                    if (x[k] > i && y[k] > j) q1++;
                    else if (x[k] < i && y[k] > j) q2++;
                    else if (x[k] < i && y[k] < j) q3++;
                    else if (x[k] > i && y[k] < j) q4++;
                }

                int currentMax = Math.max(Math.max(q1, q2), Math.max(q3, q4));
                if (currentMax < minMaxPoints) {
                    minMaxPoints = currentMax;
                }
            }
        }

        System.out.println(minMaxPoints);
    }
}