package patterned;

import java.util.ArrayList;
import java.util.List;

import patterned.order.Order;

public class Broker {

	/**
	 * trueの場合、売買の情報をコンソールに表示
	 */
	private boolean showDebugOutput = true;

	public void setShowDebugOutput(boolean showDebugOutput) {
		this.showDebugOutput = showDebugOutput;
	}

	private List<Order> orderList = new ArrayList<Order>();

	public void takeOrder(Order order) {
		orderList.add(order);
	}

	public void placeOrders() {

		for (Order order : orderList) {
			order.execute();
			if (showDebugOutput) {
				System.out.println("==order==");
				System.out.println(order);
				System.out.println("=========");
			}
		}
		orderList.clear();
	}

}
