import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] arr = new long[15];
        
        for (int i = 0; i < 15; i++) {
            arr[i] = sc.nextLong();
        }
        
        Arrays.sort(arr);
        
        long a = arr[0];
        long b = arr[1];
        long c = arr[2];
        long d = arr[14] - (a + b + c);
        
        System.out.println(a + " " + b + " " + c + " " + d);
    }
}