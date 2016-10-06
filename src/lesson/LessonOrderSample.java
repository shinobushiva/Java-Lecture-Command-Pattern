package lesson;

import patterned.Broker;
import patterned.Customer;
import patterned.Market;

/**
 * [課題] BuyMaxOrderとBuyIfLessThanOrderの動作が確認できるように<br>
 * テストプログラムを作成してください
 * 
 * [発展課題] 独自のオーダーを作成してください<br>
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
