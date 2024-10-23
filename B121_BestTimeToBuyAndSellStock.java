public class B121_BestTimeToBuyAndSellStock {
    public static void main(String[] args) {

    }

    public int maxProfit(int[] prices) {
        int max = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            int temp = prices[i] - min;
            if (temp > max) {
                max = temp;
            }
            if (prices[i] < min) {
                min = prices[i];
            }
        }
        return max;
    }
}
//done