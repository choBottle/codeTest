import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        int[][] queries = new int[N][3];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            queries[i][0] = Integer.parseInt(st.nextToken());
            queries[i][1] = Integer.parseInt(st.nextToken()); 
            queries[i][2] = Integer.parseInt(st.nextToken()); 
        }
        
        int possibleCount = 0;
        
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i == j) continue; 
                
                for (int k = 1; k <= 9; k++) {
                    if (i == k || j == k) continue; 
                    boolean isValid = true; 
                    for (int q = 0; q < N; q++) {
                        int guess = queries[q][0];
                        int expectedStrike = queries[q][1];
                        int expectedBall = queries[q][2];
                        
                        // 추측한 숫자의 각 자리수 분리
                        int g1 = guess / 100;
                        int g2 = (guess / 10) % 10;
                        int g3 = guess % 10;
                        
                        int strike = 0;
                        int ball = 0;
                        
                        if (i == g1) strike++;
                        if (j == g2) strike++;
                        if (k == g3) strike++;
                        
                        if (i == g2 || i == g3) ball++;
                        if (j == g1 || j == g3) ball++;
                        if (k == g1 || k == g2) ball++;
                        
                        if (strike != expectedStrike || ball != expectedBall) {
                            isValid = false;
                            break;
                        }
                    }
                    
                    if (isValid) {
                        possibleCount++;
                    }
                }
            }
        }
        
        System.out.println(possibleCount);
    }
}