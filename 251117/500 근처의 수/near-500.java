import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < 10; i++) {
            int a = sc.nextInt();
            if(a > 500) {
                if(min > a) {
                    min = a;
                }
            }else {
                if(max < a) {
                    max = a;
                }
            }
        }

        System.out.print(max + " " + min);
    }
}