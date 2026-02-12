import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int count = 0;

        int A1 = 11;
        int B1 = 11;
        int C1 = 11;
        

        while(true) {
            

            if(A < 11) {
                System.out.println(-1);
                break;
            }else if(A == 11 && B < 11) {
                System.out.println(-1);
                break;
            }else if(A == 11 && B == 11 && C < 11) {
                System.out.println(-1);
                break;
            }else if(A == A1 && B == B1 && C == C1) {
                System.out.println(count);
                break;
            }

            count++;
            C1++;

            if(C1 == 60) {
                B1++;
                C1 = 0;
            }

            if(B1 == 24) {
                A1++;
                B1 = 0;
            }
        }
    }
}