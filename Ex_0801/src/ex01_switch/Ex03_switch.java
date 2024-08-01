package ex01_switch;

public class Ex03_switch {

	public static void main(String[] args) {
		int num = 1;
		// 1. 비교값과 조건값의 타입은 일치해야 한다.
		// 2. 중복되는 값은 가질 수 없다.
		switch (num) {
		case 1:
			System.out.println("num은 1입니다.");
		case 7:
			System.out.println("num은 7입니다.");
		default:
			System.out.println("num은 1도 7도 아닙니다.");
		}

	}

}
