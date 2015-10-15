package lesson;

import patterned.Customer;
import patterned.Market;
import patterned.order.Order;

/**
 * 購入時の金額が指定した値以下であれば購入するオーダー
 * 
 * [課題] executeメソッドをコメントで指定されたように実装してください<br>
 * 必要に応じてフィールド等は宣言すること。
 * 
 */
public class BuyIfLessThanOrder extends Order {

	public BuyIfLessThanOrder(Market stock, Customer customer) {
		super(stock, customer);
	}

	/**
	 * 購入時の金額が指定した値以下であれば購入するように実装してください。<br>
	 * （値より大きい場合は何もしない）
	 */
	public void execute() {

	}
}
