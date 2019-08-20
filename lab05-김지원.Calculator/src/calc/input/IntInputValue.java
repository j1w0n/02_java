package calc.input;

public class IntInputValue {

	// 1. 변수 선언
	private int x;
	private int y;
	
	// 2. 기본생성자 선언
	public IntInputValue() {
		
	}

	// 3. 접근자, 수정자 생성
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	// 4. toString 재정의
	@Override
	public String toString() {
		return "정수값 [x=" + x + ", y=" + y + "]";
	}
	
	
	
	
}
