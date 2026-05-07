import java.util.*;

public class Main {
    static int n;
    static int[][] points;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        n = sc.nextInt();
        points = new int[n][2];
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
        }

        if (solve(0)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    static boolean solve(int count) {
        int targetIdx = -1;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                targetIdx = i;
                break;
            }
        }

        if (targetIdx == -1) return true;
        if (count == 3) return false;

        int tx = points[targetIdx][0];
        int ty = points[targetIdx][1];

        boolean[] backup = visited.clone();
        for (int i = 0; i < n; i++) {
            if (points[i][0] == tx) visited[i] = true;
        }
        if (solve(count + 1)) return true;
        visited = backup.clone();

        for (int i = 0; i < n; i++) {
            if (points[i][1] == ty) visited[i] = true;
        }
        if (solve(count + 1)) return true;
        visited = backup;

        return false;
    }
}