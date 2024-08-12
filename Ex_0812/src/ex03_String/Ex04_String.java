package ex03_String;

import java.util.Scanner;

public class Ex04_String {

	public static void main(String[] args) {
		// (-포함)주민번호를 키보드에 입력받는다.
		// 예시)911223-1234567
		// 당신은 1991년 12월 23에 태어난 남자입니다.
		// 형식을 잘못입력했을 때는 "주민번호를 올바르게 입력하세요"라고 출력
		Scanner scan = new Scanner(System.in);
		System.out.print("주민번호를 입력해 주세요(-포함) : ");
		String numberId = scan.next();

		String[] number = numberId.split("-");
		int year = 0;
		if (number[0].length() != 6 && number[1].length() != 7) {
			System.out.println("주민번호를 올바르게 입력하세요");
		} else {
			if(Integer.parseInt(number[0].substring(0, 2)) <= 24) {
				year = 20;
				if (number[1].charAt(0) == '1' || number[1].charAt(0) == '3') {
					System.out.println("당신은"+ year + number[0].substring(0, 2) + "년 " 
							+ number[0].substring(2, 4) + "월 "
							+ number[0].substring(4, 6) + "일에 태어난 남자입니다.");
				} else if(number[1].charAt(0) == '2' || number[1].charAt(0) == '4'){
					System.out.println("당신은"+ year  + number[0].substring(0, 2) + "년 " 
							+ number[0].substring(2, 4) + "월 "
							+ number[0].substring(4, 6) + "일에 태어난 여자입니다.");
				}else {
					System.out.println("외국인 입니다.");
				}
			}else {
				year = 19;
				if (number[1].charAt(0) == '1' || number[1].charAt(0) == '3') {
					System.out.println("당신은"+ year + number[0].substring(0, 2) + "년 " 
							+ number[0].substring(2, 4) + "월 "
							+ number[0].substring(4, 6) + "일에 태어난 남자입니다.");
				} else if(number[1].charAt(0) == '2' || number[1].charAt(0) == '4'){
					System.out.println("당신은"+ year  + number[0].substring(0, 2) + "년 " 
							+ number[0].substring(2, 4) + "월 "
							+ number[0].substring(4, 6) + "일에 태어난 여자입니다.");
				}else {
					System.out.println("외국인 입니다.");
				}
			}
			
			

		}

	}

}
