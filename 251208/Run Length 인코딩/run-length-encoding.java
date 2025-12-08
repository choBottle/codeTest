import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().trim();
        StringBuilder result = new StringBuilder();

        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                result.append(s.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        result.append(s.charAt(s.length() - 1)).append(count);

        String encoded = result.toString();
        System.out.println(encoded.length());
        System.out.println(encoded);

        
    }
}