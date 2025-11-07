import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        for(int i = 0; i < 10; i++) {
            int a = sc.nextInt();
            if(a >= 250) {
                break;
            }
            sum += a;
            count++;
        }
        if(count == 0) {
            System.out.print("0 0.0");
        }else {
            System.out.print(sum + " " + ((double)sum)/count);
        }
        
    }
}