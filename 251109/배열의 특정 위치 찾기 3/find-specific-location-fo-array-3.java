import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        while (sc.hasNextInt()) {
            int x = sc.nextInt();
            if (x == 0) {
                System.out.println(a + b + c);
                break;
            }
            a = b;
            b = c;
            c = x;
        }
        sc.close();
    }
}
