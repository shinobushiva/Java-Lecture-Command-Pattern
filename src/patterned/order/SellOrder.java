package patterned.order;

import patterned.Customer;
import patterned.Market;

/**
 * 指定した数量を売却するオーダー
 * 
 * @author shiva
 *
 */
public class SellOrder extends Order {

	private int quantity;

	public SellOrder(Market market, Customer customer) {
		super(market, customer);
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void execute() {
		market.sell(quantity, customer);
	}
}
