package ex03_anonymous_class;

interface buttonClickListener {
	// 기능은 메서드에다 만듦
	public void click();
}

public class AnonymousExample {
	public class Button {
		private buttonClickListener listener;

		public void setButtonListener(buttonClickListener listener) {
			this.listener = listener;
		}

		public void click() {
			if (listener != null) {
				this.listener.click();
			}
		}
	}

	public static void main(String[] args) {
		AnonymousExample exam = new AnonymousExample();
		AnonymousExample.Button button = exam.new Button(); // 버튼

		// 인터페이스 객체는 직접 만들 수 없다.
		// 인터페이스를 구현한 클래스를 통해 객체를 만들 수 있다.
		button.setButtonListener(new buttonClickListener() {
									// buttonClickListener인터페이스로부터 만들어진 익명클래스
			@Override
			public void click() {
				System.out.println("버튼을 눌렀습니다.");

			}

		});
		
		button.click();
	}//인터페이스 + 다형성 + 오버라이드 

}
