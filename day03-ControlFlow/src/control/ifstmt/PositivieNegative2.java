package control.ifstmt;

/**
하나의 정수를 입력받아서
 * 음수인지, 양수인지, 0인지 판단하는 클래스
 * 
 * 입력받을 변수 input 을 선언하여 Scanner 로 입력받고
 * if ~ else 구문으로 부호를 판별한 후
 * 판별 결과를 저장하는 변수 String result 에 저장하여
 * 
 * "입력값 100 은(는) 양수 입니다." 
 * "입력값 -1 은(는) 음수 입니다." 
 * "입력값 0 은(는) 0입니다.
 * 
 * 라는 문장을 출력하시오.
 */
import java.util.Scanner;


public class PositivieNegative2 {

	public static void main(String[] args) {
		
		
		
		
		
		         // 1. 선언
				int input;
				String result;
				Scanner scan;// import 
				
				// 2. 초기화
				scan = new Scanner(System.in);
				System.out.println("정수를 입력하세요.(단, 0제외)");
				input = scan.nextInt();
				
				// 3. 사용
				if (input > 0) {
					result = "양수";
				} else if (input < 0){
					result = "음수";
				} else {
					result = "0";
				}
				
				System.out.printf("입력 값 %d 은(는) %s 입니다.%n", input, result);
				System.out.println("입력 값 " + input + " 은(는)\n " + result + " 입니다.");
				
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		

	}

}
