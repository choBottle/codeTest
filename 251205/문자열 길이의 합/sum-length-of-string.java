import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 0;
        int line = 0;

        String[] arr = new String[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.next();
            if(arr[i].charAt(0) == 'a') {
                count++;
            }
            line += arr[i].length();
        }

        System.out.println(line + " " + count);
    }
}