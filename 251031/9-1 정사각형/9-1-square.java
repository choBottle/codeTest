import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 9;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(count);
                if(count == 1) {
                    count = 9;
                }else {
                    count--;
                }
            }
            System.out.println();
        }
    }
}