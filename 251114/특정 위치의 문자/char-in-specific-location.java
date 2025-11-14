import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = {"L","E","B","R","O","S"};

        String a = sc.next();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals(a)) {
                System.out.print(i);
                break;
            }
            if(i == arr.length-1) {
                System.out.print("None");
            }
        }

    }
}