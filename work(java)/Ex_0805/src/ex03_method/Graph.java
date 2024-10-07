package ex03_method;

import java.util.Random;

public class Graph {

	public static void main(String[] args) {
		int[] arr = new int[100];
		Random rnd = new Random();
		PrintGraph pg = new PrintGraph();
		
		for(int i =0; i<arr.length;i++) {
			int num = rnd.nextInt(10);
			arr[i] = num; 
		}
		
		
		pg.draw(arr);

	}

}
