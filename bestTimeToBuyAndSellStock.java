public class bestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int minTillNow = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            minTillNow = Math.min(minTillNow, prices[i]);
            maxProfit = Math.max(maxProfit,prices[i]-minTillNow);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 6, 5, 0, 3 };
        System.out.println(maxProfit(arr));
    }
}
