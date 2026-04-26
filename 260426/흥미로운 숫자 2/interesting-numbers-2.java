import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int count = 0;

        for (int i = 3; i <= 7; i++) {
            for (int majorDigit = 0; majorDigit <= 9; majorDigit++) {
                for (int minorDigit = 0; minorDigit <= 9; minorDigit++) {
                    if (majorDigit == minorDigit) continue;

                    for (int pos = 0; pos < i; pos++) {
                        long num = 0;
                        for (int k = 0; k < i; k++) {
                            if (k == pos) {
                                num = num * 10 + minorDigit;
                            } else {
                                num = num * 10 + majorDigit;
                            }
                        }

                        if (String.valueOf(num).length() == i && num >= X && num <= Y) {
                            count++;
                        }
                    }
                }
            }
        }

        System.out.println(count);
    }
}