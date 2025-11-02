import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 1;

        for(int i = 0; i < n; i++) {
            if(i % 2 == 0) {
                for(int j = 1; j <= n; j++) {
                    System.out.print(count + " ");
                    if(j == n) {
                        count += 2;
                    }else {
                        count++;
                    }
                }
            }else {
                for(int j = 1; j <= n; j++) {
                    System.out.print(count + " ");
                    if(j == n) {
                        count++;
                    }else {
                        count+=2;
                    }
                }
            }
            
            System.out.println();
        }
    }
}