package ex03_method;

public class MidTerm {
	// 학생들의 점수가 2개 들어있는 배열을 전달 받아
	// 총합을 구하여 반환하는 score메서드 만들기

	int score(int[] num) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		return sum;
	}

	// MidTermMain에서 두 학생의 성적을 비교하여
	// 누가 더 높은지 출력하기

}
