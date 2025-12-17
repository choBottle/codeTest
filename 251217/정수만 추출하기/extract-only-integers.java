import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 공백을 기준으로 두 문자열 입력 받기
        String s1 = sc.next();
        String s2 = sc.next();

        // 2. 각 문자열에서 숫자 부분 추출하여 합산
        int num1 = extractInteger(s1);
        int num2 = extractInteger(s2);

        // 3. 합계 출력
        System.out.println(num1 + num2);

        sc.close();
    }

    // 숫자가 아닌 문자가 나오기 전까지의 정수를 추출하는 메소드
    private static int extractInteger(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            // 문자가 숫자인지 확인 ('0' ~ '9' 사이)
            if (Character.isDigit(ch)) {
                sb.append(ch);
            } else {
                // 숫자가 아닌 문자를 만나면 반복문 종료
                break;
            }
        }

        // 추출된 문자열을 정수로 변환
        return Integer.parseInt(sb.toString());
    }
}