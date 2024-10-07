package ex04_if;

public class Ex05_multi_if {

	public static void main(String[] args) {
		//if문의 중첩
		//제어문은 자유롭게 중첩해서 사용할 수 있다.
		
		//10보다 작으면서 홀수인 수
		int num = 5;
		if(num<=10) {
			if(num %2 == 1) {
				System.out.println(num+"은 홀수입니다.");
			}
		}

	}

}
