import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = 0;

        int[][] arr = new int[n][n];

        for(int i = 0; i < n; i++) {
            a = i;
            a++;
            for(int j =0; j < n; j++) {
                arr[i][j] = a;
                a += n;
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j =0; j < n; j++) {
               System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}