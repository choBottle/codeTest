import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1; i <=n; i++ ) {
            if(i == 1) {
                for(int j = 1; j <= n; j++) {
                    System.out.print("* ");
                }
                System.out.println();
                continue;
            }
            for(int j = 1; j<=n; j++) {
                if(j==n) {
                    System.out.print("* ");
                }else if(j < i) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}