import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();

    int evenCount = 0;
    int oddCount = 0;
    
    for (int i = 0; i < n; i++) {
        int num = sc.nextInt();
        if (num % 2 == 0) {
            evenCount++;
        } else {
            oddCount++;
        }
    }
    
    int groups = 0;
    
    while (true) {
        if (groups % 2 == 0) {
            if (evenCount > 0) {
                evenCount--;
                groups++;
            } else if (oddCount >= 2) {
                oddCount -= 2;
                groups++;
            } else {
                break;
            }
        } else {
            if (oddCount > 0) {
                oddCount--;
                groups++;
            } else {
                break;
            }
        }
    }
    
    if (oddCount > 0) {
        groups -= (oddCount + 1) / 2;
    }
    
    System.out.println(groups);
}


}