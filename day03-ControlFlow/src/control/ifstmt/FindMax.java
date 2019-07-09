package control.ifstmt;

import java.util.Scanner;

public class FindMax {

	public static void main(String[] args) {
		// 1. 선언
		int x;
		int y;
		int max = 0;
		Scanner scan;
		
		// 2. 초기화
		scan = new Scanner(System.in);

		 System.out.println("두 정수를 입력 (space bar 로 분리");  
		 
		 x = scan.nextInt();
		 y = scan.nextInt();
		 
		 // 3. 사용
		 
		
		 if (x > y) {
		     max = x;
		     
		 }
		 
		 if (y > x) {
		     max = y;
		 }
		     
		 if (x == y) {
		     max =x;
		 }  
		 System.out.printf("입력된 두 값 x=%d, y=%d 중 큰 값은 %d%n" , x, y, max);
		 
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
