import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {0,0,0,0};

        for(int i = 0; i < 3; i++) {
            String a = sc.next();
            int n = sc.nextInt();
            if(a.equals("Y") && n >= 37) {
                arr[0]++;
            }else if(a.equals("N") && n >= 37) {
                arr[1]++;
            }else if(a.equals("Y")) {
                arr[2]++;
            }else {
                arr[3]++;
            }
        }

        for(int i = 0; i < 4; i++) {
            System.out.print(arr[i] + " ");
        }

        if(arr[0] >= 2) {
            System.out.print("E");
        }
    }
}