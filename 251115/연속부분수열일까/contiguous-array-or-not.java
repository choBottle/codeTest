import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        boolean ok = false;

        int[] arrA = new int[A];
        int[] arrB = new int[B];

        for(int i = 0; i < A; i++) {
            arrA[i] = sc.nextInt();
        }
        for(int i = 0; i < B; i++) {
            arrB[i] = sc.nextInt();
        }

        for (int i = 0; i <= A - B; i++) {
            boolean match = true;

            for (int j = 0; j < B; j++) {
                if (arrA[i + j] != arrB[j]) {
                    match = false;
                    break;
                }
            }

            if (match) {
                ok = true;
                break;
            }
        }

        if(ok) {
            System.out.print("Yes");
        }else {
            System.out.print("No");
        }
    }
}