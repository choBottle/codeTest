import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 10; i++) {
            String s = sc.next();

            if(s.equals("END")) {
                break;
            }
            for(int j = s.length() -1; j >= 0; j--) {
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
    }
}