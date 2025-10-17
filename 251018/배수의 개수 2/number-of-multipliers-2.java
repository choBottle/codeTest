import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int odd = 0;

        for(int i = 0; i < 10; i++) {
            int n = sc.nextInt();

            if(n % 2 == 1) {
                odd++;
            }
        }

        System.out.print(odd);
    }
}