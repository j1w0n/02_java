package api.wrapper;

import static java.lang.Integer.*;
import static java.lang.Double.*;
 
public class IntDoubleWrapper {

	public static void main(String[] args) {
	
		// 1. 사용할 문자열 변수 선언, 초기화
		String intInput = "100";
		String dbInput = "200";

		// 2. String ------> 기본형
		// (1) parseType() : 각 포장클래스의 static 메소드 사용
		String intFrm = String.format("문자열[%s] ==> 기본형[%d]", intInput,Integer.parseInt(intInput));
		
		String dbFrm = String.format("문자열[%s] ==> 기본형[%d]", dbInput,Double.parseDouble(dbInput));
		
		// (2) 변경된 값들 출력
		System.out.println(intFrm);
		System.out.println(dbFrm);
		
		
        intFrm = String.format("문자열[%s] ==> 기본형[%d]", intInput,Integer.parseInt(intInput));
		
	    dbFrm = String.format("문자열[%s] ==> 기본형[%d]", dbInput,Double.parseDouble(dbInput));
	   // ==============================================================================================================
	    
	   // (3) typeValue() 메소드 사용 : non-static 메소드
	   //                               인스턴트 생성 후 사용
	    
        intFrm = String.format("문자열[%s] ==> 기본형[%d]", intInput, new Integer(intInput).intValue());
		
	    dbFrm = String.format("문자열[%s] ==> 기본형[%d]", dbInput, new Double(dbInput).doubleValue());
	   
	    System.out.println(intFrm);
		System.out.println(dbFrm);
	   
		// ====================================================================================================================
		// 기본형 -------> String
		
		int ten = 10;
		double sixty = 60.0;
		
		String tenStr = new Integer(ten).toString();
		String sixtyStr = new Double(sixty).toString();
		
		// String 변경 확인을 위하여 String 의 + 연산 시도
		tenStr += "입니다";
		sixtyStr += "입니다";
		
		// 문자열 접합 연산 결과 String 변수 출력
		System.out.println(tenStr);
		System.out.println(sixtyStr);
		
		//============================================================================================
		// 4. 기본형 <-----------> 참조형
		Integer objTen = new Integer(ten);
		Double objSixty = new Double(sixty);
		
		String tenFrm = String.format("%d 의 참조형 데이터 : %s", ten, objTen.toString());
		String sixtyFrm = String.format("%f 의 참조형 데이터 : %s", sixty, objSixty.toString());
		
		System.out.println(tenStr);
		System.out.println(sixtyStr);
		
		System.out.println(ten + "의 참조형 데이터:" + objTen);
		System.out.println(sixty + "의 참조형 데이터:" + objSixty);
		
		// =================================================================================
		// 5. 포장클래스의 autoUnboxing, autoBoxing
		// autoUnboxing : 참조형 인스턴스가 기본형 변수에 변환메소드 호출없이 바로 담기는 기법
		// autoBoxing : 기본형 데이터가 참조형 변수에 바로 new 없이 담기는 기법
        
		// (1) autoBoxing 적용 전 : 
		Integer objOne = new Integer(1);
		int one = 1;
		
		// (2) autoBoxing 적용 후
		Integer objFive = 5;
		
		// (3) autoUnboxing 적용 전 : 명시적으로 typeValue() 메소드 호출
		int three = new Integer(3).intValue();
		
		
		// (4) autoUnboxing 적용 후
		int five = new Integer(5);
		
		
		
		
		
		
		
		
		
		
		
	   
	} // end method main

}
