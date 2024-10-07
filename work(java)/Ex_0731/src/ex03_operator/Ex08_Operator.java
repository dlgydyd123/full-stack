package ex03_operator;

import java.util.Scanner;

public class Ex08_Operator {

	public static void main(String[] args) {
		//과수원에서 배,사과,오렌지를 하루에 각각 5,7,5개씩 생산한다.
		//1. 과수원에서 하루에 생산되는 과일의 총 개수를 구하기
		//2. 시간당 총 생산량 구하기
		
		int pear = 5, apple = 7, orange = 5;
		
		int oneDay = pear+apple+orange;
		double timeTotal = (double)oneDay/24;
		
		System.out.printf("과수원에서 하루에 생산되는 과일 총 개수 : %d\n", oneDay);
		System.out.printf("시간당 총 생산량 : %f\n", timeTotal);
		
		//----------------------------------------------------
		
		//상자 하나에는 농구공이 5개가 들어갈 수 있다.
		//만일 농구공이 23개라면 몇개의 상자가 필요한가?

		int basketball = 23;
		int n = 5;
		int box = basketball % n == 0 ? basketball / n: basketball / n + 1;
		System.out.printf("필요한 상자 개수는 %d개 입니다\n" , box);
		
		//-----------------------------------------------------
		//국어,영어,수학에 대한 점수를 키보드를 이용해 정수로 입력받고
		//1.세 과목에 대한 합계 출력
		//2.평균 출력하기
		
		//세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
		//세 과목의 점수가 각가 40점 이상이면서 평균이 60점이상일 때 합격 아니면 불합격
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("국어점수를 입력해주세요: ");
		int korea = scan.nextInt();
		System.out.print("영어점수를 입력해주세요: ");
		int english = scan.nextInt();
		System.out.print("수학점수를 입력해주세요: ");
		int math = scan.nextInt();
		
		int sum = korea+english+math;
		System.out.printf("세 과목 총합은 %d 입니다.\n",sum);
		double avg = sum/3.0;
		System.out.printf("세 과목 평균은 %.1f 입니다.\n",avg);
		
		String result = korea >=40 && english>=40 && math>=40  && avg >=60? "합격" : "불합격";
		System.out.printf("시험 결과는 %s 입니다\n",result);

	}

}
