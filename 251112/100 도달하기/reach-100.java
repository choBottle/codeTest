import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];

        arr[0] = 1;
        arr[1] = sc.nextInt();

        int count = 2;
        for(int i = 2; i <= 100; i++) {
            arr[count] = arr[i-2] + arr[i-1];
            if(arr[count] > 100) {
                break;
            }
            count++;
        }

        for(int i = 0; i < count+1; i++) {
            System.out.print(arr[i] + " "); 
        }
    }
}