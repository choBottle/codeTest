import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int maxStart = 0;       
        int minEnd = 101;       
        
        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            
            if (x1 > maxStart) {
                maxStart = x1;
            }
            if (x2 < minEnd) {
                minEnd = x2;
            }
        }
        
        if (maxStart <= minEnd) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        sc.close();
    }
}