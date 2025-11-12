import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int count = 0;
        while(true) {
            arr[count] = sc.nextInt();
            if(arr[count] == 0) {
                break;
            }
            count++;
        }

        for(int i = 0; i < count; i++) {
            if(arr[i] % 2 == 0) {
                System.out.print((arr[i]/2) + " ");
            }else {
                System.out.print((arr[i]+3) + " ");
            }
            
        }
    }
}