package ex02_list;

import java.util.ArrayList;
import java.util.List;

public class Ex06_ArrayList {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("홍길동");
		p1.setAge(20);
		
		Person p2 = new Person();
		p2.setName("김자바"); 
		p2.setAge(30);
		
		List<Person> list = new ArrayList<>();
		
		//객체를 리스트에 저장
		list.add(p1);
		list.add(p2);
		
		System.out.println(list.get(0).getName());
		System.out.println(list.get(0).getAge());
		System.out.println(list.get(1).getName());
		System.out.println(list.get(1).getAge());
	}
}
