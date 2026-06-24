import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] people = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            people[i] = scanner.nextInt();
        }

        int count = 0;
        int position = 1;

        while (position <= n) {
            if (people[position] == 0) {
                position++;
                continue;
            }

            int wifiPosition = Math.min(n, position + m);
            int coverageEnd = Math.min(n, wifiPosition + m);

            count++;
            position = coverageEnd + 1;
        }

        System.out.println(count);

        scanner.close();
    }
}