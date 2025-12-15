import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        String result = "";

        for(int i = 0; i < s.length(); i++) {
            if(Character.isLetter(s.charAt(i))){
                result += s.substring(i,i+1);
            }
        }

        System.out.print(result.toUpperCase());
    }
}