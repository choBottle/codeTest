import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String targetDay = sc.next();

        int[] numDays = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dayNames = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        int targetIdx = 0;
        for (int i = 0; i < 7; i++) {
            if (dayNames[i].equals(targetDay)) {
                targetIdx = i;
                break;
            }
        }

        int totalDays1 = getDays(m1, d1, numDays);
        int totalDays2 = getDays(m2, d2, numDays);

        int count = 0;
        int diff = totalDays2 - totalDays1;
        
        for (int i = 0; i <= diff; i++) {
            if ((0 + i) % 7 == targetIdx) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static int getDays(int m, int d, int[] numDays) {
        int total = 0;
        for (int i = 1; i < m; i++) {
            total += numDays[i];
        }
        return total + d;
    }
}