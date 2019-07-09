package control.loop;

import java.util.Scanner;

public class SumOfOdds {

	public static void main(String[] args) {
		// 1. 선언
		int num = 1;
		int sum = 0;
		
		// 3. 실행
		
		while(num <= 100)  {
		   if(num %2 == 1 ) {  
			  sum += num;
			 
		   }
		   
			num++;
		}
		
		//4. 출력
		System.out.printf("1부터 100 사이의 홀수의 합은 %d 입니다.", sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
