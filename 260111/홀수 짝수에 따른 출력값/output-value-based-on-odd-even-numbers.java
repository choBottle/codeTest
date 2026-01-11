import java.util.Scanner;

public class Main {

    public static int sum(int n) {
        if(n == 1) {
            return 1;
        }else if(n == 2) {
            return 2;
        }

        return n + sum(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
}