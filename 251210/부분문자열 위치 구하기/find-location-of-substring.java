import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        String s2 = sc.next();

        for(int i = 0; i <= s.length()-s2.length(); i++) {
            if(s.substring(i,i+s2.length()).equals(s2)) {
                System.out.print(i);
                break;
            }
            if(i == s.length()- s2.length()) {
                System.out.print(-1);
            }
        }
    }
}