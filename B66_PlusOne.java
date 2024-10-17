public class B66_PlusOne {
    public static void main(String[] args) {

    }

    public int[] plusOne(int[] digits) {
        boolean flag = true;
        if (digits[digits.length - 1] != 9) {
            digits[digits.length - 1] += 1;
            return digits;
        }
        for (int i = 1; i < digits.length - 1; i++) {
            if (digits[i] != 9) {
                flag = false;
                break;
            }
        }
        if (!flag) {
            int k = 0;
            int[] result = new int[digits.length];
            for(int i = digits.length-1; i >= 0; i--) {
                if(digits[i]==9) {
                    result[i] = 0;
                } else {
                    result[i] = digits[i]+1;
                    k = i;
                    break;
                }
            }
            for(int i = 0; i < k; i++) {
                result[i] = digits[i];
            }
            return result;
        } else {
            if(digits[0]==9) {
                int[] result = new int[digits.length + 1];
                result[0] = 1;
                for (int i = 1; i < result.length; i++) {
                    result[i] = 0;
                }
                return result;
            } else {
                int[] result = new int[digits.length];
                result[0] = digits[0]+1;
                for (int i = 1; i < result.length; i++) {
                    result[i] = 0;
                }
                return result;
            }
        }
    }
}
//done
