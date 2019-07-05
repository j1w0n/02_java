package operator.binary;

import java.util.Scanner;

/**
 * 
 * @author Administrator
 *
 */
public class ScoreInput {

	public static void main(String[] args) {
		// 1. 선언
		// 입력값 저장할 변수 선언
	      int score;
	      
	      // 입력처리를 위한 스캐너 선언
		Scanner scan; // import : ctrl + shift + o 단축키로 입력
		
		// 2. 초기화
		// 스캐너 초기화
		scan = new Scanner(System.in);
		System.out.println("점수를 입력:");
		
		// 변수에 스캐너로 값을 입력하여 초기화
		score = scan.nextInt();
		
		// 3. 입력된 값의 범위를 판단
		// 0 <= score <= 100
		/*
		 * WHERE score >= 0
		 *   AND score <= 100
		 * */
		if (score >= 0 && score <= 100)
			System.out.printf("%d 은(는) 유효한 점수입니다. %n" , score);
		    System.out.printf("%d 은(는) 범위를 벗어난 점수입니다. %n" , score);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
