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

	// Java8からインタフェースでメソッドのデフォルト実装を行えるようになった
	public abstract void execute();

	@Override
	public String toString() {
		return "" + market + "\n" + customer;

	}

}
