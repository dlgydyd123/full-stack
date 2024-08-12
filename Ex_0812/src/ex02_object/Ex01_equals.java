package ex02_object;

public class Ex01_equals {
	public static void main(String[] args) {
		// equals()
		// 기본자료형의 데이터들을 동등 비교를 위해서 '=='비교 연산자를 사용한다.
		// 하지만 객체를 동등비교 할 경우, 해당 객체의 값을 비교하는 것이 아니라
		// 객체가 메모리에 있는 위치를 비교하게 된다.
		// 객체의 데이터를 비교할 때는 equals()메서드를 사용한다.

		String str1 = "Hello"; // 암시적 객체 생성
		String str2 = "Hello";
		String str3 = new String("Hello"); // 명시적 객체 생성

		// 암시적 객체생성을 할 때, 먼저 만들어져있는게 있으면 같이 참조를 한다.
		System.out.println("str1 vs str2 : " + (str1 == str2));

//		str1 = "Bye"; //str2와 같은 주소를 참조하니까 str2도 Bye로 바뀌는게 맞지 않을까?
//		System.out.println("str2 : "+ str2); //Hello

		// 불변의 법칙
		// 값이 새로 대립되거나 추가로 들어오게 되면
		// 기존 메모리를 버리고 새로 할달받는다.

		System.out.println("str2 vs str3 : " + (str2 == str3));

		// 각 문자열 변수가 있는 위치의 값을 출력
		System.out.println("str1 hashCode : " + System.identityHashCode(str1));
		System.out.println("str2 hashCode : " + System.identityHashCode(str2));
		System.out.println("str3 hashCode : " + System.identityHashCode(str3));

		// 문자열 데이터 비교
		System.out.println("str1 vs str2 : " + str1.equals(str2));
		System.out.println("str1 vs str3 : " + str1.equals(str3));
	}
}
