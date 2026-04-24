import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int max = 0;

        for(int i = x; i <= y; i++) {
            int currentSum = cal(i);
            if(max < currentSum) {
                max = currentSum;
            }
        }

        System.out.println(max);
    }

    public static int cal(int num) {
        int res = 0;
        while(num > 0) {
            res += num % 10;
            num /= 10;
        }
        return res;
    }
}