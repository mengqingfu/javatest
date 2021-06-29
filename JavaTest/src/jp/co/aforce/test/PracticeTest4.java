package jp.co.aforce.test;

import java.util.ArrayList;

public class PracticeTest4 {

	public static void main(String[] args) {
		//練習問題１
		/*2の方適切です。*/
		/*文字列の比較はequalsメソッドです。*/
		//練習問題2,3
		ArrayList<String> list = new ArrayList<String>();
		list.add("犬");
		list.add("猫");
		list.add("うなぎ");
		list.add("へび");
		String suki = "犬";
		if (list.contains(suki)) {
			System.out.println(suki + "はコレクションに含まれています");
		} else {
			System.out.println(suki + "はコレクションに含まれていません");
		}

		//練習問題4
		/*switch選択理由は、シンプルで分かりやすいです。*/
		String birthday = "3月";
		switch (birthday) {
		case "1月":
			System.out.println("1月の祝日は元日、成人の日");
			break;
		case "2月":
			System.out.println("2月の祝日は建国記念の日、天皇誕生日");
			break;
		case "3月":
			System.out.println("3月の祝日は春分の日");
			break;
		case "4月":
			System.out.println("4月の祝日は昭和の日");
			break;
		case "5月":
			System.out.println("5月の祝日は憲法記念日、みどりの日、こどもの日");
			break;
		case "6月":
			System.out.println("6月の祝日は（なし）");
			break;
		case "7月":
			System.out.println("7月の祝日は海の日、スポーツの日");
			break;
		case "8月":
			System.out.println("8月の祝日は山の日");
			break;
		case "9月":
			System.out.println("9月の祝日は敬老の日、秋分の日");
			break;
		case "10月":
			System.out.println("10月の祝日は（なし）");
			break;
		case "11月":
			System.out.println("11月の祝日は文化の日、勤労感謝の日");
			break;
		case "12月":
			System.out.println("12月の祝日は（なし）");
			break;
		}

	}
}