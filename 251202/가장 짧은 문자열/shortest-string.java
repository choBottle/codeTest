import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0;
        int min = 0;

        for(int i = 0; i < 3; i++) {
            String a = sc.next();
            if(i == 0) {
                max = a.length();
                min = a.length(); 
               }else {
                 if(max < a.length()) {
                    max = a.length();
                 }else if(min > a.length()) {
                    min = a.length();
                 }
               }
        }

        System.out.print(max - min);
    }
}