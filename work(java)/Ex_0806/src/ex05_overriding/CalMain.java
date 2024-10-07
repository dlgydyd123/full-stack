package ex05_overriding;

public class CalMain {

	public static void main(String[] args) {
		CalPlus cp = new CalPlus();
		int result1 = cp.getResult(20, 10);
		System.out.println("CalPlus : " + result1);

		CalMinus cm = new CalMinus();
		int result2 = cm.getResult(20, 5);
		System.out.println("CalMinus : " + result2);

	}

}
