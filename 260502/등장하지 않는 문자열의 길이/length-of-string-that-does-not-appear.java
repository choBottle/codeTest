import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        for (int len = 1; len <= n; len++) {
            boolean allUnique = true;
            HashSet<String> seen = new HashSet<>();

            for (int i = 0; i <= n - len; i++) {
                String sub = s.substring(i, i + len);
                if (seen.contains(sub)) {
                    allUnique = false;
                    break;
                }
                seen.add(sub);
            }

            if (allUnique) {
                System.out.println(len);
                break;
            }
        }
        sc.close();
    }
}