import java.util.Scanner;
public class Main {
    public static void bigger(int[] arr) {
        if(arr[0] < arr[1]) {
            arr[0] += 10;
            arr[1] *=2; 
        }else {
            arr[1] += 10;
            arr[0] *=2; 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int[] arr = {a,b};
        bigger(arr);

        System.out.println(arr[0] + " " + arr[1]);
    }
}