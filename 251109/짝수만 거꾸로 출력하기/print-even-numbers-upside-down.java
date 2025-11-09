import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;
        int[] arr = new int[n];


        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();

            if(a % 2 == 0) {
                arr[count++] = a;
            }
        }

        for(int i = count - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}