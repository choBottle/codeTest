import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int even = 0;
        int three = 0;
        int threeCount = 0;

        for(int i = 0; i < 10; i++) {
            int n = sc.nextInt();

            if(n % 2 == 0 && n % 3 == 0) {
                even += n;
                three += n;
                threeCount++;
            }else if(n % 2 == 0) {
                even += n;
            }else if(n % 3 == 0) {
                three += n;
                threeCount++;
            }
        }

        System.out.print(even + " " + String.format("%.1f",(double)three/threeCount));
    }
}