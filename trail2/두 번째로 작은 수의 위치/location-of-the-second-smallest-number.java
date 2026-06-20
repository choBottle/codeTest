import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int smallest = 101;
        int secondSmallest = 101;

        for (int i = 0; i < n; i++) {
            if (numbers[i] < smallest) {
                secondSmallest = smallest;
                smallest = numbers[i];
            } else if (numbers[i] > smallest && numbers[i] < secondSmallest) {
                secondSmallest = numbers[i];
            }
        }

        int position = -1;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (numbers[i] == secondSmallest) {
                position = i + 1;
                count++;
            }
        }

        if (count == 1) {
            System.out.println(position);
        } else {
            System.out.println(-1);
        }

        sc.close();
    }
}