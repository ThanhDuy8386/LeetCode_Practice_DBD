import java.util.ArrayList;

public class B27_RemoveElement {
    public static void main(String[] args) {
        
    }
    public int removeElement(int[] nums, int val) {
        var list = new ArrayList<Integer>();
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i]!=val) {
                list.add(nums[i]);
            } else {
                count++;
            }
        }
        for(int i = 0; i < nums.length; i++) {
            if(i >= nums.length-count) {
                nums[i] = val;
            } else {
                nums[i] = list.get(i);
            }
        }
        return list.size();
    }
    //done
}
