package patterned.order;

import patterned.Customer;
import patterned.Market;

/**
 * 指定した数量を購入するオーダー
 * 
 * @author shiva
 *
 */
public class BuyOrder extends Order {

	private int quantity;

	public BuyOrder(Market stock, Customer customer) {
		super(stock, customer);
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void execute() {
		market.buy(quantity, customer);
	}
}
