import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        
        int decimal = Integer.parseInt(binary, 2);
        
        decimal *= 17;

        int cnt = 0;

        int[] digits = new int[1000];

        while(true) {
            if(decimal < 2) {
                digits[cnt++] = decimal;
                break;
            }

            digits[cnt++] = decimal % 2;
            decimal /= 2;
        }

        for(int i = cnt - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }
    }
}