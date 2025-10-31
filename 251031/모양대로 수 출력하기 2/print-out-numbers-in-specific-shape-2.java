import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 2;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(count + " ");
                if(count == 8) {
                    count = 2;
                }else {
                    count += 2;
                }
            }
            System.out.println();
        }
    }
}