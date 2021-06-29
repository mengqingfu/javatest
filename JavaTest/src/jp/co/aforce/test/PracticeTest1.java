package jp.co.aforce.test;

public class PracticeTest1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//練習問題１
		final double TAX = 0.1;
		System.out.println("消費税率:" + TAX);

		//練習問題2
		int x = 480;
		int price = (int) (x * (1 + TAX));
		System.out.println("この商品の値段は" + price + "円です");
		//練習問題3
		String name = "孟慶福";
		System.out.println("私は" + name + "です。");
	}
}