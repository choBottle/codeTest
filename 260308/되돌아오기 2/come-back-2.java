import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String commands = sc.next();
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        int x = 0, y = 0; 
        int currDir = 0; 
        int elapsedTime = 0;
        int ans = -1;

        for (int i = 0; i < commands.length(); i++) {
            char cmd = commands.charAt(i);
            elapsedTime++; 

            if (cmd == 'L') {
                currDir = (currDir + 3) % 4;
            } else if (cmd == 'R') {
                currDir = (currDir + 1) % 4;
            } else if (cmd == 'F') {
                x += dx[currDir];
                y += dy[currDir];
            }

            if (x == 0 && y == 0) {
                ans = elapsedTime;
                break; 
            }
        }

        System.out.println(ans);
    }
}