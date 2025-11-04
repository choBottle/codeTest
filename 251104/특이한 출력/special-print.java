import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int i = 1, j = 1;

        while (i <= N) {
            System.out.print("(" + i + ", " + j + ")");


            if (i == N && j == N) break;

            if ((i + j) % 4 == 0) {  
                System.out.println();
                j++;
            } else {
                System.out.print(" ");
                j++;
            }
            if(j == N + 1) {
                j = 1;
                i++;
            }
        }

    }
}
