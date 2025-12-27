import java.util.Scanner;

public class Main {

    // 1. 윤년인지 확인하는 함수
    public static boolean isLeapYear(int y) {
        if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
            return true;
        }
        return false;
    }

    // 2. 해당 날짜가 존재하는지 확인하는 함수
    public static boolean isValidDate(int y, int m, int d) {
        // 월이 잘못된 경우
        if (m < 1 || m > 12) return false;

        // 각 월의 마지막 날짜 설정 (평년 기준)
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // 윤년인 경우 2월을 29일로 변경
        if (isLeapYear(y)) {
            daysInMonth[2] = 29;
        }

        // 일이 1보다 작거나 해당 월의 마지막 날보다 큰 경우
        if (d < 1 || d > daysInMonth[m]) {
            return false;
        }

        return true;
    }

    // 3. 계절을 반환하는 함수
    public static String getSeason(int m) {
        if (m >= 3 && m <= 5) return "Spring";
        else if (m >= 6 && m <= 8) return "Summer";
        else if (m >= 9 && m <= 11) return "Fall";
        else return "Winter"; // 12, 1, 2월
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Y, M, D 입력
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        // 유효성 검사 후 출력
        if (isValidDate(y, m, d)) {
            System.out.println(getSeason(m));
        } else {
            System.out.println("-1");
        }

        sc.close();
    }
}