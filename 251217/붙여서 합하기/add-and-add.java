import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();

        String s2 = sc.next();

        String A = s1 + s2;
        String B = s2 + s1;

        int n1 = Integer.parseInt(A);
        int n2 = Integer.parseInt(B);

        System.out.print(n1+n2);
    }
}