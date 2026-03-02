import java.util.Scanner;

public class Main {
    static int[] posA = new int[1000001];
    static int[] posB = new int[1000001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int timeA = 1;
        int currentPosA = 0;
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);
            for (int j = 0; j < t; j++) {
                if (d == 'R') currentPosA++;
                else currentPosA--;
                posA[timeA++] = currentPosA;
            }
        }

        int timeB = 1;
        int currentPosB = 0;
        for (int i = 0; i < m; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);
            for (int j = 0; j < t; j++) {
                if (d == 'R') currentPosB++;
                else currentPosB--;
                posB[timeB++] = currentPosB;
            }
        }

        int totalTime = Math.max(timeA, timeB);
        
        for (int i = timeA; i < totalTime; i++) posA[i] = posA[i - 1];
        for (int i = timeB; i < totalTime; i++) posB[i] = posB[i - 1];

        int count = 0;
        for (int i = 1; i < totalTime; i++) {
            if (posA[i-1] != posB[i-1] && posA[i] == posB[i]) {
                count++;
            }
        }

        System.out.println(count);
    }
}