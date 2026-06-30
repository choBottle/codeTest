import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[7];

        for (int i = 0; i < 7; i++) {
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);

        int a = numbers[0];
        int b = numbers[1];
        int c = numbers[6] - a - b;

        System.out.println(a + " " + b + " " + c);

        sc.close();
    }
}