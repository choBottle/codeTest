import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 두 줄에 걸쳐 문자열 입력 받기
        String s1 = sc.next();
        String s2 = sc.next();

        // 2. 각 문자열에서 숫자만 골라내어 합산
        long num1 = extractDigitsOnly(s1);
        long num2 = extractDigitsOnly(s2);

        // 3. 결과 출력
        System.out.println(num1 + num2);

        sc.close();
    }

    private static long extractDigitsOnly(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            // 문자가 숫자인 경우에만 StringBuilder에 추가
            if (Character.isDigit(ch)) {
                sb.append(ch);
            }
            // 알파벳인 경우 그냥 건너뜁니다 (이전 문제와 다른 점: break 하지 않음)
        }

        // 결과 문자열을 정수로 변환 (값이 커질 수 있으므로 long 권장)
        return Long.parseLong(sb.toString());
    }
}