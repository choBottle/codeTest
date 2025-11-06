import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            int m = sc.nextInt();

            int count = 0;

            while(true) {
                if(m == 1) {
                    break;
                }
                if(m%2 == 0) {
                    m /= 2;
                    count++;
                }else {
                    m = m * 3 + 1;
                    count++;
                }
            }
            System.out.println(count);
        }


    }
}