import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < (2*n)+1; i++) {
            if(i % 2 == 0) {
                for(int j = 0; j <(2*n)+1; j++) {
                    System.out.print("* ");
                }
            }else {
                for(int j = 0; j <(2*n)+1; j++) {
                    if(j% 2 == 0) {
                        System.out.print("* ");
                    }else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}