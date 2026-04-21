import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        int b = sc.nextInt(); 

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int maxCount = 0;

        for (int i = 0; i < n; i++) {
            int currentBudget = b;
            int count = 0;

            int discountedPrice = arr[i] / 2;
            if (discountedPrice <= currentBudget) {
                currentBudget -= discountedPrice;
                count++;
            } else {
                continue;
            }

            for (int j = 0; j < n; j++) {
                if (i == j) continue;

                if (arr[j] <= currentBudget) {
                    currentBudget -= arr[j];
                    count++;
                } else {
                    break;
                }
            }

            maxCount = Math.max(maxCount, count);
        }

        System.out.println(maxCount);
    }
}