package ex03_method;

public class Person {
	// 이름과 나이를 전달받아 출력하는 introduce메서드 생성하기
	// 결과
	// 제 이름은 X이고, 나이는 X세 입니다.
	// PersonMain에서 메서드 호출하기

	void introduce(String name, int age) {
		System.out.println("제 이름은 " + name + "이고, 나이는 " + age + "세입니다.");
	}
}
