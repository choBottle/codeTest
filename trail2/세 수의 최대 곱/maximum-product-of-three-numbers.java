import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        long option1 = (long) arr[n - 1] * arr[n - 2] * arr[n - 3];
        long option2 = (long) arr[0] * arr[1] * arr[n - 1];

        long maxProduct = Math.max(option1, option2);
        System.out.println(maxProduct);

        sc.close();
    }
}