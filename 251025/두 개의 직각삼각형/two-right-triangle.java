import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            int c = 0;
            for(int j = 1; j <= (2*n); j++) {
                if(j <= n-i || j > n+i) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            c++;
            System.out.println();
        }
    }
}