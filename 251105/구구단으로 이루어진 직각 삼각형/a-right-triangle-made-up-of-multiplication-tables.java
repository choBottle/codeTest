import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            int count = i + 1;
            for(int j = 1; j <= n-i; j++) {
                System.out.print(count + " * " + j + " = " + (count * j));
                if(j == n-i) {
                    System.out.println();
                }else {
                    System.out.print(" / ");
                }
            }
        }
    }
}