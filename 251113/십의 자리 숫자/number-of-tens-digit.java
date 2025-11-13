import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {0,0,0,0,0,0,0,0,0};

        while(true) {
            int n = sc.nextInt();
            if(n == 0) {
                break;
            }
            n /= 10;
            if(n == 0) {
                continue;
            }
            arr[n-1]++;
        }

        for(int i = 0; i < 9; i++) {
            System.out.println((i+1) + " - " + arr[i]);
        }
    }
}