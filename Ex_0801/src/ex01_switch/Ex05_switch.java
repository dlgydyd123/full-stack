package ex01_switch;

import java.util.Scanner;

public class Ex05_switch {

	public static void main(String[] args) {
		// 10이하의 숫자를 키보드에서 입력받는다.
		// 해당 숫자가 짝수인지 홀수인지 판별하여 출력하는 코드를
		// switch로 작성해 주세요

		Scanner scan = new Scanner(System.in);
		System.out.print("10이하의 숫자를 입력해주세요 : ");
		int num = scan.nextInt();

		switch (num) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
			System.out.println("홀수입니다.");
			break;
		case 2:
		case 4:
		case 6:
		case 8:
		case 10:
			System.out.println("짝수입니다.");
			break;
		default:
			System.out.println("해당되지 않는 숫자입니다.");
		}

		switch (num) {
		case 1, 3, 5, 7, 9 -> System.out.println("홀수입니다.");
		case 2, 4, 6, 8, 10 -> System.out.println("짝수입니다.");
		default -> System.out.println("해당되지 않는 숫자입니다.");
		}

		// 키보드에서 달(month)를 입력받아
		// 해당 달이 몇일까지 있는지 switch문을 이용해 작성해주세요
		// 결과
		// X월은 X일까지 있습니다.

		System.out.println("월 입력 : ");
		int month = scan.nextInt();
		switch (month) {
		case 1, 3, 5, 7, 8, 10, 12 -> System.out.println(month + "월은 31일까지 있습니다.");
		case 4, 6, 9, 11 -> System.out.println(month + "월은 30일까지 있습니다.");
		case 2 -> System.out.println(month + "월은 28일까지 있습니다.");
		default -> System.out.println("잘못된 입력입니다. 1~12사이의 숫자만 입력해주세요.");
		}

		// --------------------------------------------------------------------------
		// 계산기 프로그램 만들기
		// 두 개의 정수를 입력 받는다.
		// 산술연산자도 입력받아서 문자열에 담는다 ex) "+"
		// switch문을 이용하여 정수의 연산을 수행하는 코드 작성하기

		System.out.println("첫번째 정수를 입력해주세요 : ");
		int num1 = scan.nextInt();
		System.out.println("두번째 정수를 입력해주세요 : ");
		int num2 = scan.nextInt();
		System.out.println("산술연산자도 입력해주세요(+,-,*,/,%) : ");
		String oper = scan.next();

		switch (oper) {
		case "+" -> System.out.println(num1 + " " + oper + " " + num2 + " = " + (num1 + num2));
		case "-" -> System.out.println(num1 + " " + oper + " " + num2 + " = " + (num1 - num2));
		case "*" -> System.out.println(num1 + " " + oper + " " + num2 + " = " + (num1 * num2));
		case "/" -> System.out.println(num1 + " " + oper + " " + num2 + " = " + (num1 / (double)num2));
		case "%" -> System.out.println(num1 + " " + oper + " " + num2 + " = " + (num1 % num2));
		default -> System.out.println("+,-,*,/,% 만 입력해주세요 ");
		}
		

	}

}
