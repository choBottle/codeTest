import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        int minDiff = Integer.MAX_VALUE;
        boolean isPossible = false;

        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                
                for (int k = 0; k < 5; k++) {
                    if (k == i || k == j) continue;
                    
                    for (int l = k + 1; l < 5; l++) {
                        if (l == i || l == j) continue;

                        int m = -1;
                        for (int x = 0; x < 5; x++) {
                            if (x != i && x != j && x != k && x != l) {
                                m = x;
                                break;
                            }
                        }

                        int team1 = arr[i] + arr[j];
                        int team2 = arr[k] + arr[l];
                        int team3 = arr[m];
                        if (team1 != team2 && team2 != team3 && team1 != team3) {
                            int max = Math.max(team1, Math.max(team2, team3));
                            int min = Math.min(team1, Math.min(team2, team3));
                            
                            minDiff = Math.min(minDiff, max - min);
                            isPossible = true;
                        }
                    }
                }
            }
        }

        if (isPossible) {
            System.out.println(minDiff);
        } else {
            System.out.println(-1);
        }
        
        sc.close();
    }
}