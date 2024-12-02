public class B11_ContainerWithMostWater {
    public static void main(String[] args) {
        int[] arr = {1,1};
        System.out.println(maxArea(arr));
    }

    static int maxArea(int[] height) {
        int result = 0;
        int i = 0;
        int j = height.length - 1;
        while(i < j) {
            int k = Math.min(height[i], height[j]) * Math.abs(i - j);
            if(k > result) {
                result = k;
            }
            if(height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return result;
    }
}
