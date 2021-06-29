package jp.co.aforce.test;

import java.util.Random;

public class PracticeTest2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int x = 10;
		int y = 28;
		double z = 3.14;
		//練習問題１
		System.out.println("x * y = " + (x * y));
		//練習問題2
		System.out.println("y / x = " + (y / x));
		System.out.println("y % x = " + (y % x));
		//練習問題3
		double seki = y * z;
		System.out.println("y * z = " + seki);
		//練習問題4
		seki++;
		System.out.println("インクリメント演算子を使い１を足す　＝　" + seki);
		//練習問題5
		int age = 29;
		int randomNumber = new Random().nextInt(101) + 1;
		if (age > randomNumber) {
			System.out.println("randomNumber = " + randomNumber + ",私の方が年上です");
		} else if (age < randomNumber) {
			System.out.println("randomNumber = " + randomNumber + ",私の方が年下です");
		} else if (age == randomNumber) {
			System.out.println("randomNumber = " + randomNumber + ",私と同い年です");
		}
	}
}