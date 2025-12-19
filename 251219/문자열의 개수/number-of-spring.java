import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] sArr = new String[201];
        int i = 0;

        while(true) {
            String s = sc.next();

            

            if(s.equals("0")) {
                break;
            }
            sArr[i++] = s;
        }

        System.out.println(i);

        for(int j = 0; j < i; j++) {
            if(j%2 == 0) {
                System.out.println(sArr[j]);
            }
        }
    }
}