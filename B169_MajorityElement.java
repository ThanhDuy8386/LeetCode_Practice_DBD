import java.util.HashMap;

public class B169_MajorityElement {
    public static void main(String[] args) {
        
    }
    public int majorityElement(int[] nums) {
        var map = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(var key : map.keySet()) {
            if(map.get(key) > nums.length / 2) {
                return key;
            }
        }
        return 0;
    }
}