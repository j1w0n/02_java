package loop;

import java.util.Scanner;

/**
 * 스캐너 사용
 * @author Administrator
 * 
 */

public class FactorialTest {

	public static void main(String[] args) {
		
		// 변수 선언
		Factorial factorial = new Factorial();
		
		// Scanner 생성
		Scanner scan = new Scanner(System.in);
		
		// 출력
		System.out.println("자연수를 입력하세요");
		
		int num = scan.nextInt();
		
		factorial.factorial(num);
	}

}
