package jp.co.aforce.test;

import java.util.Random;

public class PracticeTest5 {

	public static void main(String[] args) {
		//練習問題１
		int fortune = new Random().nextInt(5);
		switch (fortune) {
		case 1:
			System.out.println("吉です。");
			break;
		case 2:
			System.out.println("中吉です。");
			break;
		case 3:
			System.out.println("大吉です。");
			break;
		default:
			System.out.println("凶です。");
			break;
		}
		//練習問題2
		int gokei = 0;
		for (int i = 1; i < 101; i++) {
			if (i % 7 == 0) {
				System.out.println(i);
				gokei += i;
			}
		}
		System.out.println("7の倍数の総合計は、" + gokei + "です。");
		//練習問題３
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i * j + "  ");
			}
			System.out.print("\n");
		}
	}
}