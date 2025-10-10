public class B88 {
    //88. Merge Sorted Array
    public static void main(String[] args) {

    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int temp = 0;
        int s1 = 0;
        int s2 = 0;
        int[] newArr = new int[m+n];

        while (s1 < m && s2 < n) {
            if (nums1[s1] <= nums2[s2]) {
                newArr[temp] = nums1[s1];
                s1++;
                temp++;
            } else {
                newArr[temp] = nums2[s2];
                s2++;
                temp++;
            }
        }

        while (s1 < m) {
            newArr[temp] = nums1[s1];
            s1++;
            temp++;
        }

        while (s2 < n) {
            newArr[temp] = nums2[s2];
            s2++;
            temp++;
        }
        for(int i = 0; i < m+n; i++) {
            nums1[i] = newArr[i];
        }
    }
}
