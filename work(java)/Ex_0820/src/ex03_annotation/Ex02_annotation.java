package ex03_annotation;

import java.lang.annotation.Annotation;

@TestInfo(value = "테스트정보")
// value=을 통해 TestInfo의 value()메서드에 정보가 저장된다.
public class Ex02_annotation {
	public static void main(String[] args) {
		Annotation[] annos = Ex02_annotation.class.getAnnotations();
		for (Annotation anno : annos) {
			System.out.println(anno);
		}
		//.class : 클래스 리터럴
		//그 클래스자체에 대한 정보를 얻을 수 있다.
		//클래스의 이름이 뭐냐
		//메서드는 뭐가 있냐
		//적용된 어노테이션은 뭐가 있냐
		TestInfo testInfo = (TestInfo) Ex02_annotation.class.getAnnotation(TestInfo.class);
		System.out.println(testInfo.value());
	}
}
