package array.basic;

/**
 * 
 * 정수를 원소로 가지는 배열 
 * numbers 를 선언한 후
 * 
 * 1. for (index 사용하는 전통적인 for) 구문을 사용하여
 *    1 ~ 10 까지의 정수를 저장한다
 * 
 * 2. foreach 구문을 사용하여 1에서 저장된 값의 제곱표를 출력한다. 
 * 
 * 
 * @author Administrator
 *
 */
public class SquareTest {

	public static void main(String[] args) {
		
		
		
		// 1. 선언
		int[] numbers  = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// 2. 초기화
		 numbers = new int [10];
		
		// 3. 실행 
		for (int idx = 1; idx <= numbers.length; idx ++) {
			numbers[idx] = idx+1;
			System.out.printf("%d%n" , idx);  //전통적인 for 구문
			
		}
		
		for (int num : numbers) {
			  System.out.printf("%2d x %2d = %3d%n", num, num, num * num);
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
