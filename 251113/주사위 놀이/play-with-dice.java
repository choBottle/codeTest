import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {0,0,0,0,0,0};

        for(int i = 0; i < 10; i++) {
            int a = sc.nextInt();

            arr[a-1]++;
        }

        for(int i = 0 ; i <= 5 ;i++) {
            System.out.print((i+1) + " - " + arr[i]);
            System.out.println();
        }
    }
}