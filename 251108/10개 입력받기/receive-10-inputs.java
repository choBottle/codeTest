import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        for(int i = 0; i < 10; i++) {
            int n = sc.nextInt();

            if(n == 0) {
                break;
            }

            sum += n;
            count++;
        }

        System.out.print(sum + " ");
        System.out.print(String.format("%.1f", (double)sum/count));
    }
}