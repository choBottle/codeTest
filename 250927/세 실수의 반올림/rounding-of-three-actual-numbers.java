import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        System.out.println(roundOnce(a));
        System.out.println(roundOnce(b));
        System.out.println(roundOnce(c));
    }

    private static String roundOnce(double num) {
        String s = Double.toString(num);
        if (!s.contains(".")) return s; // 정수라면 그대로 반환

        int dot = s.indexOf(".");
        if (dot == s.length() - 1) return s; // 소수점만 있고 뒤에 없으면 그대로

        // 소수부 가져오기
        String integerPart = s.substring(0, dot);
        String decimalPart = s.substring(dot + 1);

        if (decimalPart.length() == 1) {
            // 소수 첫째 자리만 있는 경우 -> 반올림 처리
            int d = decimalPart.charAt(0) - '0';
            return (d >= 5)
                    ? Integer.toString(Integer.parseInt(integerPart) + 1)
                    : integerPart;
        } else {
            // 소수부가 여러 자리면 마지막 자리만 반올림
            String beforeLast = decimalPart.substring(0, decimalPart.length() - 1);
            int lastDigit = decimalPart.charAt(decimalPart.length() - 1) - '0';

            if (lastDigit >= 5) {
                // 올림
                long rounded = Long.parseLong(beforeLast) + 1;
                // 자리수 올림 후 앞자리 처리
                if (String.valueOf(rounded).length() > beforeLast.length()) {
                    // 자리수 올라감 -> 정수부에 반영
                    int intValue = Integer.parseInt(integerPart) + 1;
                    return intValue + "." + "0".repeat(beforeLast.length() - 1);
                }
                return integerPart + "." + rounded;
            } else {
                // 그대로 유지
                return integerPart + "." + beforeLast;
            }
        }
    }
}