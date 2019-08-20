package calc;

import calc.input.DoubleInputValue;
import calc.input.IntInputValue;
import calc.result.DoubleResultValue;
import calc.result.IntResultValue;

/**
 * 5. 패키지 : calc
 *  IntInputValue, DoubleInputValue 를 각각 
 *  입력받아 각 클래스 인스턴스의 멤버변수 값을 사용하여 
 *  사칙연산과 나머지 연산을 수행하는 
 *  add, sub, mult, div, mod(나머지 연산) 메소드가 중복정의된 
 *  클래스 Calculator 를 작성
 *
 * 6. Calculator 클래스 메소드들의 리턴타입은 
 *  IntInputValue 를 받는 경우는 IntResultValue 로 
 *  DoubleInputValue 를 받는 경우는 DoubleResultValue 타입으로 작성
 * 
 * @author Administrator
 *
 */

public class Calculator {
	
	/**
	 * 메소드명 : add
	 *  
	 * @param intinput : IntInputValue 타입 변수
	 * @return intinput의 x, y 필드의 합
	 *         : IntInputValue 를 받는 경우는 IntResultValue 타입으로 작성
	 *  
	 */
	
	public IntResultValue add(IntInputValue intInput) { //메소드 헤드
		IntResultValue intResult = new IntResultValue(); // IntResultValue 선언 후 초기화
		intResult.setResult(intInput.getX() + intInput.getY()); // result 호출
		return intResult;
	
		
	}
	
	/**
	 * 메소드명 : sub
	 *  
	 * @param intinput : IntInputValue 타입 변수
	 * @return intinput의 x, y 필드의 차
	 *         : IntInputValue 를 받는 경우는 IntResultValue 타입으로 작성
	 *  
	 */
	public IntResultValue sub(IntInputValue intinput) {
		IntResultValue intresult = new IntResultValue(); 
		intresult.setResult(intinput.getX() - intinput.getY()); 
		return intresult;
	
	}
	
	/**
	 * 메소드명 : mult
	 *  
	 * @param intinput : IntInputValue 타입 변수
	 * @return intinput의 x, y 필드의 곱
	 *         : IntInputValue 를 받는 경우는 IntResultValue 타입으로 작성 
	 *  
	 */
	public IntResultValue mult(IntInputValue intinput) {
		IntResultValue intresult = new IntResultValue(); 
		intresult.setResult(intinput.getX() * intinput.getY()); 
		return intresult;
	}
	
	/**
	 * 메소드명 : div
	 *  
	 * @param intinput : IntInputValue 타입 변수
	 * @return intinput의 x, y 필드의 나눗셈
	 *         : IntInputValue 를 받는 경우는 IntResultValue 타입으로 작성
	 *  
	 */
	public IntResultValue div(IntInputValue intinput) {
		IntResultValue intresult = new IntResultValue(); 
		intresult.setResult(intinput.getX() / intinput.getY()); 
		return intresult;
	}
	
	/**
	 * 메소드명 : mod
	 *  
	 * @param intinput : IntInputValue 타입 변수
	 * @return intinput의 x, y 나눈 값의 나머지
	 *         : IntInputValue 를 받는 경우는 IntResultValue 타입으로 작성
	 *  
	 */
	public IntResultValue mod(IntInputValue intinput) {
		IntResultValue intresult = new IntResultValue(); 
		intresult.setResult(intinput.getX() % intinput.getY()); 
		return intresult;
	}
	
	// ===========================================================================
	
	
	/**
	 * 메소드명 : add
	 *  
	 * @param doubleinput : DoubleInputValue 타입 변수
	 * @return doubleinput의 x, y 필드의 덧셈
	 * 		   DoubleInputValue 를 받는 경우는 DoubleResultValue 타입으로 작성
	 *  
	 */
	public DoubleResultValue add(DoubleInputValue doubleinput) {
		DoubleResultValue doubleresult = new DoubleResultValue();
		doubleresult.setResult(doubleinput.getX() + doubleinput.getY());
		return doubleresult;
	}
	
	/**
	 * 메소드명 : sub
	 *  
	 * @param doubleinput : DoubleInputValue 타입 변수
	 * @return doubleinput의 x, y 필드의 뺄셈
	 * 		   DoubleInputValue 를 받는 경우는 DoubleResultValue 타입으로 작성
	 *  
	 */
	 public DoubleResultValue sub(DoubleInputValue doubleinput) {
		DoubleResultValue doubleresult = new DoubleResultValue();
		doubleresult.setResult(doubleinput.getX() - doubleinput.getY());
		return doubleresult;
	}
	
	
	/**
	 * 메소드명 : mult
	 * 
	 * @param doubleinput : DoubleInputValue 타입 변수
	 * @return  doubleinput의 x, y 필드의 곱셈 
	 *         DoubleInputValue 를 받는 경우는 DoubleResultValue 타입으로 작성
	 *  
	 */
	public DoubleResultValue mult(DoubleInputValue doubleinput) {
		DoubleResultValue doubleresult = new DoubleResultValue();
		doubleresult.setResult(doubleinput.getX() * doubleinput.getY());
		return doubleresult;
	}
	
	
	/**
	 * 메소드명 : div
	 *  
	 * @param doubleinput : DoubleInputValue 타입 변수
	 * @return  doubleinput의 x, y 필드의 나눗셈
	 * 			: DoubleInputValue 를 받는 경우는 DoubleResultValue 타입으로 작성
	 *  
	 */
	public DoubleResultValue div(DoubleInputValue doubleinput) {
		DoubleResultValue doubleresult = new DoubleResultValue();
		doubleresult.setResult(doubleinput.getX() / doubleinput.getY());
		return doubleresult;
	}
	
	/**
	 * 메소드명 : mod
	 *  
	 * @param doubleinput : DoubleInputValue 타입 변수
	 * @return doubleinput의 x, y 나눈 값의 나머지
	 *         : DoubleInputValue 를 받는 경우는 DoubleResultValue 타입으로 작성
	 *  
	 */
	public DoubleResultValue mod(DoubleInputValue doubleinput) {
		DoubleResultValue doubleresult = new DoubleResultValue();
		doubleresult.setResult(doubleinput.getX() % doubleinput.getY());
		return doubleresult;
	}
	
}
