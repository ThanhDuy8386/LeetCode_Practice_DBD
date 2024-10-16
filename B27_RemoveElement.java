import java.util.ArrayList;
import java.util.HashMap;

public class B26_RemoveDuplicateFeomSortArray {
    public static void main(String[] args) {
        int[] arr = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }
    static int removeDuplicates(int[] nums) {
        var map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        var list = new ArrayList<Integer>(map.keySet());
        return list.size();
    }
}
