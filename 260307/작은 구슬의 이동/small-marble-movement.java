import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int R = sc.nextInt();
        int C = sc.nextInt();
        String D = sc.next();

        for (int i = 0; i < T; i++) {
            if (D.equals("U")) {
                if (R == 1) D = "D"; 
                else R--;          
            } 
            else if (D.equals("D")) {
                if (R == N) D = "U"; 
                else R++;          
            } 
            else if (D.equals("R")) {
                if (C == N) D = "L";
                else C++;          
            } 
            else if (D.equals("L")) {
                if (C == 1) D = "R"; 
                else C--;            
            }
        }

        System.out.println(R + " " + C);
    }
}