package ex02_list;

// ctrl + shift + O : import한번에 가능
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ex04_ArrayList {
	public static void main(String[] args) {
		// ArrayList의 데이터 얻기
		List<Integer> list = new ArrayList<>();
		Random ran = new Random();

		// 1에서 30사이의 난수 10개를 list에 추가해주세요
		for (int i = 0; i < 10; i++) {
			list.add(ran.nextInt(30) + 1);
		}
		System.out.println(list);

		// List에 담긴 데이터 중 짝수만 출력
		System.out.print("짝수 : ");
		for (int i = 0; i < list.size(); i++) {
			int value = list.get(i);
			if (value % 2 == 0) {
				System.out.print(value + " ");
			}
		}

		// 추가 add()
		// 조회 get()
		// 삭제 remove()
		// 수정 set()
		// 비어있냐? isEmpty();
		// 크기가 몇이냐? size();
		// 포함하고 있냐? contains();

		// 배열의 크기 : 배열명.length
		// 문자열의 크기 : 문자열.length()
		// 컬렉션의 크기 : 컬렉션객체.size()
		// 향상된 for문을 통해 출력할 수도 있다.
		for (int value : list) {
			System.out.println("값 : " + value);
		}

	}
}
