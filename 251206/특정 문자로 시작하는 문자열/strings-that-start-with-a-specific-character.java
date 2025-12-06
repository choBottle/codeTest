import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] arr = new String[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.next();
        }

        char a = sc.next().charAt(0);
        int count = 0;
        int length = 0;

        for(int i = 0; i < n; i++){
            if(arr[i].charAt(0) == a) {
                count++;
                length += arr[i].length();
            }
        }

        double lengthAvg = (double)length/count;

        System.out.print(count + " " + String.format("%.2f",lengthAvg));
    }
}