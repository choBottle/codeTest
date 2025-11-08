import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int even = 0;
        int evenSum = 0;

        for(int i = 0; i < 10; i++) {
            int n = sc.nextInt();

            if(n == 0) {
                break;
            }
            if(n % 2 == 0) {
                even++;
                evenSum+= n;
            }
        }

        System.out.print(even + " " + evenSum);
    }
}