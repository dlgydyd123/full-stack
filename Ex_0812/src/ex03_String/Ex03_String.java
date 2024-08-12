package ex03_String;

import java.util.Scanner;

public class Ex03_String {
	public static void main(String[] args) {
		// 회문 판별하기
		// 회문이란 앞으로 읽어도 뒤로 읽어도 똑같이 읽히는 문장
		// 기러기,토마스,스위스,별똥별
		// 키보드에서 문자을 입력받고 해당 문장이 회문이면
		// XXX는 회문입니다. 아니면 XXX는 회문이 아닙니다 라고 출력하기

		Scanner scan = new Scanner(System.in);
		System.out.print("회문을 입력해주세요(ex)기러기) : ");
		String str = scan.next();
		String rev ="";
		for (int i = str.length(); i >0; i--) {
			rev += str.charAt(i-1);	
		}
		if(str.equals(rev)) {
			System.out.println(str +"는(은) 회문입니다.");
		}else {
			System.out.println(str +"는(은) 회문이 아닙니다.");
		}

	}
}
