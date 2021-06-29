package jp.co.aforce.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class PracticeTest3 {

	public static void main(String[] args) {
		//練習問題１
		String[] tanaka = new String[4];
		tanaka[0] = "1";
		tanaka[1] = "田中太郎";
		tanaka[2] = "男性";
		tanaka[3] = "27";
		//練習問題2
		System.out.println("番号：" + tanaka[0]);
		System.out.println("氏名：" + tanaka[1]);
		System.out.println("性別：" + tanaka[2]);
		System.out.println("年齢：" + tanaka[3]);
		//練習問題4
		Employee employee = new Employee(1, "田中太郎", "男性", 27);
		Employee employee1 = new Employee(2, "佐藤花子", "女性", 22);
		Employee employee2 = new Employee(3, "鈴木次郎", "男性", 31);
		ArrayList<Employee> list = new ArrayList<>();
		list.add(employee);
		list.add(employee1);
		list.add(employee2);
		for (Employee emp : list) {
			System.out.println("番号：" + emp.getId() + "、名前は" + emp.getName() + "、性別は" + emp.getGender() + "、年齢は"
					+ emp.getAge() + "です。");
		}
		//練習問題5
		HashMap<String, String> member = new HashMap<>();
		member.put("国語", "90点");
		member.put("数学", "80点");
		member.put("英語", "65点");
		Set<String> set = member.keySet();
		for (String p : set) {
			System.out.println(p + ":" + member.get(p));
		}
		//練習問題6
		/*１コンストラクタ新規不要*/
		/*２科目のデータが一意です。*/
	}
}