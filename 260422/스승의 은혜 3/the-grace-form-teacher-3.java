import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        int b = sc.nextInt();

        int[][] gifts = new int[n][2];
        for (int i = 0; i < n; i++) {
            gifts[i][0] = sc.nextInt(); 
            gifts[i][1] = sc.nextInt(); 
        }

        Arrays.sort(gifts, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return (o1[0] + o1[1]) - (o2[0] + o2[1]);
            }
        });

        int maxCount = 0;
        for (int i = 0; i < n; i++) {
            int currentBudget = b;
            int count = 0;

            int discountedPrice = (gifts[i][0] / 2) + gifts[i][1];
            
            if (discountedPrice <= currentBudget) {
                currentBudget -= discountedPrice;
                count = 1;
            } else {
                continue; 
            }

            for (int j = 0; j < n; j++) {
                if (i == j) continue; 

                int totalCost = gifts[j][0] + gifts[j][1];
                if (totalCost <= currentBudget) {
                    currentBudget -= totalCost;
                    count++;
                } else {
                    break;
                }
            }
            maxCount = Math.max(maxCount, count);
        }

        System.out.println(maxCount);
    }
}