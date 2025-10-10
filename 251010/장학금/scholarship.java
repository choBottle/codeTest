import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int middle = sc.nextInt();
        int last = sc.nextInt();

        if(middle >= 90 && last >=95) {
            System.out.print("100000");
        }else if(middle >= 90 && last >=90) {
            System.out.print("50000");
        }else {
            System.out.print("0");
        }
    }
}