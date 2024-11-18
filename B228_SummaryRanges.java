import java.util.ArrayList;
import java.util.List;

public class B228_SummaryRanges {
    public static void main(String[] args) {
        
    }

    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<String>();
        String start = String.valueOf(nums[0]);
        String end = String.valueOf(nums[0]);
        boolean flag = true;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] - 1 == nums[i - 1]) {
                end = String.valueOf(nums[i]);
                if(i == nums.length - 1) {
                    result.add(start+"->"+end);
                    flag = false;
                }
            } else if(start.equals(end)) {
                result.add(start);
                start = String.valueOf(nums[i]);
                end = String.valueOf(nums[i]);
            } else {
                result.add(start+"->"+end);
                start = String.valueOf(nums[i]);
                end = String.valueOf(nums[i]);
            }
        }
        if(flag) {
            result.add(end);
        }
        return result;
    }
}