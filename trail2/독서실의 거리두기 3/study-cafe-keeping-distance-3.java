import java.util.Scanner;

public class Main {

    static int getMinDistance(char[] seats) {
        int last = -1;
        int minDist = 1000000;

        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == '1') {
                if (last != -1) {
                    int dist = i - last;
                    if (dist < minDist) {
                        minDist = dist;
                    }
                }
                last = i;
            }
        }

        return minDist;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = sc.next();

        char[] seats = str.toCharArray();

        int answer = 0;

        for (int i = 0; i < n; i++) {
            if (seats[i] == '0') {
                seats[i] = '1';

                int minDist = getMinDistance(seats);

                if (minDist > answer) {
                    answer = minDist;
                }

                seats[i] = '0';
            }
        }

        System.out.println(answer);
    }
}