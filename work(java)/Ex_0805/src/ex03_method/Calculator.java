package ex03_method;

public class Calculator {
	int getResult(int num1,int num2, String cal) {
		switch (cal) {
		case "+": 
			return num1+num2;
		case "-": 
			return num1-num2;
		case "*": 
			return num1*num2;
		case "/": 
			return num1/num2;
		case "%": 
			return num1%num2;
		default:
			System.out.println("연산기호가 올바르지 않습니다.");
			return -1;
			
		}
	}
}
