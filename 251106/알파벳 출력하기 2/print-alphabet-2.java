import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 65;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i <= j)  {
                    System.out.print((char)count + " ");
                    count++;
                    if(count == 91) {
                        count = 65;
                    }
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}