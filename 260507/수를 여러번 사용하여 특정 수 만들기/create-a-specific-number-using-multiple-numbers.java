import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int maxVal = 0;
        
        for (int i = 0; i * a <= c; i++) {
            for (int j = 0; (i * a) + (j * b) <= c; j++) {
                int currentSum = (i * a) + (j * b);
                
                if (currentSum > maxVal) {
                    maxVal = currentSum;
                }
            }
        }
        
        System.out.println(maxVal);
    }
}