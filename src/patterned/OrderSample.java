package patterned;

import patterned.order.BuyOrder;
import patterned.order.SellAllOrder;
import patterned.order.SellOrder;

public class OrderSample {

	public static void main(String[] args) {

		Market market = new Market();
		Customer customer = new Customer();
		Broker broker = new Broker();

		BuyOrder bo1 = new BuyOrder(market, customer);
		bo1.setQuantity(10);
		broker.takeOrder(bo1);

		BuyOrder bo2 = new BuyOrder(market, customer);
		bo2.setQuantity(20);
		broker.takeOrder(bo2);

		SellOrder so1 = new SellOrder(market, customer);
		so1.setQuantity(15);
		broker.takeOrder(so1);

		SellAllOrder sao1 = new SellAllOrder(market, customer);
		broker.takeOrder(sao1);

		broker.placeOrders();
		System.out.println(customer);

	}
}
