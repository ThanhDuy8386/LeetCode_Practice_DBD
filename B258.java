public class B258 {
    //258. Add Digits

    public static void main(String[] args) {
        
    }

    public int addDigits(int num) {
        if(num < 10) return num;
        boolean flag = false;
        while(!flag) {
            int temp = calculate(num);
            if(temp < 10) {
                return temp;
            } else {
                num = temp;
            }
        }
        return 0;
    }

    public int calculate(int num) {
        int sum = 0;
        while(num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }
}
