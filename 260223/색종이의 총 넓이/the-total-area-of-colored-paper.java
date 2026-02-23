import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[201][201];
        int offset = 100;
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt() + offset;
            y[i] = sc.nextInt() + offset;

            for(int j = x[i]; j < x[i]+8; j++) {
                for(int k = y[i]; k < y[i]+8; k++) {
                    if(arr[j][k] == 1) {
                        continue;
                    }else {
                        arr[j][k]++;
                    }
                }
            }
        }

        int count = 0;

        for(int i = 0; i <= 200; i++) {
            for(int j = 0; j <= 200; j++) {
                if(arr[i][j] == 1) {
                    count++;
                }
            }
        }

        System.out.println(count);
        
    }
}