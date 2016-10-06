package nopattern;

public class NoPatternOrderSample {

	public static void main(String[] args) {

		NoPatternMarket market = new NoPatternMarket();
		NoPatternCustomer customer = new NoPatternCustomer();

		// 購入
		market.buy(10, customer);
		printState(customer, market);
		// 購入
		market.buy(20, customer);
		printState(customer, market);
		// 売却
		market.sell(15, customer);
		printState(customer, market);
		// 全部売却
		int quantity = customer.getQuantity();
		market.sell(quantity, customer);
		printState(customer, market);

		// 結果表示
		System.out.println(customer);

	}

	public static void printState(NoPatternCustomer customer, NoPatternMarket market) {
		System.out.println(customer);
		System.out.println(market);
		System.out.println("=========");
	}
}
