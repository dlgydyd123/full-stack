package ex07_test;

public class CalcMain {

	public static void main(String[] args) {
		Calculator calc = new GoodCalc();

		int[] arr = new int[100];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}

		System.out.println("두수의 합 :" + calc.add(10, 20));
		System.out.println("두수의 셈 :" + calc.substract(20, 5));
		System.out.println("배열의 평균 :" + calc.average(arr));
	}

}
