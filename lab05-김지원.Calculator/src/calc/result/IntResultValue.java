package calc.result;

public class IntResultValue {

	// 1. 변수 선언
	private int result;

	// 2. 기본 생성자 선언
	public IntResultValue() {
		
	}
	
	// 3. 접근자, 수정자 생성
	public int getResult() {
		return result;
	}
	
	public void setResult(int result) {
		this.result = result;
	}

	
	// 4. toString 재정의
	@Override
	public String toString() {
		return "정수값 [result=" + result + "]";
	}
	
}
