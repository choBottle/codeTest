import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int evenSum = 0;
        int threeSum = 0;
        int threeCount = 0;

        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            if (n % 2 == 0) {
                evenSum += n;
            }
            if (n % 3 == 0) {
                threeSum += n;
                threeCount++;
            }
        }

        double threeAvg = (threeCount == 0) ? 0.0 : (double) threeSum / threeCount;

        System.out.printf("%d %.1f", evenSum, threeAvg);
        sc.close();
    }
}
