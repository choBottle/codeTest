import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        int n = sc.nextInt();

        if(a.equals("A")) {
            for(int i = 1; i <= n; i++) {
                System.out.print(i + " ");
            }
        }else if(a.equals("D")) {
            for(int i = n; i >= 1; i--) {
                System.out.print(i + " ");
            }
        }
    }
}