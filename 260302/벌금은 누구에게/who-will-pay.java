import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); 
        int m = sc.nextInt(); 
        int k = sc.nextInt(); 
        
        int[] arr = new int[n + 1]; 
        
        for (int i = 0; i < m; i++) {
            int studentNum = sc.nextInt();
            arr[studentNum]++;
            
            if (arr[studentNum] == k) {
                System.out.println(studentNum);
                return;
            }
        }
        
        System.out.println("-1");
    }
}