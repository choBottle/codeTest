import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine().trim());

        int time = 1;

        while (true) {
            int maxDistance;

            if (time % 2 == 1) {
                int k = time / 2 + 1;
                maxDistance = k * k;
            } else {
                int k = time / 2;
                maxDistance = k * (k + 1);
            }

            if (maxDistance >= x) {
                System.out.println(time);
                return;
            }

            time++;
        }
    }
}