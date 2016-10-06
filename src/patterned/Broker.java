package patterned;

import java.util.ArrayList;
import java.util.List;

import patterned.order.Order;

public class Broker {

	private List<Order> orderList = new ArrayList<Order>();

	public void takeOrder(Order order) {
		orderList.add(order);
	}

	public void placeOrders() {

		for (Order order : orderList) {

			System.out.println("==order==");
			order.execute();
			System.out.println(order);
			System.out.println("=========");
		}
		orderList.clear();
	}

}
