public class B231_PowerOfTwo {
    public static void main(String[] args) {
        if(isPowerOfTwo(536870912)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        System.out.println((Math.log(536870912) / Math.log(2)));
    }

    static boolean isPowerOfTwo(int n) {
        // if(((Math.log(n) / Math.log(2)) * 100) % 100 == 0) {
        //     return true;
        // }
        // 
        //this solution fail at final testcase when number has lots of digits.
        if(n <= 0) return false;
        return ((n & (n-1))) == 0;
    }
}
