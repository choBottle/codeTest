import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        List<Integer> sPositions = new ArrayList<>();
        List<Integer> nPositions = new ArrayList<>();

        for (int i = 0; i < T; i++) {
            String type = sc.next();
            int pos = sc.nextInt();
            if (type.equals("S")) {
                sPositions.add(pos);
            } else {
                nPositions.add(pos);
            }
        }

        int specialCount = 0;

        for (int k = a; k <= b; k++) {
            int d1 = Integer.MAX_VALUE;
            for (int s : sPositions) {
                d1 = Math.min(d1, Math.abs(k - s));
            }

            int d2 = Integer.MAX_VALUE;
            for (int n : nPositions) {
                d2 = Math.min(d2, Math.abs(k - n));
            }

            if (d1 <= d2) {
                specialCount++;
            }
        }

        System.out.println(specialCount);
    }
}