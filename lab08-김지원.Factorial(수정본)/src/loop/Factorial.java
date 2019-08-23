package loop;

/**
 * 3! 과 같은 수학의 factorial 을 계산하는 클래스
 * @author Administrator
 *
 */
public class Factorial {

	// +factorial(int n) : int

	// 메소드 작성
	public int factorial(int input) {
		// int 타입의 result 라는 변수를 1로 초기화
		int result =1;
		
		for (int idx = input; idx > 0; --idx) {
			// 팩토리얼의 식 result = result * idx
			result *= idx;
		}
		System.out.println(result);
		
		return result;
	}
	
}
