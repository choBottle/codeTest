import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxNum = -1;

        for(int i = 0; i < n-3; i++) {
            for(int j = i+1; j < i+4; j++) {
                if(arr[i] == arr[j] && maxNum < arr[i]) {
                    maxNum = arr[i];
                }
            }
        }

        System.out.println(maxNum);
    }
}