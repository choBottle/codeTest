import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);

        int sum = 0;

        for(int i = 0; i < nums.length/2; i++) {
            if(sum < nums[i] + nums[nums.length-1-i]) {
                sum = nums[i] + nums[nums.length-1-i];
            }
        }

        System.out.println(sum);
    }
}