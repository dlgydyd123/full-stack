package ex04_exception;

public class Ex02_Exeption {
	public static void main(String[] args) {
		// NumberFormatException
		// 잘못된 문자열을 정수로 변환하려고 할 때 발생
		// 숫자형태("111")은 정수로 변환할 수 있지만
		// "11.11"은 변환할 수 없다.

		String str01 = "11";
		String str02 = "11.2";

		// 정수 형태의 문자열을 정수로 변환
		// Integer.parseInt("정수형태의 문자열")
		int num01 = Integer.parseInt(str01);

		System.out.println("String to int : " + num01);

		int num02 = Integer.parseInt(str02);
		
		System.out.println("String to int : " + num02);

	}
}
