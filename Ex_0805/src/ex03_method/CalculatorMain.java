package ex03_method;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculator calcul = new Calculator();
		
		System.out.print("첫번째 정수를 입력해 주세요 : ");
		int num1 = scan.nextInt();
		System.out.print("두번째 정수를 입력해 주세요 : ");
		int num2 = scan.nextInt();
		System.out.print("산술연산자를 입력하시오(+,-,*,/,%) : ");
		String cal = scan.next();
		
		int result = calcul.getResult(num1, num2, cal);
		System.out.println("결과값은 "+result+"입니다.");
		
	}

}
