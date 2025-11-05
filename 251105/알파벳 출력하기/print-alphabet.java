import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 65;

        for(int i = 1; i <= n; i++){
            for(int j = 0; j < i; j++) {
                System.out.print((char)count);
                if((char)count == 'Z') {
                    count = 65;
                }else {
                    count++;
                }
            }
            System.out.println();
        }
    }
}