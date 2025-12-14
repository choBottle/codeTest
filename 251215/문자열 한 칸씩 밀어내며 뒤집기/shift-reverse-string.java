import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 표준 입력을 위한 Scanner
        Scanner sc = new Scanner(System.in);

        // 초기 문자열 입력
        // StringBuilder를 사용하여 메모리 효율적으로 문자열을 다룹니다.
        StringBuilder s = new StringBuilder(sc.next());
        
        // 연산 횟수 입력
        int n = sc.nextInt();

        // n번의 연산을 수행
        for(int i = 0; i < n; i++) {
            // 연산 타입 입력 (1, 2, 3)
            int a = sc.nextInt();
            
            // 현재 문자열의 길이
            int len = s.length();

            if(len == 0) {
                // 빈 문자열일 경우 연산을 건너뜁니다.
                System.out.println("");
                continue;
            }

            if(a == 1) {
                // Type 1: 오른쪽으로 한 칸 회전 (Left Rotation -> Right Shift)
                // 예: "abc" -> "bca" (현재 코드의 동작)
                // 현재 코드의 로직은 첫 글자를 맨 뒤로 보냅니다. (왼쪽으로 한 칸 이동)
                
                // 1. 첫 번째 문자 (s.charAt(0))를 저장합니다.
                char firstChar = s.charAt(0);
                
                // 2. 첫 번째 문자를 삭제합니다.
                s.deleteCharAt(0);
                
                // 3. 저장했던 문자를 맨 뒤에 추가합니다.
                s.append(firstChar);

            } else if(a == 2) {
                // Type 2: 왼쪽으로 한 칸 회전 (Right Rotation -> Left Shift)
                // 예: "abc" -> "cab" (현재 코드의 동작)
                // 현재 코드의 로직은 마지막 글자를 맨 앞으로 보냅니다. (오른쪽으로 한 칸 이동)
                
                // 1. 마지막 문자 (s.charAt(len-1))를 저장합니다.
                char lastChar = s.charAt(len - 1);
                
                // 2. 마지막 문자를 삭제합니다.
                s.deleteCharAt(len - 1);
                
                // 3. 저장했던 문자를 맨 앞에 삽입합니다.
                s.insert(0, lastChar);
                
            } else if(a == 3) {
                // Type 3: 문자열 뒤집기 (Reverse)
                // StringBuilder의 내장 reverse() 메서드를 사용합니다.
                s.reverse();
            }
            
            // 연산 후 결과 출력
            System.out.println(s.toString());
        }
        
        // 스캐너 닫기 (자원 정리)
        sc.close();
    }
}