import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int m = sc.nextInt();
        
        int[][] matrix = new int[n][m];
        
        int top = 0, bottom = n - 1;
        int left = 0, right = m - 1;
        int num = 1;
        
        while (num <= n * m) {
   
            for (int i = top; i <= bottom && num <= n * m; i++) {
                matrix[i][left] = num++;
            }
            left++; 
            
            for (int i = left; i <= right && num <= n * m; i++) {
                matrix[bottom][i] = num++;
            }
            bottom--; 
            
            for (int i = bottom; i >= top && num <= n * m; i--) {
                matrix[i][right] = num++;
            }
            right--; 
            
            for (int i = right; i >= left && num <= n * m; i--) {
                matrix[top][i] = num++;
            }
            top++; 
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}