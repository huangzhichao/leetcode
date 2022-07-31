public class Problem714 {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{1,9,5,8},2));
    }

    public static int maxProfit(int[] prices, int fee) {
        int[] hasArr = new int[prices.length];
        int[] nullArr = new int[prices.length];
        hasArr[0] = prices[0]*-1;
        nullArr[0] = 0;
        for (int i=1;i<prices.length;i++){
            hasArr[i] = Math.max(hasArr[i-1],nullArr[i-1]-prices[i]);
            nullArr[i] = Math.max(nullArr[i-1],hasArr[i-1]+prices[i]-fee);
        }
        return Math.max(hasArr[prices.length-1],nullArr[prices.length-1]);
    }
}
