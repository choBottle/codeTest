import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        System.out.println(getSequenceValue(n));
        
        sc.close();
    }

    public static int getSequenceValue(int n) {
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 4;
        }
        
        return (getSequenceValue(n - 2) * getSequenceValue(n - 1)) % 100;
    }
}