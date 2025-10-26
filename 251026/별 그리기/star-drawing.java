import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int s = 1;
        for(int i = 0; i < n; i++) {
            for(int j = 1; j < n-i; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < s; j++ ) {
                System.out.print("*");
            }
            s += 2;
            System.out.println();
        }
 
        s -=2;
        for(int i = 1; i < n; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < s; j++) {
                System.out.print("*");
            }
            s -= 2;
            System.out.println();
        }
    }
}