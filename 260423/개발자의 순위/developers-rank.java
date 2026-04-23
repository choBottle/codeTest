import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int n = sc.nextInt();

        int[][] arr = new int[k][n];

        for(int i = 0; i < k; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();

            }
        }

        int answer = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) continue;

                int count = 0;
                
                for (int m = 0; m < k; m++) {
                    int pi = 0, pj = 0; 
                    for (int s = 0; s < n; s++) {
                        if (arr[m][s] == i) pi = s; 
                        if (arr[m][s] == j) pj = s; 
                    }
                    if (pi < pj) count++;
                
                }
                if (count == k) answer++;
            }
        }
        System.out.println(answer);
    }
}