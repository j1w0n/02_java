package staticfield;

/**
 * static <--> non-static
 * 사이의 호출관계를
 * 서로 다른 클래스에서 테스트하는 클래스
 * @author Administrator
 *
 */
public class StaticInitTest {

	 // main 메소드는 static 메소드
	public static void main(String[] args) {
		// 다른 클래스의 static 필드에 대한 사용
		// ==> 선언, 초기화, 사용의 순서가 필요 없음
		//     바로 사용 가능
        // 1. StaticInit 클래스의 static 변수
		System.out.println("StaticInit.count=" + StaticInit.count);
		
		// 2. StaticInit 클래스의 static 메소드 사용
		//  ==> 클래스이름.메소드이름();
	    StaticInit.increaseCount();
	}

}
