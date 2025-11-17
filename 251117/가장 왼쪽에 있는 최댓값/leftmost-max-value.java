import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int max = 0;
        int idx = 0;
        int idx2 = 0;
        int[] cnt = new int[5];

        for(int i = 0; i < n; i++) {
            cnt[i] = sc.nextInt();
        }

        

        for(int i = 0; i < n; i++) {
            if(max < cnt[i]) {
                max = cnt[i];
                idx = i+1;
            }
        }
        System.out.print(idx + " ");
        max = 0;
        idx2 = idx;
        idx = 0;


        while(true) {
            for(int i = 0; i < idx2 - 1; i++) {
            if(max < cnt[i]) {
                max = cnt[i];
                idx = i+1;
            }
        }
        if(idx == 0) {
            break;
        }
        System.out.print(idx + " ");
        if(idx == 1) {
            break;
        }
        max = 0;
        idx2 = idx;
        idx = 0;
        }
        
    }
}
