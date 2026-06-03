import java.io.*;
import java.util.*;

public class Main {

    static class FastScanner {
        private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        private StringTokenizer st;

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();

        int N = fs.nextInt();

        long[] A = new long[N];
        long[] B = new long[N];

        for (int i = 0; i < N; i++) {
            A[i] = fs.nextInt();
        }

        for (int i = 0; i < N; i++) {
            B[i] = fs.nextInt();
        }

        long answer = 0;
        long diff = 0;

        for (int i = 0; i < N; i++) {
            diff += A[i] - B[i];
            answer += Math.abs(diff);
        }

        System.out.println(answer);
    }
}