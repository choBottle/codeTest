import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cold1 = sc.next();
        int temp1 = sc.nextInt();

        String cold2 = sc.next();
        int temp2 = sc.nextInt();

        String cold3 = sc.next();
        int temp3 = sc.nextInt();

        int emergency = 0;

        if(cold1.equals("Y") && temp1 >= 37) {
            emergency++;
        }
        if(cold2.equals("Y") && temp2 >= 37) {
            emergency++;
        }
        if(cold3.equals("Y") && temp3 >= 37) {
            emergency++;
        }

        if(emergency >= 2) {
            System.out.print("E");
        }else {
            System.out.print("N");
        }
    }
}