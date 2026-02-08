import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();

        long[] posA = new long[1000001];
        long[] posB = new long[1000001];

        int timeA = 1;
        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            for (int j = 0; j < t; j++) {
                posA[timeA] = posA[timeA - 1] + v;
                timeA++;
            }
        }

        int timeB = 1;
        for (int i = 0; i < m; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            for (int j = 0; j < t; j++) {
                posB[timeB] = posB[timeB - 1] + v;
                timeB++;
            }
        }

        int totalTime = timeA - 1;
        int leaderChanges = 0;
        int currentLeader = 0; 

        for (int i = 1; i <= totalTime; i++) {
            int nowLeader;
            if (posA[i] > posB[i]) {
                nowLeader = 1; 
            } else if (posB[i] > posA[i]) {
                nowLeader = 2; 
            } else {
                nowLeader = 3; 
            }

            if (nowLeader != currentLeader) {
                if (currentLeader != 0) {
                    leaderChanges++;
                }
                currentLeader = nowLeader;
            }
        }

        int finalAns = 0;
        int leader = 0; 
        for (int i = 1; i <= totalTime; i++) {
            int cur;
            if (posA[i] > posB[i]) cur = 1;
            else if (posB[i] > posA[i]) cur = 2;
            else cur = 3;

            if (cur != leader) {
                finalAns++; 
                leader = cur;
            }
        }
        
        System.out.println(finalAns);
    }
}