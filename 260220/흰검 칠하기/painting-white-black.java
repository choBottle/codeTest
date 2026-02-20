import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int MAX = 200000;
        int[] whiteCnt = new int[MAX];
        int[] blackCnt = new int[MAX];
        char[] lastColor = new char[MAX];
        
        int current = 100000;

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);

            if (d == 'R') {
                for (int j = 0; j < x; j++) {
                    blackCnt[current]++;
                    lastColor[current] = 'B';
                    if (j < x - 1) current++; 
                }
            } else {
                for (int j = 0; j < x; j++) {
                    whiteCnt[current]++;
                    lastColor[current] = 'W';
                    if (j < x - 1) current--;
                }
            }
        }

        int white = 0, black = 0, gray = 0;

        for (int i = 0; i < MAX; i++) {
            if (whiteCnt[i] >= 2 && blackCnt[i] >= 2) {
                gray++;
            } else if (lastColor[i] == 'W') {
                white++;
            } else if (lastColor[i] == 'B') {
                black++;
            }
        }

        System.out.println(white + " " + black + " " + gray);
    }
}