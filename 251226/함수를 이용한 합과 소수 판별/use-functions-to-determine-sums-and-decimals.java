import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;

        for(int i = a; i <= b; i++) {
            if(((i / 10) + (i%10)) % 2 == 0) {
                int num = 0;
                for(int j = 1; j <= i; j++) {
                    if(i%j == 0) {
                        num++;
                    }
                }
                if(num == 2) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}