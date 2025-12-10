import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        char c = sc.next().charAt(0);

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c) {
                System.out.println(i);
                break;
            }
            if(i == s.length()-1) {
                System.out.println("No");
            }
        }
    }
}