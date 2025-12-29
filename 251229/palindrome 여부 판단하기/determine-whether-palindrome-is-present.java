import java.util.Scanner;
public class Main {
    public static boolean isPalindrome(String s) {
        boolean palindrome = true;
        for(int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i) == s.charAt(s.length()-i-1)) {
                continue;
            }else {
                palindrome = false;
            }
        }
        return palindrome;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        if(isPalindrome(input)) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}