import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long[][] arr = new long[N][N];

        for (int i = 0; i < N; i++) {
            arr[0][i] = 1;
            arr[i][0] = 1;
        }

        for (int i = 1; i < N; i++) {
            for (int j = 1; j < N; j++) {
                arr[i][j] = arr[i-1][j] + arr[i][j-1] + arr[i-1][j-1];
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
