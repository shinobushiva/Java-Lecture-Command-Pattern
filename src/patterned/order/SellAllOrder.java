package patterned.order;

import patterned.Customer;
import patterned.Market;

/**
 * 全部を売却するオーダー
 * 
 * @author shiva
 *
 */
public class SellAllOrder extends Order {

	public SellAllOrder(Market market, Customer customer) {
		super(market, customer);
	}

	public void execute() {
		int quantity = customer.getQuantity();
		market.sell(quantity, customer);
	}
}
