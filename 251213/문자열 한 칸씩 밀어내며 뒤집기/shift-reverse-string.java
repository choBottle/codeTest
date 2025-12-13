import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int n = sc.nextInt();
        int len = s.length();
        String reversed = "";

        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();

            if(a == 1) {
                s = s.substring(1,len) + s.substring(0,1);
                System.out.println(s);
            }else if(a == 2) {
                s = s.substring(len-1, len) + s.substring(0,len-1);
                System.out.println(s);
            }else if(a == 3) {
                for (int j = len - 1; j >= 0; j--) {
                reversed = reversed + s.charAt(j);
                }
                s = reversed;
                reversed = "";
                System.out.println(s);
            }
        }
    }
}