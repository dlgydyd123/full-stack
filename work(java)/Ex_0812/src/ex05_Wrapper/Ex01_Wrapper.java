package ex05_Wrapper;

public class Ex01_Wrapper {
	public static void main(String[] args) {
		//정수형타입 선언
		//생성자를 통한 선언은 JDK 1.9부터 사용하지 않는 것을 권장
		Integer num01 = new Integer(10);
		Integer num02 = Integer.valueOf(10);
		
		//실수형타입 선언
		Double doubleNum01 = Double.valueOf(30.11);
		
		//문자형타입 선언
		Character ch = Character.valueOf('A');
		
		System.out.println("정수형1 : " + num01);
		System.out.println("정수형2 : " + num02);
		System.out.println("실수형 : " + doubleNum01);
		System.out.println("문자형 : " + ch); 
	}
}
