import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int num = 1;
        for(int i = n; i <= n*m; i++) {
            if(i % n == 0 && i % m == 0) {
                num = i;
                break;
            }
        }
        System.out.println(num);
    }
}