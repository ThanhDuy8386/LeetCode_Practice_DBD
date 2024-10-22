public class B69_SQRT {
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }

    static int mySqrt(int x) {
        long start = 0;
        long end = x;
        long mid;
        while(start <= end) {
            mid = (start+end)/2;
            if(mid == 0) {
                continue;
            }
            if(mid > x/mid) {
                end = mid-1;
            } else if(mid < x/mid) {
                start = mid+1;
            } else {
                return (int)mid;
            }
        }
        return (int)end;
    }
}
