import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[15];
        for (int i = 0; i < 15; i++) {
            input[i] = sc.nextInt();
        }
        Arrays.sort(input);

        int a = input[0];
        int b = input[1];
        int totalSum = input[14];

        for (int i = 2; i < 14; i++) {
            int c = input[i];
            int d = totalSum - a - b - c;

            if (c <= d) {
                if (isValid(a, b, c, d, input)) {
                    System.out.println(a + " " + b + " " + c + " " + d);
                    return;
                }
            }
        }
    }

    private static boolean isValid(int a, int b, int c, int d, int[] original) {
        int[] generated = {
            a, b, c, d,
            a + b, b + c, c + d, d + a, a + c, b + d,
            a + b + c, a + b + d, a + c + d, b + c + d,
            a + b + c + d
        };
        Arrays.sort(generated);
        return Arrays.equals(generated, original);
    }
}