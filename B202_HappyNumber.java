public class B202_HappyNumber {
    public static void main(String[] args) {
        if(isHappy(19)) {
            System.out.println("ok");
        } else {
            System.out.println("no");
        }
    }

    static boolean isHappy(int n) {
        int result = 0;
        String temp = String.valueOf(n);
        int count = 0;
        while (result != 1) {
            for(int i = 0; i < temp.length(); i++) {
                result += (int)Math.pow(Character.getNumericValue(temp.charAt(i)), 2);
            }
            if(result == 1) {
                return true;
            }
            //System.out.println(result);
            temp = String.valueOf(result);
            result = 0;
            count++;
            if(count == 10) {
                return false;
            }
        }
        return false;   
    }
}
