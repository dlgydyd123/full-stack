package ex03_method;

public class TimesTable {

	
	public void showTable(int num) {
		int result=0;
		System.out.println(num+" 단");
		for(int i =1; i<=9;i++ ) {
			result = num*i;
			System.out.printf("%d * %d = %d\n",num,i,result);
		}
	}
}
