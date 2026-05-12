import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int start = Math.min(a, c);
        int end = Math.max(b, d);

        int gap = 0;
        if (b < c) { 
            gap = c - b;
        } else if (d < a) { 
            gap = a - d;
        }

        System.out.println((end - start) - gap);
    }
}