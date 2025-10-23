import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean sat = false;

        for(int i = a; i <= b; i++) {
            if(sat) {
                break;
            }
            if(i % c == 0) {
                sat = true;
            }
        }

        if(sat) {
            System.out.print("YES");
        }else {
            System.out.print("NO");
        }
    }
}