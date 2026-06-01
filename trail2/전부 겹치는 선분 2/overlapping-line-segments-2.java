import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] left = new int[n];
        int[] right = new int[n];

        for (int i = 0; i < n; i++) {
            left[i] = sc.nextInt();
            right[i] = sc.nextInt();
        }

        boolean possible = false;

        for (int i = 0; i < n; i++) {
            int maxLeft = 1;
            int minRight = 100;

            for (int j = 0; j < n; j++) {
                if (i == j) continue;

                if (left[j] > maxLeft) {
                    maxLeft = left[j];
                }

                if (right[j] < minRight) {
                    minRight = right[j];
                }
            }

            if (maxLeft <= minRight) {
                possible = true;
                break;
            }
        }

        if (possible) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}