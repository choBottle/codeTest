import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int s = n;

        for(int i = 0; i < n; i++) {
            for(int j = s; j > 0; j--) {
                System.out.print("* ");
            }
            s--;
            System.out.println();
        }
    }
}