import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int perfect = 0;

        for(int i = 1; i < n; i++) {
            if(n % i == 0) {
                perfect += i;
            }
        }
        if(perfect == n) {
            System.out.print("P");
        }else {
            System.out.print("N");
        }
    }
}