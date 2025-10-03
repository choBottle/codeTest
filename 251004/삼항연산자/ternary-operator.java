import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n==100) {
            System.out.print("pass");
        }else {
            System.out.print("failure");
        }
    }
}