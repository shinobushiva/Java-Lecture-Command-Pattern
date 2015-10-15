package lesson;

import patterned.Broker;
import patterned.Customer;
import patterned.Market;

/**
 * [課題]BuyMaxOrderとBuyIfLessThanOrderの動作が確認できるように<br>
 * テストプログラムを作成してください
 * 
 *
 */
public class LessonOrderSample {

	public static void main(String[] args) {

		Market market = new Market();
		Customer customer = new Customer();
		Broker broker = new Broker();

		// BuyMaxOrderとBuyIfLessThanOrderの動作が確認できるように
		// テストプログラムを作成してください

		broker.placeOrders();
		System.out.println(customer);

	}
}
