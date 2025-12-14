import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    /**
     * 문자열을 왼쪽으로 한 칸 순환 이동(Circular Shift Left)시키는 메서드.
     * 첫 번째 문자를 맨 뒤로 보냅니다.
     * * @param s 이동할 문자열
     * @return 왼쪽으로 한 칸 이동된 문자열
     */
    public static String shiftLeft(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        // 첫 번째 문자
        char firstChar = s.charAt(0);
        // 나머지 문자열 (두 번째 문자부터 끝까지)
        String remaining = s.substring(1);
        
        // (bcde) + (a) = bcdea
        return remaining + firstChar;
    }

    /**
     * 문자열을 오른쪽으로 한 칸 순환 이동(Circular Shift Right)시키는 메서드.
     * 마지막 문자를 맨 앞으로 보냅니다.
     * * @param s 이동할 문자열
     * @return 오른쪽으로 한 칸 이동된 문자열
     */
    public static String shiftRight(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        int len = s.length();
        // 마지막 문자
        char lastChar = s.charAt(len - 1);
        // 나머지 문자열 (처음부터 마지막 문자 직전까지)
        String remaining = s.substring(0, len - 1);
        
        // (e) + (abcd) = eabcd
        return lastChar + remaining;
    }

    public static void main(String[] args) throws IOException {
        // 입력을 받기 위한 BufferedReader 설정
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. 문자열 A 입력
        // 문자열 A는 소문자 알파벳으로 이루어져 있습니다.
        String a = br.readLine();

        // 2. 명령 문자열 입력 (L 또는 R로 이루어짐)
        String commands = br.readLine();

        // 현재 문자열 상태를 저장할 변수
        String currentString = a;

        // 명령 문자열을 순서대로 순회하며 밀기 연산 수행
        for (int i = 0; i < commands.length(); i++) {
            char command = commands.charAt(i);

            if (command == 'L') {
                // 'L' 명령: 왼쪽으로 밀기
                currentString = shiftLeft(currentString);
            } else if (command == 'R') {
                // 'R' 명령: 오른쪽으로 밀기
                currentString = shiftRight(currentString);
            }
        }

        // 최종 결과 출력
        System.out.println(currentString);
    }
}