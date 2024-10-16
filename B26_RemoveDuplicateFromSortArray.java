import java.util.ArrayList;
import java.util.HashMap;

public class B26_RemoveDuplicateFromSortArray {
    public static void main(String[] args) {
        
    }
    public int removeDuplicates(int[] nums) {
        var map = new HashMap<Integer, Integer>();
        var list = new ArrayList<Integer>();
        var listDuplicates = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++) {
            if(map.get(nums[i]) == null) {
                list.add(nums[i]);
                map.put(nums[i], 1);
            } else {
                listDuplicates.add(nums[i]);
            }
        }
        for(int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        int count = list.size();
        for (int i = 0; i < listDuplicates.size(); i++) {
            nums[count] = listDuplicates.get(i);
            count++;
        }
        return list.size();
    }
    //done
}
