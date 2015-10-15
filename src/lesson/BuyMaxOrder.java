package lesson;

import patterned.Customer;
import patterned.Market;
import patterned.order.Order;

/**
 * 手持ちの金額全部を使って最大の数量を購入するオーダー
 * 
 * [課題] executeメソッドをコメントで指定されたように実装してください<br>
 * 必要に応じてフィールド等は宣言すること。
 * 
 */
public class BuyMaxOrder extends Order {

	public BuyMaxOrder(Market stock, Customer customer) {
		super(stock, customer);
	}

	/**
	 * 手持ちの金額全部を使って最大の数量を購入するように実装してください
	 */
	public void execute() {

	}
}
