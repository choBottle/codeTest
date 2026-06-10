import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];

        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();

        //정렬 먼저 시키기

        Arrays.sort(arr);

        int a = arr[0];
        int b = arr[1];
        int c = arr[2];

        if (b - a == 1 && c - b == 1) {
            System.out.println(0);
        } else if (b - a == 2 || c - b == 2) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
    }
}