package ex03_method;

public class Ex01_method {
	public static void main(String[] args) {
		//메서드의 호출은 반드시 메서드 안에서 해야한다.
		printHello();
	}
	//메서드는 반드시 메서드 밖에서 정의해야한다.
	static void printHello() {
		System.out.println("안녕하세요.");
		System.out.println("반갑습니다.");
	}
}
