import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int n = sc.nextInt();
        String seats = sc.next();
        
        System.out.println(location(n, seats));
    }

    public static int location(int n, String seats) {
        int maxOfMinDist = 0;
        
        for (int i = 0; i < n; i++) {
            if (seats.charAt(i) == '0') {
                
                int currentMinDist = Integer.MAX_VALUE;
                int lastPersonIdx = -1;
                
                for (int j = 0; j < n; j++) {
                    if (seats.charAt(j) == '1' || j == i) {
                        if (lastPersonIdx != -1) {
                            int dist = j - lastPersonIdx;
                            if (dist < currentMinDist) {
                                currentMinDist = dist;
                            }
                        }
                        lastPersonIdx = j;
                    }
                }
                
                if (currentMinDist > maxOfMinDist) {
                    maxOfMinDist = currentMinDist;
                }
            }
        }
        
        return maxOfMinDist;
    }
}