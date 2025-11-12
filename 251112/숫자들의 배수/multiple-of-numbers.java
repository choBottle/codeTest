import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = n;
        int count = 0;

        while(true) {
            System.out.print(n + " ");
            if(n%5 == 0){
                count++;
            }
            n+=a;
            if(count == 2) {
                break;
            }
        }
    }
}