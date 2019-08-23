package loop;

/**
 * 3! 과 같은 수학의 factorial 을 계산하는 클래스
 * @author Administrator
 *
 */
public class Factorial {

	// +factorial(int n) : int

	//메소드 작성
	public int factorial(int input) {
		// 리턴값 선언
		int result = 1;
		
		// for문 생성
		for (int idx = input; idx > 0; idx--) {
		  
		    // result == result * idx 
			result *= idx; 
		  
	    }
		
		System.out.println(result);
		
		return result;
	}
	
	
}
