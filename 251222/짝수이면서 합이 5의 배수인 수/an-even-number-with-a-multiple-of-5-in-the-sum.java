import java.util.Scanner;
public class Main {
    public static boolean isMagicNumber(int n) {
        int s = (n/10) + (n%10);
        if(s % 5 == 0) {
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 2 == 0 && isMagicNumber(n)) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}