package ex03_method;

//import java.util.Arrays;

public class MethodTest {
	//배열의 최대값을 찾아 출력하는 maxFinder메서드 작성하기
	//배열은 매개변수로 전달 받는다.
	
	int max =0;
	int maxFinder(int[] arr) {
		for(int i = 0; i<arr.length ; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		return max;
//		Arrays.sort(arr);
//		System.out.println("최대값 : " + arr[arr.length]);
	}
}
