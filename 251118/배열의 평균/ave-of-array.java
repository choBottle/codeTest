import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] arr = new double[2][4];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < 2; i++) {
            double sum = 0;
            for (int j = 0; j < 4; j++) sum += arr[i][j];
            System.out.printf("%.1f", sum / 4.0);
            if (i == 0) System.out.print(" ");
        }
        System.out.println();

        for (int j = 0; j < 4; j++) {
            double sum = 0;
            for (int i = 0; i < 2; i++) sum += arr[i][j];
            System.out.printf("%.1f", sum / 2.0);
            if (j < 3) System.out.print(" ");
        }
        System.out.println();

        double total = 0;
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 4; j++)
                total += arr[i][j];

        System.out.printf("%.1f", total / 8.0);
    }
}
