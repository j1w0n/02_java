package calc.input;

public class DoubleInputValue {

	// 1. 변수선언
	private double x;
	private double y;
	
	// 2. 기본생성자 선언
	public DoubleInputValue() {
		
		
	}
	// 3. 접근자, 수정자 생성
	public double getX() {
		return x;
	}
	
	
	public void setX(double x) {
		this.x = x;
	}
	
	
	public double getY() {
		return y;
	}
	
	
	public void setY(double y) {
		this.y = y;
	}
	
	
	// 4. toString 재정의
	@Override
	public String toString() {
		return "실수값 [x=" + x + ", y=" + y + "]";
	}
	
	

	
}
