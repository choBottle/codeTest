import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[] a, b;
    static int answer = 0;

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);

        N = fs.nextInt();
        a = new int[N];
        b = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = fs.nextInt();
            b[i] = fs.nextInt();
        }

        int[] arr = {0, 1, 2};
        perm(arr, 0);

        System.out.println(answer);
    }

    static void perm(int[] arr, int depth) {
        if (depth == 3) {
            int win = 0;

            for (int i = 0; i < N; i++) {
                int first = arr[a[i] - 1];
                int second = arr[b[i] - 1];

                if ((first + 1) % 3 == second) {
                    win++;
                }
            }

            answer = Math.max(answer, win);
            return;
        }

        for (int i = depth; i < 3; i++) {
            swap(arr, depth, i);
            perm(arr, depth + 1);
            swap(arr, depth, i);
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static class FastScanner {
        private final InputStream in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        FastScanner(InputStream in) {
            this.in = in;
        }

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        int nextInt() throws IOException {
            int c;
            do {
                c = read();
            } while (c <= ' ');

            int sign = 1;
            if (c == '-') {
                sign = -1;
                c = read();
            }

            int val = 0;
            while (c > ' ') {
                val = val * 10 + c - '0';
                c = read();
            }

            return val * sign;
        }
    }
}