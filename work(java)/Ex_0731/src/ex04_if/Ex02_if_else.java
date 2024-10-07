package ex04_if;

import java.util.Scanner;

public class Ex02_if_else {

	public static void main(String[] args) {
		int num = 5;
		if(num > 4) {
			System.out.println(num+"은 4보다 큽니다.");
		}else {
			System.out.println(num+"은 4보다 작습니다.");
		}
		
		//--------------------------------------------
		//두개의 숫자 비교하기
		int a = 10;
		int b = 10;
		if(a > b) {
			System.out.println("a는 b보다 큽니다.");
		}else {
			if(a == b) {
				System.out.println("a는 b와 같습니다.");
			}else {
				System.out.println("a는 b보다 작습니다.");
			}
		}
		
		System.out.println("-----------------------------");
		
		//int형 변수 x가 10보다크고 20보다 작을 때 true인 조건식
		
		//char형변수 ch가 'x' 또는 'X'일때 true인 조건식
		
		//char형변수 ch2가 알파벳(대문자 또는 소문자)일때 true인 조건식

		
		int x =15;
		if(x>10 && x<20) {
			System.out.println("true");
		}
		
		char ch = 'x';
		if(ch == 'x' || ch == 'X') {
			System.out.println("true");
		}
		
		
		char ch2 = 'x';
		if((ch2>=65 && ch2<=90) || (ch2>=97 && ch2<=122)){
			System.out.println("true");	
		}
		
		
		
		
		//삼항연산자로 만들었던 X개의 농구공을 담기위한 박스의 개수 구하기를 조건문으로 만들기
		Scanner scan = new Scanner(System.in);
		System.out.print("농구공 개수를 입력하시오: ");
		int basketball = scan.nextInt();
		int n =5;
		int box =0;
		if(basketball%n==0) {
			box =basketball / n ;
		}else {
			box =basketball / n +1 ;
		}
		
		System.out.println("박스의 개수는 "+box+"개 입니다.");
		
		scan.close();
	}
	

}
