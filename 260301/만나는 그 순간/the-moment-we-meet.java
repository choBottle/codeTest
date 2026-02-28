import java.util.Scanner;

public class Main {
    public static final int MAX_T = 1000000;
    public static int[] posA = new int[MAX_T + 1];
    public static int[] posB = new int[MAX_T + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int currentTimeA = 1;
        for (int i = 0; i < n; i++) {
            char d = sc.next().charAt(0);
            int t = sc.nextInt();
            
            for (int j = 0; j < t; j++) {
                posA[currentTimeA] = posA[currentTimeA - 1] + (d == 'R' ? 1 : -1);
                currentTimeA++;
            }
        }

        int currentTimeB = 1;
        for (int i = 0; i < m; i++) {
            char d = sc.next().charAt(0);
            int t = sc.nextInt();
            
            for (int j = 0; j < t; j++) {
                posB[currentTimeB] = posB[currentTimeB - 1] + (d == 'R' ? 1 : -1);
                currentTimeB++;
            }
        }

        int ans = -1;
        for (int i = 1; i < currentTimeA; i++) {
            if (posA[i] == posB[i]) {
                ans = i;
                break;
            }
        }

        System.out.println(ans);
    }
}