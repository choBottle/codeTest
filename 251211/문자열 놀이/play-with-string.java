import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int n2 = sc.nextInt();

            if (n2 == 1) { 
                int num1 = sc.nextInt(); 
                int num2 = sc.nextInt();

                StringBuilder sb = new StringBuilder(s);
                
                int index1 = num1 - 1;
                int index2 = num2 - 1;
                
                char char1 = s.charAt(index1);
                char char2 = s.charAt(index2);
                
                sb.setCharAt(index1, char2);
                sb.setCharAt(index2, char1);

                s = sb.toString(); 

                System.out.println(s);

            } else if (n2 == 2) { 
                char c1 = sc.next().charAt(0);
                char c2 = sc.next().charAt(0);
                s = s.replace(c1, c2); 

                System.out.println(s);
            }
        }
        
        sc.close();
    }
}