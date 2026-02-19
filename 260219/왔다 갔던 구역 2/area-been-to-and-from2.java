import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int current = 100;
        int[] arr = new int[201];
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            if(dir == 'R') {
                for(int j = current; j < current+x; j++) {
                    arr[j]++;
                }
                current += x;
            }else {
                for(int j = current - 1; j >= current-x; j--) {
                    arr[j]++;
                }
                current -= x;
            }
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= 2) {
                count++;
            }
        }

        System.out.println(count);
    }
}