import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int[] arr = new int[10];
        int sum = 0;

        for(int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            if(n == 0) {
                break;
            }else {
                arr[count++] = n;
            }
        }
        for(int i = count - 3; i < count+1; i++) {
            if(count - 1 <= 0) {
                break;
            }
            if(i <= 0) {
                i = 0;
            }
            sum += arr[i];
        }

        System.out.print(sum);


    }
}