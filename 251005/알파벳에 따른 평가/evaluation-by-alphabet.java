import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();

        if(n.equals("S")) {
            System.out.print("Superior");
        }else if(n.equals("A")) {
            System.out.print("Excellent");
        }else if(n.equals("B")) {
            System.out.print("Good");
        }else if(n.equals("C")) {
            System.out.print("Usually");
        }else if(n.equals("D")) {
            System.out.print("Effort");
        }else {
            System.out.print("Failure");
        }
    }
}