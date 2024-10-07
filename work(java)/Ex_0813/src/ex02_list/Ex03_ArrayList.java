package ex02_list;

import java.util.ArrayList;
import java.util.List;

public class Ex03_ArrayList {
	public static void main(String[] args) {
		// ArrayList의 데이터 삭제
		List<Integer> list = new ArrayList<>();

		// 리스트에 2의 배수를 10개 넣어주세요
		for (int i = 1; i <= 10; i++) {
			list.add(2 * i);
		}

		System.out.println(list);

		// 3번째 인덱스 삭제
		list.remove(3);
		System.out.println(list);

		// 객체를 통한 삭제
		list.remove(Integer.valueOf(10));
		System.out.println(list);

		// 전체삭제
		// list.removeAll(list); ->삭제하고 논리형을 반환 true,false
		// list.clear(); // -> 반환하는게 없음
		// System.out.println(list);

		if (!list.isEmpty()) {
			if (list.removeAll(list)) {
				System.out.println("장바구니가 비워졌습니다.");
			}
		}

	}
}
