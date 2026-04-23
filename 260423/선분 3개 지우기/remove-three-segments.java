import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arrStart = new int[n];
        int[] arrEnd = new int[n];

        for(int i = 0; i < n; i++) {
            arrStart[i] = sc.nextInt();
            arrEnd[i] = sc.nextInt();
        }

        int count = 0;

        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                for(int k = j + 1; k < n; k++) {
                    if (isPossible(i, j, k, n, arrStart, arrEnd)) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

    public static boolean isPossible(int x, int y, int z, int n, int[] start, int[] end) {
        for(int i = 0; i < n; i++) {
            if( i == x || i == y || i == z) {
                continue;
            }
            for(int j = i+1; j < n; j++) {
                if( j == x || j == y || j == z) {
                continue;
                }

                if (!(end[i] < start[j] || end[j] < start[i])) {
                    return false; 
                }
            }
        }
        return true;
    }
}