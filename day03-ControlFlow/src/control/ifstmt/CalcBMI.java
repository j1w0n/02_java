package control.ifstmt;

import java.util.Scanner;

public class CalcBMI {

	public static void main(String[] args) {
		
		// 1. 선언

		double weight;
		double height;
		double bmi;
		
		Scanner scan;
		String result;
		
		// 2. 초기화
		
		
		scan = new Scanner(System.in);
		
		System.out.println("몸무게, 키를 입력 하시오");
		
		weight = scan.nextDouble();
		height = scan.nextDouble();
		bmi = weight/ (height * height);
		// 3. 실행
	
		if(bmi < 15) {
		result = "병적인 저체중";
		}
		else if(bmi < 18.5) {
	    result = "저체중";
		}
		else if(bmi < 23.0) {
	    result = "정상";
		}
		else if(bmi <= 27.5) {
		result = "과체중";
		}
		else if(bmi <= 40) {
		result = "비만";
		}
		else     {
	 	result = "병적인 비만";
		}
		
		
		
		System.out.printf("당신의 BMI는  %f   %s 입니다. %n ",  bmi, result);
		
		
		
		
		
		
		
	}

}
