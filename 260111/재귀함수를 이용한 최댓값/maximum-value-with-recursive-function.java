import java.util.Scanner;
public class Main {

    public static int biggest(int[] arr, int i, int num) {
        if(i == arr.length -1){
            return num;
        }

        if(arr[i] > num) {
            num = arr[i];
        }
        i++;
        return biggest(arr, i, num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(biggest(arr, 0, 0));
    }
}