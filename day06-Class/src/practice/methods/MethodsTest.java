package practice.methods;

public class MethodsTest {

	public static void main(String[] args) {
		// 1. 메소드 정의 클래스 VarietyMethods 의 변수 선언
       VarietyMethods methods;
       
       // 2. 초기화
       methods = new VarietyMethods();
       
       // 3. 사용
       
       methods.sayHello();
       
       methods.maxims("홍길동", "호부호형을 못하니...");
//       
//       methods.maxims("소크라테스", "Know Yourself");
//       
//       methods.maxims("피터사간", "모든 사람은 두 종료의 고통중에서 선택해야한다. 훈련하는 고통이나 후회하는 고통이거나");      
//      
       	   
       	   double cel = methods.fahTocel(4);
       	   System.out.println("cel="+cel);   
       	   
//       
       methods.birthYearMonth("김지원", 1998, 02 );
//       
       methods.printNineNineTable(2);
//       
//       int[] stage = {2, 3, 4};
//       methods.printNineNineTableFromArray(stage);
//       

       
       
	}

}
