import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = 1;

        for(int i = 1; i <= 10; i++) {
            if(sum * i >= n) {
                System.out.print(i);
                break;
            }
            sum *= i;
        }
    }
}