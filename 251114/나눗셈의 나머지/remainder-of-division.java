import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int b = sc.nextInt();

        int sum = 0;

        int[] arr = {0,0,0,0,0,0,0,0,0,0};

        while(true) {
            if(a <= 1) {
                break;
            }
            arr[(a%b)]++;
            a/=b;
        }

        for(int i = 0; i < b; i++) {
            sum += (arr[i] * arr[i]);
        }

        System.out.print(sum);
    }
}