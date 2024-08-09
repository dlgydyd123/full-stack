package ex01_interface;

public class ConverterMain {

	public static void main(String[] args) {
		// Converter클래스를 상속받아 원화를 달러로 바꾸는
		// Won2Doller클래스를 작성하시오
		// main 메서드의 실행결과는 다음과 같다.
		
								// 생성자의 호출
		Won2Dollar toDollar = new Won2Dollar(1200); // 1달러는 1200
		toDollar.run();

		// [실행결과]
		// 원을 달러로 바꿉니다.
		// 원을 입력하세요 >> 24000
		// 변환 결과 : 20.0달러 입니다.

	}

}
