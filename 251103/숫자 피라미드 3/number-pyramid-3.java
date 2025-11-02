import java.util.Scanner;   

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            int count = 1;
            for(int j = 1; j <= i; j++) {
                System.out.print(i*count + " ");
                count++;
            }
            System.out.println();
        }
    }
}