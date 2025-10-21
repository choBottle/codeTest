import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sum = 0;
        int count = 0;
        while(true) {
            double n = sc.nextDouble();


            if(n >= 30 || n < 20) {
                System.out.println(String.format("%.2f",sum/count));
                break;
            }
            sum += n;
            count++;
            
        }
    }
}