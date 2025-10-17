import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int classroom = 0;
        int corrider = 0;
        int toilet = 0;

        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0 && i % 3 != 0) {
                classroom++;
            }else if(i % 3 == 0 && i % 12 != 0) {
                corrider++;
            }else if(i % 12 == 0) {
                toilet++;
            }
        }

        System.out.print(classroom + " " + corrider + " " + toilet);
    }
}