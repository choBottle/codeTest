import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String seats = sc.next();
        char[] seatArr = seats.toCharArray();
        
        List<Integer> emptySeats = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (seatArr[i] == '0') {
                emptySeats.add(i);
            }
        }
        
        int maxMinDist = 0;
        int m = emptySeats.size();
        
        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < m; j++) {
                seatArr[emptySeats.get(i)] = '1';
                seatArr[emptySeats.get(j)] = '1';
                
                maxMinDist = Math.max(maxMinDist, calculateMinDist(seatArr));
                
                seatArr[emptySeats.get(i)] = '0';
                seatArr[emptySeats.get(j)] = '0';
            }
        }
        
        System.out.println(maxMinDist);
    }
    
    private static int calculateMinDist(char[] seatArr) {
        int minDist = Integer.MAX_VALUE;
        int lastPos = -1;
        
        for (int i = 0; i < seatArr.length; i++) {
            if (seatArr[i] == '1') {
                if (lastPos != -1) {
                    minDist = Math.min(minDist, i - lastPos);
                }
                lastPos = i;
            }
        }
        
        return minDist;
    }
}