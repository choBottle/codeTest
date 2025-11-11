import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int count = 0;
       int[] arr = new int[10];

       for(int i = 0; i< 10; i++) {
        int n = sc.nextInt();
        arr[i] = n;

        if(arr[i]%3 == 0) {
            System.out.print(arr[i-1]);
            break;
        }
       }
    }
}