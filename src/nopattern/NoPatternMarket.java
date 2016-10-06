package nopattern;

public class NoPatternMarket {

	private int price = 100;

	public void buy(int quantity, NoPatternCustomer customer) {
		customer.bought(quantity, getPrice() * quantity);
		System.out.println("Customer BOUGHT: amount=" + quantity + ", price="
				+ getPrice() + ", total=" + getPrice() * quantity);
		changePrice();// 売買が行われたら値段を変更
	}

	public void sell(int quantity, NoPatternCustomer customer) {
		customer.sold(quantity, getPrice() * quantity);
		System.out.println("Customer SOLD: amount=" + quantity + ", price="
				+ getPrice() + ", total=" + getPrice() * quantity);
		changePrice();// 売買が行われたら値段を変更
	}

	// 値段をランダムに増減する
	private void changePrice() {
		price += (int) ((Math.random() - 0.5) * 20);
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "current market price = " + price;
	}

}
