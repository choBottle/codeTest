import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력을 받기 위한 BufferedReader 설정
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 첫 번째 줄에 주어지는 문자열을 읽음
        String input = br.readLine();
        
        // 결과를 저장할 StringBuilder 객체 생성
        StringBuilder result = new StringBuilder();
        
        // 입력 문자열을 순회
        for (char ch : input.toCharArray()) {
            // 1. 문자가 영문자인지 확인
            if (Character.isLetter(ch)) {
                // 영문자라면 소문자로 변환하여 추가
                result.append(Character.toLowerCase(ch));
            } 
            // 2. 문자가 숫자인지 확인 (else if를 사용하여 중복 검사 방지)
            else if (Character.isDigit(ch)) {
                // 숫자라면 그대로 추가
                result.append(ch);
            }
            // 그 외의 문자(특수문자, 공백 등)는 무시하고 넘어감
        }
        
        // 최종 결과 출력
        System.out.println(result.toString());
    }
}