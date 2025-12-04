import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String a = sc.next();

        int count = 0;

        for(int i = 0; i < str.length(); i++) {
            if(a.equals(str.substring(i,i+1))) {
                count++;
            }
        }

        System.out.print(count);
    }
}