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
		
		// Scanner 선언 및 출력
		Scanner scan = new Scanner(System.in);
		
		System.out.println("자연수의 값을 입력하시오");
		
		int num = scan.nextInt();
		factorial.factorial(num);
//		System.out.println(factorial.factorial(num));
		
	}

}
