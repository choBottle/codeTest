import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][3];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int count = 0;

        for(int i = 0; i <= 2; i++) {
            int[] arr1 = new int[3];
            arr1[i] = 1;
            int max = 0;
            for(int j = 0; j < n; j++) {
                int temp = 0;

                temp = arr1[arr[j][0]-1];
                arr1[arr[j][0]-1] = arr1[arr[j][1]-1];
                arr1[arr[j][1]-1] = temp;

                if(arr1[arr[j][2]-1] == 1) {
                    max++;
                }
            }

            if(max > count) {
                count = max;
            }
        }

        System.out.println(count);
    }
}