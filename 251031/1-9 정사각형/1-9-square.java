import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 1;

        for(int i = 1; i <=n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(count);
                if(count == 9) {
                    count = 1;
                }else {
                    count++;
                } 
            }
            System.out.println();
        }
    }
}