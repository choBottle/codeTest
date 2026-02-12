import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int count =  1;
        

        while(true) {
            if(m1 == m2 && d1 == d2) {
                break;
            }

            count++;
            d1++;

            if(m1 == 2 && d1 == 28) {
                d1 = 0;
                m1++;
            }else if(m1 <= 7 && m1%2 == 0 && d1 == 30) {
                d1 = 0;
                m1++;
            }else if(m1 <= 7 && m1%2 == 1 && d1 == 31) {
                d1 = 0;
                m1++;
            }else if(m1 > 7 && m1%2 == 0 && d1 == 31) {
                d1 = 0;
                m1++;
            }else if(m1 > 7 && m1%2 == 1 && d1 == 30) {
                d1 = 0;
                m1++;
            }
        }

        System.out.println(count);
    }
}