import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] cnt = new int[1001]; 

        int max = -1;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            cnt[a]++;  
        }

        for (int v = 1000; v >= 1; v--) {
            if (cnt[v] == 1 && cnt[v] > max) {
                max = v;
            }
        }

        
        System.out.println(max);
    }
}
