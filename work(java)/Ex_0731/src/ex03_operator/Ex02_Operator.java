package ex03_operator;

public class Ex02_Operator {

	public static void main(String[] args) {
		//증감연산자
		//1씩 증가시키거나 1씩 감소시키는 연산자
		//++, --
		
		//선행증감
		int a =10;
		System.out.println("a : "+ ++a);
		
		//후행증감
		int b = 10;
		System.out.println("b : "+ b++);
		System.out.println("b : "+ b);
		
		char alphabetA ='A';
		System.out.println(alphabetA++);
		System.out.println(alphabetA);
		
		byte value = 127;
		value++;
		//정수타입 연산에서 오버플로우가 발생하면 최소값으로 돌아간다.
		System.out.println(value);
		
		byte value2 = -128;
		value2--;
		//정수타입 연산에서 언더플로우가 발생하면 최대값으로 돌아간다.
		System.out.println(value2);
		
		//-----------------------------------------------
		int x =5;
		int y = x++;
		System.out.println("x의 값 : "+x); //6
		System.out.println("y의 값 : "+y); //5
		
		x = 10;
		y = 20;
		int z = (++x) +(y--); // x=11 y=19 z=31
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		
		//----------------------------------------
		//논리부정연산자
		//boolean 값을 가지는 피연산자 앞에 !를 붙여서 값을 반대로
		//바꾸는 역할을 한다
		//true를 false로, false를 true로 바꿔준다.
		
		boolean isHuman = false;
		System.out.println(isHuman); //false
		System.out.println(!isHuman); //true
		
		//주의할 점은 논리부정연산자를 사용하더라도, 사용한 곳에서만
		//적용이 될 뿐 원래 변수에 들어있는 값은 바뀌지 않는다.
		
		
		
	}

}
