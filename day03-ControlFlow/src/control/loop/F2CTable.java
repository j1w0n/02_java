package control.loop;

public class F2CTable {

	public static void main(String[] args) {
		// 1. 선언
		
		final int FROM = 0;
		final int TO = 100;
		final int STEP = 10; //상수 선언
		
		double fah;
		double cel; //온도 변수 선언

        
		for (fah = FROM; fah <= TO; fah+= STEP) {
			 cel = 5.0 / 9.0 * (fah - 32);
			 System.out.printf("%5.1f F = %5.1f C%n", fah, cel);
		}
		
		// 여러가지 방법으로 for를 쓸 수 있다
		
		for (fah = 0; fah <= 100; fah+= 10) {
			 cel = 5.0 / 9.0 * (fah - 32);
			 System.out.printf("%5.1f F = %5.1f C%n", fah, cel);
		}    
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
