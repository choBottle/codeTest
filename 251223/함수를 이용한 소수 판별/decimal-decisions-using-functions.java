import java.util.Scanner;

public class Main {

    public static boolean isMini(int num) {
        int count = 0;
        for(int i = 2; i <= num; i++) {
            if(num%i == 0) {
                count++;
            }
        }

        if(count == 1) {
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        for(int i = a; i <= b; i++) {
            if(isMini(i)) {
                sum += i;
            }
        }

        System.out.println(sum);
    }
}