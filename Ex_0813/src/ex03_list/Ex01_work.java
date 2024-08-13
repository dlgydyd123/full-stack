package ex03_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex01_work {
	public static void main(String[] args) {
		// 아이디 생성 : abc
		// abc
		// 아이디 생성 : abc2
		// abc abc2
		// 아이디 생성 : abc2
		// 중복된 아이디
		// 아이디 생성 : abc3
		// abc abc2 abc3

		// 리스트의 요소의 개수가 4개이면 프로그램 종료

		Scanner scan = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		String str = "";
		String str2 = "";
		outer: while (true) {
			System.out.print("아이디 생성 : ");
			String id = scan.next();
//			for (int i = 0; i < list.size(); i++) {
//				if (id.equals(list.get(i))) {
//					System.out.println("중복된 아이디");
//					continue outer;
//				} 
//			}
			if(list.contains(id)) {
				System.out.println("중복된 아이디");
				continue;
			}
			
			list.add(id);
			for (int i = 0; i < list.size(); i++) {
				str = list.get(i);
			}
			str2 += str + " ";
			System.out.println(str2);
			if (list.size() == 4) {
				break;
			}

		}

	}
}
