import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        int count = 0;

        for(int i = 0; i < s1.length(); i++) {
            if(s1.equals(s2)) {
                System.out.println(count);
                break;
            }
            s1 = s1.substring(s1.length() -1, s1.length()) + s1.substring(0,s1.length() -1);
            count++;
            if(i == s1.length()-1) {
                System.out.println(-1);
            }
        }
    }
}