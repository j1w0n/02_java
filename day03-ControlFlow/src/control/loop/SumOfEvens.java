package control.loop;

import java.util.Scanner;

public class SumOfEvens {

	public static void main(String[] args) {
		
		// 1. 선언
		int num = 0;
		int sum = 0;

		while(num <= 100)  {
			sum += num;
			num += 2;
		}
		
		//4. 출력
		System.out.printf("1부터 100 사이 짝수의 합은 %d입니다. " ,sum);
		
		

	}

}
