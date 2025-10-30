import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int count;

        for(int i = 1; i <= a; i++) {
            count = i;
            for(int j = 0; j < b; j++) {
                System.out.print(count + " ");
                count += i;
            }
            System.out.println();
        }
    }
}