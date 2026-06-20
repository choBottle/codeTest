import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int scoreA = 0;
        int scoreB = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            char student = sc.next().charAt(0);
            int score = sc.nextInt();

            boolean beforeA = scoreA >= scoreB;
            boolean beforeB = scoreB >= scoreA;

            if (student == 'A') {
                scoreA += score;
            } else {
                scoreB += score;
            }

            boolean afterA = scoreA >= scoreB;
            boolean afterB = scoreB >= scoreA;

            if (beforeA != afterA || beforeB != afterB) {
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}