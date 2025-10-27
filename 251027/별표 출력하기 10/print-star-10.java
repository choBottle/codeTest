import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count1 = 0;
        int count2 = 0;

        for(int i = 1; i <=n; i++) {
            if(i % 2 == 1) {
                for(int j = 0; j < i-count1; j++) {
                    System.out.print("* ");
                }
                count1++;
                System.out.println();
            }else {
               for(int j = 0; j < n-count2; j++) {
                    System.out.print("* ");
                }
                System.out.println();
                count2++;
            }
        }
        count1--;
        count2--;
        for(int i = n; i >= 1; i--) {
            if(i % 2 == 1) {
                for(int j = 0; j < i - count1; j++) {
                    System.out.print("* ");
                }
                count1--;
                System.out.println();
            } else {
                for(int j = 0; j < n - count2; j++) {
                    System.out.print("* ");
                }
                System.out.println();
                count2--;
            }
        }
        
    }
}