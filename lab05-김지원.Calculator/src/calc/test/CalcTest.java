package calc.test;

import calc.Calculator;
import calc.input.DoubleInputValue;
import calc.input.IntInputValue;

public class CalcTest {

	public static void main(String[] args) {
		
		// 1. 변수 선언 및 생성자로 초기화
		IntInputValue intinput = new IntInputValue();
		DoubleInputValue doubleinput = new DoubleInputValue();
		
		// 2. (1) 1에서 생성한 정수형 intinput에 x=78, y=22 값 설정
		intinput.setX(78);
		intinput.setY(22);
		System.out.println(intinput);
		
		// 2. (1) 1에서 생성한 정수형 doubleinput에 x=13, y=29 값 설정
		doubleinput.setX(71);
		doubleinput.setY(29);
		System.out.println(doubleinput);

		// 3. Calculator 타입 변수 calc 선언 및 기본생성자로 초기화 
		Calculator calc = new Calculator();
		
		// 4.1 Calculator 클래스의 add 메소드 호출결과 저장
		calc.add(intinput);
		calc.add(doubleinput);
		
		// 4.2 Calculator 클래스의 substract 메소드 호출결과 저장
		calc.substract(intinput);
		calc.substract(doubleinput);
		
		// 4.3 Calculator 클래스의 multiply 메소드 호출결과 저장
		calc.multiply(intinput);
		calc.multiply(doubleinput);
		
		// 4.4 Calculator 클래스의 divide 메소드 호출결과 저장
		calc.divide(intinput);
		calc.divide(doubleinput);
		
		// 4.5 Calculator 클래스의 mod 메소드 호출결과 저장
		calc.mod(intinput);
		calc.mod(doubleinput);
		
		// 5. 출력구문
		System.out.println("정수형 덧셈 한 결과:" + calc.add(intinput));
		System.out.println("실수형 덧셈 한 결과:" + calc.add(doubleinput));
		System.out.println("============================================");
		
		System.out.println("정수형 뺄셈 한 결과:" + calc.substract(intinput));
		System.out.println("실수형 뺄셈 한 결과:" + calc.substract(doubleinput));
		System.out.println("============================================");

		System.out.println("정수형곱셈 한 결과:" + calc.multiply(intinput));
		System.out.println("실수형곱셈 한 결과:" + calc.multiply(doubleinput));
		System.out.println("============================================");

		System.out.println("정수형나눗셈 한 결과:" + calc.divide(intinput));
		System.out.println("실수형나눗셈 한 결과:" + calc.divide(doubleinput));
		System.out.println("============================================");

		System.out.println("정수형나눗셈 한 나머지 결과:" + calc.mod(intinput));		
		System.out.println("실수형나눗셈 한 나머지 결과:" + calc.mod(doubleinput));
	
	}

}
