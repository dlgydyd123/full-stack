package ex03_method;

public class MethodMain {

	public static void main(String[] args) {
		int[] arr = {50,70,200,54,95,152};
		MethodTest mt = new MethodTest();
		
		int result = mt.maxFinder(arr);
		
		System.out.println("가장 큰 수는 "+ result+"입니다.");

	}

}
