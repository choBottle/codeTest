import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();

        String[] arr = a.split("-");

        int d = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        int y = Integer.parseInt(arr[2]);
        
        System.out.print(y + "." + m + "." + d);
    }
}