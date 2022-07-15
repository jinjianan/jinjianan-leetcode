/**
 * 剑指 Offer 63. 股票的最大利润
 */
public class $Offer63 {

    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int r = 0;
        for (int price : prices) {
            if (price < min)
                min = price;
            else if (price - min > r)
                r = price - min;
        }
        return r;
    }

}
