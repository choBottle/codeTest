import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int scoreA = 0;
        int scoreB = 0;
        int scoreC = 0;

        int currentHallOfFame = 7; 
        int changeCount = 0;

        for (int i = 0; i < n; i++) {
            char student = sc.next().charAt(0);
            int scoreChange = sc.nextInt();

            if (student == 'A') {
                scoreA += scoreChange;
            } else if (student == 'B') {
                scoreB += scoreChange;
            } else if (student == 'C') {
                scoreC += scoreChange;
            }

            int maxScore = Math.max(scoreA, Math.max(scoreB, scoreC));
            int nextHallOfFame = 0;

            if (scoreA == maxScore) nextHallOfFame |= 4;
            if (scoreB == maxScore) nextHallOfFame |= 2;
            if (scoreC == maxScore) nextHallOfFame |= 1;

            if (currentHallOfFame != nextHallOfFame) {
                changeCount++;
                currentHallOfFame = nextHallOfFame;
            }
        }

        System.out.println(changeCount);
        sc.close();
    }
}