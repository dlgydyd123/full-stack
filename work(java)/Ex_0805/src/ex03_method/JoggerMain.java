package ex03_method;

public class JoggerMain {

	public static void main(String[] args) {
		// 메서드의 호출
		// 메서드는 다른 메서드에서 호출되어 사용된다.

		// 메서드는 클래스 안에서 선언되므로 메서드를 사용하기
		// 위해서 해당 클래스의 객체부터 생성해야 한다.

		Jogger jogger = new Jogger(); // 객체생성
		jogger.name ="김나비";
		jogger.sayname();
		jogger.run(); // jogger개체의 run()메소드 호출

	}

}
