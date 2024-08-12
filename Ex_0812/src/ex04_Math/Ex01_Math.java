package ex04_Math;

public class Ex01_Math {
	public static void main(String[] args) {
		// 올림
		System.out.println("3.51올림  : " + Math.ceil(3.51));

		// 내림
		System.out.println("13.61내림  : " + Math.floor(13.61));

		// 반올림
		System.out.println("12.8반올림  : " + Math.round(12.8));

		// 최대값구하기
		int maxValue = Math.max(30, 60);

		int minValue = Math.min(40, 70);

		System.out.println("30, 60 최대값 : " + maxValue);
		System.out.println("40, 70 최소값 : " + minValue);
		
		//소수점 둘째자리 이하에서 반올림하고 싶을 때
		
		double pie = 3.14159265358979;
		
		System.out.println(Math.round(pie*100)/100.0);
		System.out.println(Math.round(pie*1000)/1000.0);
	}
}
