import java.util.Arrays;
import java.util.HashMap;

public class B1_TwoSum {
    public static void main(String[] args) {
        System.out.println("cc");
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
    //DONE
}
