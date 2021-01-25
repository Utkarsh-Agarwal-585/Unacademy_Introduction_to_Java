package Introduction_To_Java_10;

public class Buy_And_Sell_Stock {

	public static void main(String[] args) {

		int[] arr = { 7, 1, 5, 3, 6, 4 };

		System.out.println(maxprofit(arr));

	}

	private static int maxprofit(int[] prices) {

		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;


		for (int i = 0; i < prices.length; i++) {

			if(prices[i] < minPrice) {
				minPrice = prices[i];
			}else if(prices[i] - minPrice > maxProfit){
				
				maxProfit = prices[i] - minPrice;
			}
		}
		
		return maxProfit;

	}

}
