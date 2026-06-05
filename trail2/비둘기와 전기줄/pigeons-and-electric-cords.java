import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int[] pigeonPositions = new int[11];
        Arrays.fill(pigeonPositions, -1);
        
        int totalCrossings = 0; 
        
        for (int i = 0; i < N; i++) {
            int pigeonNum = sc.nextInt();
            int position = sc.nextInt();
            
            if (pigeonPositions[pigeonNum] != -1 && pigeonPositions[pigeonNum] != position) {
                totalCrossings++;
            }
            
            pigeonPositions[pigeonNum] = position;
        }
        
        System.out.println(totalCrossings);
        
        sc.close();
    }
}