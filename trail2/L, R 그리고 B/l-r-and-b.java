import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] map = new char[10][10];
        int startRow = 0;
        int startCol = 0;

        for (int i = 0; i < 10; i++) {
            String line = sc.nextLine();

            for (int j = 0; j < 10; j++) {
                map[i][j] = line.charAt(j);

                if (map[i][j] == 'L') {
                    startRow = i;
                    startCol = j;
                }
            }
        }

        int[][] distance = new int[10][10];
        boolean[][] visited = new boolean[10][10];

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{startRow, startCol});
        visited[startRow][startCol] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int row = current[0];
            int col = current[1];

            if (map[row][col] == 'B') {
                System.out.println(distance[row][col] - 1);
                break;
            }

            for (int i = 0; i < 4; i++) {
                int nextRow = row + dr[i];
                int nextCol = col + dc[i];

                if (nextRow < 0 || nextRow >= 10 || nextCol < 0 || nextCol >= 10) {
                    continue;
                }

                if (visited[nextRow][nextCol] || map[nextRow][nextCol] == 'R') {
                    continue;
                }

                visited[nextRow][nextCol] = true;
                distance[nextRow][nextCol] = distance[row][col] + 1;
                queue.offer(new int[]{nextRow, nextCol});
            }
        }

        sc.close();
    }
}