package sequence;

/**
 * 등차수열의 합을 구하는 class
 * @author Administrator
 *
 */
public class ArithProgression {
	
	 /**
	 * 
	 * 등차 수열의 일반항은
	 * start + diff * (index - 1) 로 구한다.
	 * 
	 * @param start, diff, index
	 * @return int
	 * 
	 */
	public int sequence(int start, int diff, int index) {
		int result = 0;
		
		for (int idx = 1; idx <= index; idx++) {
		
			result += start + diff * (idx - 1);
			
		}		
		
		return result;
	}	
	
}
