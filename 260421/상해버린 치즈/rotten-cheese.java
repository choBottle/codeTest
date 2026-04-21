import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 설정값들을 먼저 모두 입력받습니다.
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt(); // 사람 수
        int m = sc.nextInt(); // 치즈 수
        int d = sc.nextInt(); // 먹은 기록 수
        int s = sc.nextInt(); // 아픈 기록 수

        // 2. 치즈 먹은 기록 저장
        int[] darrP = new int[d];
        int[] darrM = new int[d];
        int[] darrT = new int[d];
        for(int i = 0; i < d; i++) {
            darrP[i] = sc.nextInt();
            darrM[i] = sc.nextInt();
            darrT[i] = sc.nextInt();
        }

        // 3. 아픈 기록 저장
        int[] tarrP = new int[s];
        int[] tarrT = new int[s];
        for(int i = 0; i < s; i++) {
            tarrP[i] = sc.nextInt();
            tarrT[i] = sc.nextInt();
        }

        int maxPills = 0;

        // 4. 1번 치즈부터 M번 치즈까지 '상한 치즈' 후보인지 검증
        for(int cheeseIdx = 1; cheeseIdx <= m; cheeseIdx++) {
            boolean isPossible = true;

            for(int j = 0; j < s; j++) {
                int sickPerson = tarrP[j];
                int sickTime = tarrT[j];
                
                boolean ateBefore = false;
                for(int k = 0; k < d; k++) {
                    if(darrP[k] == sickPerson && darrM[k] == cheeseIdx && darrT[k] < sickTime) {
                        ateBefore = true;
                        break;
                    }
                }
                
                if(!ateBefore) {
                    isPossible = false;
                    break;
                }
            }

            if(isPossible) {
                HashSet<Integer> eaters = new HashSet<>();
                for(int k = 0; k < d; k++) {
                    if(darrM[k] == cheeseIdx) {
                        eaters.add(darrP[k]);
                    }
                }
                maxPills = Math.max(maxPills, eaters.size());
            }
        }

        System.out.println(maxPills);
    }
}