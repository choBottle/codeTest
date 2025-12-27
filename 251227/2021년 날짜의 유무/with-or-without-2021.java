import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        if(m == 2) {
            if(d > 28) {
                System.out.println("No");
            }else {
                System.out.println("Yes");
            }
        }else if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            if(d > 31) {
                System.out.println("No");
            }else {
                System.out.println("Yes");
            }
        }else if(m == 2 || m == 4 || m == 6 || m == 9 || m == 11) {
            if(d > 31) {
                System.out.println("No");
            }else {
                System.out.println("Yes");
            }
        }
    }
}