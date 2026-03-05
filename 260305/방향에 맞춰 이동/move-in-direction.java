import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0; int y = 0;
        int[] dx = {1,0,-1,0};
        int[] dy = {0,-1,0,1};
        for (int i = 0; i < n; i++) {
            char direction = sc.next().charAt(0);
            int distance = sc.nextInt();
            int dirNum;
            if(direction == 'N') {
                dirNum = 3;
            }else if(direction == 'E') {
                dirNum = 0;
            }else if(direction == 'S') {
                dirNum = 1;
            }else {
                dirNum = 2;
            }

            x += dx[dirNum]*distance;
            y += dy[dirNum]*distance;
        }

        System.out.println(x + " " + y);
    }
}