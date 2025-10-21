import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 0;

        while(true) {
            if(n == 1) {
                System.out.print(count);
                break;
            }
            if(n%2 == 1) {
                n = n * 3 + 1;
                count++;
            }else {
                n /= 2;
                count++;
            }



        }
    }
}