import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int c = sc.nextInt();
        int g = sc.nextInt();
        int h = sc.nextInt();

        int[] ta = new int[n];
        int[] tb = new int[n];

        for (int i = 0; i < n; i++) {
            ta[i] = sc.nextInt();
            tb[i] = sc.nextInt();
        }

        int maxTotalEfficiency = 0;

        for (int t = 0; t <= 1000; t++) {
            int currentTotal = 0;

            for (int i = 0; i < n; i++) {
                if (t < ta[i]) {
                    currentTotal += c;
                } else if (t <= tb[i]) {
                    currentTotal += g;
                } else {
                    currentTotal += h;
                }
            }

            if (currentTotal > maxTotalEfficiency) {
                maxTotalEfficiency = currentTotal;
            }
        }

        System.out.println(maxTotalEfficiency);
    }
}