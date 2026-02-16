import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String N = sc.next();
        

        int decimal = Integer.parseInt(N, A);

        int cnt = 0;

        int[] digits = new int[1000];

        while(true) {
            if(decimal < B) {
                digits[cnt++] = decimal;
                break;
            }

            digits[cnt++] = decimal % B;
            decimal /= B;
        }

        for(int i = cnt - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }
    }
}