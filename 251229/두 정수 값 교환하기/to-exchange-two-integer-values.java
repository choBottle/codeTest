import java.util.Scanner;

public class Main {
    public static void change(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = {n,m};
        change(arr);

        System.out.println(arr[0] + " "  + arr[1]);
    }
}