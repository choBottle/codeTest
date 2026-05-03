import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] sums = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            sums[i] = sc.nextInt();
        }

        for (int first = 1; first <= n; first++) {
            int[] arr = new int[n];
            boolean[] used = new boolean[n + 1];
            
            arr[0] = first;
            used[first] = true;
            boolean possible = true;

            for (int i = 0; i < n - 1; i++) {
                int nextVal = sums[i] - arr[i];
                if (nextVal < 1 || nextVal > n || used[nextVal]) {
                    possible = false;
                    break;
                }
                arr[i + 1] = nextVal;
                used[nextVal] = true;
            }

            if (possible) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < n; i++) {
                    sb.append(arr[i]).append(i == n - 1 ? "" : " ");
                }
                System.out.println(sb.toString());
                break;
            }
        }
        sc.close();
    }
}