import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) return;
            int N = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            int printed = 0;

            for (int i = 0; i < N; i++) {
                if (!sc.hasNextInt()) break;
                int x = sc.nextInt();
                if (x % 2 == 0) {
                    if (printed > 0) sb.append(' ');
                    sb.append(x);
                    printed++;
                }
            }

            System.out.println(sb.toString());
        }
    }
}
