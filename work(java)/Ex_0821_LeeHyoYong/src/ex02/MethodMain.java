package ex02;

import java.util.Scanner;

public class MethodMain {

	public static void main(String[] args) {

		MethodTest mt = new MethodTest();
		int[] arr = { 4, 1, 2, 10, 7, 9, 5, 6, 3, 8 };
		mt.maxFider(arr);

		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요(1,2) : ");
		int num = scan.nextInt();
		switch (num) {
		case 1:
			mt.fToc();
			break;
		case 2:
			mt.cTof();
			break;
		default:
			System.out.println("해당되는 숫자가 아닙니다.");
			break;
		}
	}

}
