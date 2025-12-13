import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int len = s.length();

        for(int i = 1; i < len+2; i++) {
            System.out.println(s);
            s = s.substring(len-1,len) + s.substring(0,len-1);
        }
    }
}