class Solution {
    public int maxProfit(int[] prices) {
        int leftPointer = 0;
        int rightPointer = 1;
        int maxProfit = 0;
        int temp = 0;

        while (rightPointer < prices.length) {

            if (prices[leftPointer] < prices[rightPointer]) {
                temp = prices[rightPointer] - prices[leftPointer];
                if (maxProfit < temp) {
                    maxProfit = temp;
                }
                rightPointer++;
            } else {
                leftPointer = rightPointer;
                rightPointer++;
            }

        }
        return maxProfit;

    }
}