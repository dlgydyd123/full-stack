package ex03_method;

public class MidTermMain {

	public static void main(String[] args) {
		int[] studentNum1 = { 95, 85 };
		int[] studentNum2 = { 95, 85 };

		MidTerm mt = new MidTerm();
		int num1 = mt.score(studentNum1);
		int num2 = mt.score(studentNum2);

		if (num1 > num2) {
			System.out.println("첫번째 학생이 " + (num1 - num2) + "점 더 높습니다.");
		} else if (num2 > num1) {
			System.out.println("두번째 학생이 " + (num2 - num1) + "점 더 높습니다.");
		} else {
			System.out.println("두 학생의 점수는 같습니다.");
		}

	}

}
