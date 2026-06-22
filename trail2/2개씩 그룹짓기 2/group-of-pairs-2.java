import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[2 * n];
        
        for (int i = 0; i < 2 * n; i++) {
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        
        int maxOfMin = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int diff = arr[i + n] - arr[i];
            if (diff < maxOfMin) {
                maxOfMin = diff;
            }
        }
        
        System.out.println(maxOfMin);
        
        sc.close();
    }
}