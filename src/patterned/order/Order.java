package patterned.order;

import patterned.Customer;
import patterned.Market;

public abstract class Order {

	protected Market market;
	protected Customer customer;

	public Order(Market market, Customer customer) {
		this.market = market;
		this.customer = customer;
	}

	public abstract void execute();

	@Override
	public String toString() {
		return "" + customer + "\n" + market;

	}

}
