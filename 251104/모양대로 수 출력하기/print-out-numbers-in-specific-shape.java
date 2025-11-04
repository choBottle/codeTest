import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            int count = n;
            for(int j = 1; j <= n; j++) {
                if(i >= j) {
                    System.out.print("  ");
                    count--;
                    continue;
                }else {
                    System.out.print(count + " ");
                    count--;
                }
                
            }
            System.out.println();
        }
    }
}