import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        char[] senders = new char[M + 1];
        int[] unreadCounts = new int[M + 1];

        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            senders[i] = st.nextToken().charAt(0);
            unreadCounts[i] = Integer.parseInt(st.nextToken());
        }

        if (unreadCounts[p] == 0) {
            return;
        }

        boolean[] hasRead = new boolean[N];

        for (int i = 1; i <= M; i++) {
            if (unreadCounts[i] >= unreadCounts[p]) {
                hasRead[senders[i] - 'A'] = true;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            if (!hasRead[i]) {
                sb.append((char) ('A' + i)).append(" ");
            }
        }

        System.out.println(sb.toString().trim());
    }
}