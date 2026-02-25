import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int maxCount = 0;
        int currentCount = 0;

        for (int i = 0; i < n; i++) {
            if (i == 0 || (arr[i] < 0 && arr[i - 1] < 0) || (arr[i] >= 0 && arr[i - 1] >= 0)) {
                currentCount++;
            } else {
                currentCount = 1;
            }

            if (currentCount > maxCount) {
                maxCount = currentCount;
            }
        }

        System.out.println(maxCount);
    }
}