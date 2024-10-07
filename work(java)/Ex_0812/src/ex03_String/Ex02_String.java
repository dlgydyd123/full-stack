package ex03_String;

import java.util.Scanner;

public class Ex02_String {

	public static void main(String[] args) {
		// 키보드에서 숫자와 특수문자를 제외한 알파벳을 무작위로 입력받는다.
		// 입력답은 문자열에 소문자 a가 몆개 있는지 판별하는 코드 작성하기
		// 결과
		// 입력: asdfasdf
		// a의 개수 2개

		Scanner scan = new Scanner(System.in);
		System.out.print("키보드에서 숫자와 특수문자를 제외한 알파벳을 무작위로 입력 :");
		String str = scan.next();
		int count = 0;
		for(int i =0; i<str.length(); i++) {
			if (str.charAt(i) == 'a') {
				count++;
			}
		}
			
		
		System.out.println("a의 개수 : " + count);

	}

}
