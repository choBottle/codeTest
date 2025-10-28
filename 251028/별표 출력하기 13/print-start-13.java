import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count1 = 0;
        int count2 = 1;

        for(int i = 1; i <= n; i++) {
            if(i%2 == 1) {
                for(int j = 0; j < n - count1; j++) {
                    System.out.print("* ");
                }
                System.out.println();
                count1++;
            }else {
                for(int j = 0; j <count2; j++) {
                    System.out.print("* ");
                }
                System.out.println();
                count2++;
            } 
        }
        for (int i = n; i <= 2*n; i++) {
        if (i % 2 == 1) {
            for (int j = 0; j < count2; j++) {
                System.out.print("* ");
            }
            System.out.println();
            count2++;
        }else {
            for (int j = 0; j < n - count1; j++) {
                System.out.print("* ");
            }
            System.out.println();
            count1++;
        }
        }
    }
}