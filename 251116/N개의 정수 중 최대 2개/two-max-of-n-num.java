import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N, i, j, x;
        final int INT_MIN;
        
        INT_MIN = Integer.MIN_VALUE;
        
        N = sc.nextInt();

        int[] a = new int[N + 1];

        a[N] = INT_MIN;

        for(i = 0 ; i < N ; i ++){
            a[i] = sc.nextInt();
        }

        for(i = 0 ; i < N ; i ++){
            for(j = 0 ; j < N ; j ++){
                if(a[j] < a[j + 1]){
                    x = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = x;
                }
            }
        }
        System.out.print(a[0] + " " + a[1]);
    }
}

