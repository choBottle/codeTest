import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        
        int[] x = new int[n];
        int[] y = new int[n];

        for(int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        long minDistanceSq = Long.MAX_VALUE; 

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                long dx = x[i] - x[j];
                long dy = y[i] - y[j];
                long distSq = (dx * dx) + (dy * dy);

                if (distSq < minDistanceSq) {
                    minDistanceSq = distSq;
                }
            }
        }

        System.out.println(minDistanceSq);
        sc.close();
    }
}