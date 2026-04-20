import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        int time = 0;

        for(int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
            arr2[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++) {
            int[] timeline = new int[1001];
            for(int j = 0; j < n; j++) {
                if(i == j) {
                    continue;
                }
                for(int k = arr1[j]; k < arr2[j]; k++) {
                    timeline[k] = 1;
                }
            }
            int currentSum = 0;
            for(int k = 1; k <= 1000; k++) {
                if(timeline[k] == 1) {
                    currentSum++;
                }
            }

            if(currentSum > time) {
                time = currentSum;
            }
        }

        System.out.println(time);
    }
}