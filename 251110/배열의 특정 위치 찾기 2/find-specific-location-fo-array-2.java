import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int odd = 0;
        int even = 0;

        for(int i = 0; i < 10; i++) {
            int n = sc.nextInt();

            if(i % 2 == 0) {
                even += n;
            }else {
                odd += n;
            }
        }

        if(odd > even) {
            System.out.print(odd - even);
        }else {
            System.out.print(even - odd);
        }
        
    }
}