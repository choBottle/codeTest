import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Q = sc.nextInt();

        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            int a = sc.nextInt();
            arr[i] = a;
        }

        for(int i = 0; i < Q; i++) {
            int a = sc.nextInt();

            if(a == 1) {
                int b = sc.nextInt();
                System.out.println(arr[b-1]);
            }else if(a == 2) {
                int b = sc.nextInt();
                for(int j = 0; j < N; j++) {
                    if(arr[j] == b) {
                        System.out.println(j+1);
                        break;
                    }
                }
            }else if(a == 3) {
                int b = sc.nextInt();
                int c = sc.nextInt();

                for(int j = b-1; j <= c-1; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
            }
        }
    }
}