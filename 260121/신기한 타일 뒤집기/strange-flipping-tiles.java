import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] tiles = new int[200001]; 
        int currentPos = 100000; 
        
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);
            
            if (d == 'L') {
                for (int j = 0; j < x; j++) {
                    tiles[currentPos - j] = 1; 
                }
                currentPos -= (x - 1);
            } else {
                for (int j = 0; j < x; j++) {
                    tiles[currentPos + j] = 2; 
                }
                currentPos += (x - 1);
            }
        }
        
        int whiteCount = 0;
        int blackCount = 0;
        for (int tile : tiles) {
            if (tile == 1) whiteCount++;
            else if (tile == 2) blackCount++;
        }
        
        System.out.println(whiteCount + " " + blackCount);
    }
}