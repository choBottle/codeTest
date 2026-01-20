import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int[] numDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        String[] dayOfWeek = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        int totalDays1 = calculateDays(m1, d1, numDays);
        int totalDays2 = calculateDays(m2, d2, numDays);
        
        int diff = totalDays2 - totalDays1;
        int resultIndex = (diff % 7 + 7) % 7;

        System.out.println(dayOfWeek[resultIndex]);
    }

    // 1월 1일부터 해당 날짜까지의 총 일수를 구하는 메서드
    public static int calculateDays(int m, int d, int[] numDays) {
        int total = 0;
        for (int i = 1; i < m; i++) {
            total += numDays[i];
        }
        total += d;
        return total;
    }
}