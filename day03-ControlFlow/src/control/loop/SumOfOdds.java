package control.loop;

import java.util.Scanner;

public class SumOfOdds {

	public static void main(String[] args) {
		// 1. 선언
		int num = 1;
		int sum = 0;
		Scanner scan;
		
		// 2.  초기화
		
		scan = new Scanner(System.in);
		
		num = scan.nextInt();
		sum = scan.nextInt();
		
		// 3. 실행
		
		while(num <= 100)  {
			sum += num;
			num += 2;
		}
		
		//4. 출력
		System.out.printf("1부터 100 사이 홀수의 합은 %d입니다. %n" ,sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
