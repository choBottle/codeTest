import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] posA = new int[1000001];
        int[] posB = new int[1000001];

        int currentTime = 1;
        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            for (int j = 0; j < t; j++) {
                posA[currentTime] = posA[currentTime - 1] + v;
                currentTime++;
            }
        }
        int totalTime = currentTime - 1;

        currentTime = 1;
        for (int i = 0; i < m; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            for (int j = 0; j < t; j++) {
                posB[currentTime] = posB[currentTime - 1] + v;
                currentTime++;
            }
        }

        int leader = 0;
        int changes = 0;

        for (int i = 1; i <= totalTime; i++) {
            if (posA[i] > posB[i]) {
                if (leader == 2) {
                    changes++;
                }
                leader = 1;
            } else if (posB[i] > posA[i]) {
                if (leader == 1) {
                    changes++;
                }
                leader = 2;
            }
        }

        System.out.println(changes);
    }
}