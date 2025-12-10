import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        char c1 = s.charAt(0);
        char c2 = s.charAt(1);

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c1) {
                System.out.print(c2);
            }else if(s.charAt(i) == c2) {
                System.out.print(c1);
            }else {
                System.out.print(s.charAt(i));
            }
        }
    }
}