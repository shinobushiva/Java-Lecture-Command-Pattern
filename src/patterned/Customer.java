package patterned;

public class Customer {

	private int money = 10000;
	private int quantity = 0;

	// 購入した際に呼び出される
	public void bought(int quantity, int price) {
		money -= price;
		this.quantity += quantity;
	}

	// 売却した際に呼び出される
	public void sold(int quantity, int price) {
		money += price;
		this.quantity -= quantity;
	}

	public int getMoney() {
		return money;
	}

	public int getQuantity() {
		return quantity;
	}

	@Override
	public String toString() {
		return "Customer : quantity=" + quantity + ", " + "money=" + money;
	}

}
