package calc.result;

public class DoubleResultValue {

	// 1. 변수 선언
	private double result;
	private double x;
	private double y;
	// 2. 기본생성자 선언
	public DoubleResultValue() {
		
	}

	// 3. 접근자, 수정자 생성	
	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	
	// 4. toString 재정의
	@Override
	public String toString() {
		return "실수값 [x=" + x + ", y=" + y + "]";
	}
	
	
}
