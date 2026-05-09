import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int[] origin = new int[n];
        for (int i = 0; i < n; i++) {
            origin[i] = sc.nextInt();
        }

        int minDiffSum = Integer.MAX_VALUE;

        for (int doubleIdx = 0; doubleIdx < n; doubleIdx++) {
            for (int removeIdx = 0; removeIdx < n; removeIdx++) {
                ArrayList<Integer> currentList = new ArrayList<>();
                
                for (int k = 0; k < n; k++) {
                    if (k == removeIdx) continue;
                    if (k == doubleIdx) {
                        currentList.add(origin[k] * 2);
                    } else {
                        currentList.add(origin[k]);
                    }
                }

                int currentDiffSum = 0;
                for (int i = 0; i < currentList.size() - 1; i++) {
                    currentDiffSum += Math.abs(currentList.get(i) - currentList.get(i + 1));
                }

                if (currentDiffSum < minDiffSum) {
                    minDiffSum = currentDiffSum;
                }
            }
        }

        System.out.println(minDiffSum);
        sc.close();
    }
}