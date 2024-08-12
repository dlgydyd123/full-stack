package ex03_String;

import java.util.Scanner;

public class Ex05_String {

	public static void main(String[] args) {
		// 문자열 s는 키보드에서 입력받기
		// 문자열 s의 길이가 4또는 6이고, 숫자로만 구성되어있는지
		// 확인하는 코드만들기
		// 예시 "a234"면 False, "1234"면 True

		// 제한사항
		// s는 길이 1이상,8이하의 문자열입니다.
		// s는 영문 알파벳 대소문자 또는 0~9까지의 숫자로 이루어져 있습니다.

		Scanner scan = new Scanner(System.in);
		System.out.print("문자열을 입력해주세요: ");
		String s = scan.next();

		System.out.println(solution(s));

	}

	public static boolean solution(String s) {
//		1번방법
//		if (s.length() == 4 || s.length() == 6) {
//			for (int i = 0; i < s.length(); i++) {
//				if (s.charAt(i) <48 && s.charAt(i) > 57  ) {
//					return false;
//				}
//			}
//			return true;
//		}else {
//			return false;
//		}
//		
//	}
		
//		2번 방법
//		if (s.length() == 4 || s.length() == 6) {
//			try {
//				int n = Integer.parseInt(s);
//				return true;
//			} catch (Exception e) {
//				return false;
//			}
//		}
//		return false;
//	}
		
//		3번 방법
		if (s.length() == 4 || s.length() == 6) {
			return s.matches("(^[0-9])*$");
		}return false;
		
	}
	
}
