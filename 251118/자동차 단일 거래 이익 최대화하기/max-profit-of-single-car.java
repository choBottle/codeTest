import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 0;
        int min = Integer.MAX_VALUE;
        int max = 0;
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(min > arr[i] ) {
                min = arr[i];
                count = i;
            }
        }

        for(int i = count; i <n; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }

        if(max == 0) {
            System.out.print(max);
        }else {
            System.out.print(max - min);
        }

        
    }
}