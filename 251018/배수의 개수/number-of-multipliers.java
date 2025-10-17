import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int three = 0;
        int five = 0;

        for(int i = 0; i < 10; i++) {
            int n = sc.nextInt();

            if(n % 3 == 0 && n % 5 == 0) {
                three++;
                five++;
            }else if(n % 3 == 0) {
                three++;
            }else if(n % 5 == 0) {
                five++;
            }
        }

        System.out.print(three + " " + five);
    }
}