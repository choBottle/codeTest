import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); 
        int P = sc.nextInt(); 
        int K = sc.nextInt(); 
        int T = sc.nextInt(); 

        int[][] shakes = new int[T][3];
        for (int i = 0; i < T; i++) {
            shakes[i][0] = sc.nextInt(); 
            shakes[i][1] = sc.nextInt(); 
            shakes[i][2] = sc.nextInt(); 
        }

        Arrays.sort(shakes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        boolean[] isInfected = new boolean[N + 1];
        int[] spreadCount = new int[N + 1];

        isInfected[P] = true; 

        for (int i = 0; i < T; i++) {
            int p1 = shakes[i][1];
            int p2 = shakes[i][2];

            boolean p1WasInfected = isInfected[p1];
            boolean p2WasInfected = isInfected[p2];

            if (p1WasInfected && spreadCount[p1] < K) {
                isInfected[p2] = true;
                spreadCount[p1]++;
            }
            if (p2WasInfected && spreadCount[p2] < K) {
                isInfected[p1] = true;
                spreadCount[p2]++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append(isInfected[i] ? "1" : "0");
        }
        System.out.println(sb.toString());
        
        sc.close();
    }
}