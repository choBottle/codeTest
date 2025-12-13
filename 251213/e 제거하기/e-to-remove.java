import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       String s = sc.next();

       for(int i = 0; i < s.length(); i++) {
        if(s.charAt(i) == 'e') {
            System.out.print(s.substring(0,i) + s.substring(i+1));
            break;
        }
       }
    }
}