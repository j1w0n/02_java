package control.swtchstmt;

import java.util.Scanner;

/**
 * 입력된 점수에 대한 학점을 계산
 * switch 구문을 사용
 * ------------------------------------
 * A : 90점 이상
 * B : 80 ~ 89 점 사이
 * C : 60 ~ 79 점 사이
 * D : 40 ~ 59 점 사이
 * F : 이하 나머지
 * ------------------------------------
 * printf 로 출력
 *
 * @author Administrator
 *
 */
public class ReportGrade {

	public static void main(String[] args) {
		// 1. 선언
		int score;
		int grade;
		Scanner scan;
		
		// 2. 초기화
		
		scan = new Scanner(System.in);
		System.out.println("0 ~ 100 사이의 정수를 입력");
		score = scan.nextInt();
		
		// 3. 사용
		
		switch (score/10) {
		case 10 : case 9 :
			   grade = 'A';
			   break;
		case 8 :
			   grade = 'B';
			   break;
		case 7 : case 6 :
			grade = 'C';
			break;
		case 5 : case 4 :
			grade ='D';
			
		default :
			grade ='F';
			
			
		}
		
		// 4. 출력 
		System.out.printf("점수, 학점, %d, %d%n", score, grade );
		
		
		
		
		
		
		
		
		

	}

}
