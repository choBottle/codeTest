import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int min = 2147483647;

        int count = 0;

        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if(min > a) {
                min = a;
                count = 1;
            }else if( min == a) {
                count++;
            }
        }

        System.out.print(min + " " + count);

    }
}