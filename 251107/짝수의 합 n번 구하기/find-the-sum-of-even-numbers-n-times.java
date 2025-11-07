import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int count = 0;
            for(int j = a; j <=b; j++) {
               if(j%2 == 0) {
                count += j;
               } 
            }

            System.out.println(count);
        }
    }
}