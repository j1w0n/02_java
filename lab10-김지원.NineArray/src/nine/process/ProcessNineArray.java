package nine.process;

/**
 *  재귀호출을 사용하여
 *  구구단을 출력하는 클래스
 *  
 * @author Administrator
 *
 */
public class ProcessNineArray {

	/**
	 * 입력 : 1 3 3 3 3 3 5 - 7 9
	 * 출력 : 1, 3, 5, 6, 7, 9 에 대한 구구단 출력
 	 * 출력형식 선택 : 가로, 세로, 대각선
	 * 풀이에 재귀호출 사용
	 * 
	 * @param input
	 */
	 public void processInputs(String input, int num) {
	
		}
		
	    

	 
	 
	 
	 
} // end

// 단을 결정하는 반복구문 (세로출력)
//		for (int stage = 2; stage <= 9; stage++) {
//			// 단의 제목 출력
//			System.out.printf("%n<%d 단>%n", stage );
//			// 곱해지는 수를 결정하는 반복구문
//			for (int times = 1; times <= 9; times++) {
//				System.out.printf("%d x %d = %2d%n", stage, times, (stage * times));
//			}
//		}
//		
//		System.out.println("==========================================");
//	
//		// 단을 결정하는 반복구문 (가로출력)
//		for (int stage = 2; stage <= 9; stage++) {
//			for(int times = 1; times <= 9; times++) {
//				System.out.printf("%d x %d = %d\t", stage, times, stage*times);
//			}
//			System.out.println();
//		}
//		