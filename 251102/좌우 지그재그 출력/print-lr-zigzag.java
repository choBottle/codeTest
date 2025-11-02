import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 1;

        for(int i = 1; i <= n; i++) {
            if(i % 2 == 1 ) {
                for(int j = count; j <= (n*i); j++) {
                    System.out.print(j + " ");
                    count++;
                }
            }else {
                for(int j = (n*i); j >= count; j--) {
                    System.out.print(j + " ");
                }
                count += n;
            }
            System.out.println();
        }
    }
}