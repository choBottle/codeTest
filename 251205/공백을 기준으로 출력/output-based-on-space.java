import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        a = a.replace(" ","");
        b = b.replace(" ","");

        System.out.print(a + b);
    }
}