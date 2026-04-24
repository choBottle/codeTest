import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n]; 

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int maxNum = -1;

        for (int i = 0; i < n; i++) {
            int limit = Math.min(i + k, n - 1); 
            
            for(int j = i + 1; j <= limit; j++) {
                if(arr[i] == arr[j]) {
                    if(maxNum < arr[i]) {
                        maxNum = arr[i];
                    }
                }
            }
        }

        System.out.println(maxNum);
    }
}