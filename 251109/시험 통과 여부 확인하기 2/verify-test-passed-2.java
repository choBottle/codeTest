import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            if((a+b+c+d)/4 >= 60) {
                System.out.println("pass");
                count++;
            }else {
                System.out.println("fail");
            }
        }
        System.out.println(count);
    }
}