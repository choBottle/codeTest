import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = (int)sc.next().charAt(0);
        int m = (int)sc.next().charAt(0);

        if(m > n) {
            System.out.println((n+m) + " " + (m-n));
        }else {
            System.out.println((n+m) + " " + (m-n));
        }

        
    }
}