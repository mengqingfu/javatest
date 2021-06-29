package jp.co.aforce.test;

public class MinMax {

	public int getMaxValue(int a, int b, int c) {
		// TODO 自動生成されたメソッド・スタブ
		int max;
		if (a > b) {
			max = a;
			if (a > c) {
				max = a;
			} else {
				max = c;
			}
		} else {
			max = b;
			if (b > c) {
				max = b;
			} else {
				max = c;
			}
		}
		return max;
	}

	public int getMinValue(int a, int b, int c) {
		// TODO 自動生成されたメソッド・スタブ
		int min;
		if (a > b) {
			min = b;
			if (b > c) {
				min = c;
			} else {
				min = b;
			}
		} else {
			min = a;
			if (a > c) {
				min = c;
			} else {
				min = a;
			}
		}
		return min;
	}

}
