import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int count = 0;

        for(int i = x; i <= y; i++) {
            String s = String.valueOf(i);
            if(isPalindrome(s)) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static boolean isPalindrome(String str) {
    int left = 0;
    int right = str.length() - 1;

    while (left < right) {
        if (str.charAt(left) != str.charAt(right)) {
            return false; 
        }
        left++;
        right--;
    }
    return true;
}
}