import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        long leftGap = b - a;
        long rightGap = c - b;

        long answer = Math.max(leftGap, rightGap) - 1;

        System.out.println(answer);
    }
}