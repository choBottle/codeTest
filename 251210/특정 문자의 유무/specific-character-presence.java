import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        boolean exist1 = false;
        boolean exist2 = false;

        for(int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i) == 'e' && s.charAt(i+1) == 'e') {
                exist1 = true;
            }else if(s.charAt(i) == 'a' && s.charAt(i+1) == 'b') {
                exist2 = true;
            }
        }

        if(exist1) {
            System.out.print("Yes" + " ");
        }else {
            System.out.print("No" + " ");
        }
        if(exist2) {
            System.out.print("Yes" + " ");
        }else {
            System.out.print("No" + " ");
        }
    }
}