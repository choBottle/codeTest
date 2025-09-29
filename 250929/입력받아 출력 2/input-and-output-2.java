import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();

        String[] arr = a.split("-");

        int b = Integer.parseInt(arr[0]);
        int c = Integer.parseInt(arr[1]);

        System.out.print(b + c);
    }
}