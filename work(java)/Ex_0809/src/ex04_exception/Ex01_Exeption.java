package ex04_exception;

public class Ex01_Exeption {
	public static void main(String[] args) {
		//NullPointerException
		
		//배열변수만 만들고 생성하지 않음
		String[] strArray = null;
		
		//생성하지 않은 배열을 호출하려고 하니 에러발생 
		System.out.println("strArray[0] : " + strArray[0]);
	}
}
