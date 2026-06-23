import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] blocks = new int[n];
        long sum = 0;

        for (int i = 0; i < n; i++) {
            blocks[i] = scanner.nextInt();
            sum += blocks[i];
        }

        long average = sum / n;
        long answer = 0;

        for (int block : blocks) {
            if (block > average) {
                answer += block - average;
            }
        }

        System.out.println(answer);
        scanner.close();
    }
}