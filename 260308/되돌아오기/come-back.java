import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 50; int y = 50;
        int[][] arr = new int[101][101];
        int[] dx = {1,0,-1,0};
        int[] dy = {0,-1,0,1};
        int cnt = 0;
        for(int i = 0; i < n; i++){
            char dir = sc.next().charAt(0);
            int dist = sc.nextInt();
            if(dir == 'E') {
                for(int j = 0; j < dist; j++) {
                    cnt++;
                    x += dx[0];
                    y += dy[0];
                    if(x == 50 &&  y == 50) {
                        System.out.println(cnt);
                        return;
                    }
                }
            }else if(dir == 'S') {
                for(int j = 0; j < dist; j++) {
                    cnt++;
                    x += dx[1];
                    y += dy[1];
                    if(x == 50 &&  y == 50) {
                        System.out.println(cnt);
                        return;
                    }
                }
            }else if(dir == 'W') {
                for(int j = 0; j < dist; j++) {
                    cnt++;
                    x += dx[2];
                    y += dy[2];
                    if(x == 50 &&  y == 50) {
                        System.out.println(cnt);
                        return;
                    }
                }
                
            }
            else{
                for(int j = 0; j < dist; j++) {
                    cnt++;
                    x += dx[3];
                    y += dy[3];
                    if(x == 50 &&  y == 50) {
                        System.out.println(cnt);
                        return;
                    }
                }
            }
        }

        
        System.out.println(-1);
    }
}