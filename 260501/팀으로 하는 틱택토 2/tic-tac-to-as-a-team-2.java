import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] board = new int[3][3];
        for (int i = 0; i < 3; i++) {
            String line = sc.next();
            for (int j = 0; j < 3; j++) {
                board[i][j] = line.charAt(j) - '0';
            }
        }

        Set<Set<Integer>> winningTeams = new HashSet<>();

        List<int[]> lines = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            lines.add(new int[]{board[i][0], board[i][1], board[i][2]});
            lines.add(new int[]{board[0][i], board[1][i], board[2][i]});
        }
        lines.add(new int[]{board[0][0], board[1][1], board[2][2]});
        lines.add(new int[]{board[0][2], board[1][1], board[2][0]});

        for (int[] line : lines) {
            Set<Integer> players = new HashSet<>();
            for (int p : line) {
                players.add(p);
            }
            if (players.size() == 2) {
                winningTeams.add(players);
            }
        }

        System.out.println(winningTeams.size());
    }
}