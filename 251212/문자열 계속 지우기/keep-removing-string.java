import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();
        sc.close();

        if (s2.isEmpty()) {
            System.out.print(s1);
            return;
        }

        while (true) {
            int index = s1.indexOf(s2);

            if (index == -1) {
                break;
            }

            s1 = s1.substring(0, index) + 
                 s1.substring(index + s2.length());

        }

        System.out.print(s1);
    }
}