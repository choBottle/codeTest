import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        // 소수 셋째 자리까지 반올림하여 출력
        System.out.println(String.format("%.3f", a));
        System.out.println(String.format("%.3f", b));
        System.out.println(String.format("%.3f", c));
    }
}