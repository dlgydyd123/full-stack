package ex01_interface;

import java.util.Scanner;

//다음은 단위를 변환하는 Converter 추상 클래스이다.
public abstract class Converter {
	abstract protected double converter(double src); // 추상메서드

	abstract protected String getScrString(); // 추상메서드

	abstract protected String getDestString(); // 추상메서드

	protected double ratio; // 비율

	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println(getScrString() + "을 " + getDestString() + "로 바꿉니다.");
		System.out.print(getScrString() + "을 입력하세요>> ");
		double val = sc.nextDouble();
		double res = converter(val);
		System.out.println("변환 결과 : " + res + getDestString() + " 입니다.");
	}
}
