package ex06_test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class EX01_Stack {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println(stack);
		//마지막에 넣은 요소 제거
		System.out.println(stack.pop());
		System.out.println(stack);
		
		//인터페이스는 객체를 생성하는 것이 불가능하다.
		Queue<Integer> queue = new LinkedList<Integer>();
		

	}

}
