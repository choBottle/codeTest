import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean sat = false;

        for(int i = 0; i < 5; i++) {
            int n = sc.nextInt();
            if(n % 3 != 0) {
                sat = true;
            } 
        }

        if(sat) {
            System.out.print("0");
        }else {
            System.out.print("1");
        }
    }
}