import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        for(int i = 1; i <= 1000; i++) {
            int max = 0;
            boolean in = false;
            for(int j = 0; j < n; j++) {
                if(arr[j] > i && !in) {
                    max++;
                    in = true;
                }else if( arr[j] <= i) {
                    in = false;
                }
            }
            if(max > count){
                count = max;
            }
        }

        System.out.println(count);
    }
}