import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[10];

        for(int i = 0; i < 10; i++){
            arr[i] = sc.next();
        }

        char a = sc.next().charAt(0);
        int count = 0;

        for(int i = 0; i < 10; i++){
            if(arr[i].charAt(arr[i].length()-1) == a) {
                System.out.println(arr[i]);
            }else {
                count++;
            }
        }

        if(count == 10) {
            System.out.print("None");
        }
    }
}