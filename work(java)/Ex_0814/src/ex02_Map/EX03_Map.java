package ex02_Map;

import java.util.HashMap;
import java.util.Scanner;

public class EX03_Map {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("kim", 1111);
		map.put("lee", 2222);
		map.put("park", 3333);

		Scanner scan = new Scanner(System.in);

		System.out.print("id : ");
		String id = scan.next();
		System.out.print("pw : ");
		int pw = scan.nextInt();

		if (map.containsKey(id) == false) {
			System.out.println("아이디 불일치");
		} else {
			if (map.get(id) == pw) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호 불일치 ");
			}
		}

		// id : aaa
		// pw : 1111
		// 아이디 불일치

		// id : lee
		// pw : 3333
		// 비밀번호 불일치

		// id : park
		// pw : 3333
		// 로그인 성공

	}
}
