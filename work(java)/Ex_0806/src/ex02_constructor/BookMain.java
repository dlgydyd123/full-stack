package ex02_constructor;

public class BookMain {

	public static void main(String[] args) {
		Book b1 = new Book();
		b1.bookInfo();
		
		Book b2 = new Book("멘토시리즈 자바");
		b2.bookInfo();
		
		Book b3 = new Book("신데렐라",170);
		b3.bookInfo();
		
		Book b4 = new Book(5,"노인과 바다");
		b4.bookInfo();
		
		

	}

}
