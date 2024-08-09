package ex05_try_catch;
//키보드에서 정수를 입력받도록하고, 정수 이외의 값이 입력되었다면

//"정수만 입력 가능"이라는 메세지 출력

import java.util.Scanner;

//결과
//정수 : 100
//입력받은 수 : 100

//정수 : aaa
//정수만 입력 가능
public class Ex03_try_catch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String num = "";
		try {
			while (true) {
				System.out.print("정수 : ");
				num = sc.next();
				int n = Integer.parseInt(num);
				System.out.println("결과 : " + n);
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println("결과 : " + num + "은(는) 정수가 아닙니다.");
		}

	}

}
