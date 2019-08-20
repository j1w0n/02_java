package clothing;

/**
 * 
 * 모자를 정의하는 클래스
 * --------------------------------
 * @author Administrator
 *
 */
public class Hat {

	// 1. 멤버변수 선언
	private String hatId;
	private String type;
	private String material;
	private String color;
	private double size;
	private double price;
	private int quantity;
	private char gender;
	

	// 2. 기본생성자 선언, 매개변수를 받는 생성자 중복정의
	public Hat() {

	}

	public Hat(String hatId) {
		this();
		this.hatId = hatId;
	}	
		
	public Hat(String hatId, String type) {
		this(hatId);
		this.type = type;
	}

	public Hat(String hatId, String type, String material) {
		this(hatId, type); 
		this.material = material;
	}

	public Hat(String hatId, String type, String material, String color) {
		this(hatId, type, material); 
		this.color = color;
	}
	
	public Hat(String hatId, String type, String material, String color, double size) {
		this(hatId, type, material, color); 
		this.size = size;
	}
	
	public Hat(String hatId, String type, String material, String color, double size, double price) {
		this(hatId, type, material, color, size); 
		this.price = price;
	}
	
	public Hat(String hatId, String type, String material, String color, double size, double price, int quantity) {
		this(hatId, type, material, color, size, price); 
		this.quantity = quantity;
	}
	
	public Hat(String hatId, String type, String material, String color, double size, double price, int quantity, char gender) {
		this(hatId, type, material, color, size, price, quantity); 
		this.gender = gender;
	}
	
	// 3. 메소드 선언
	/**
	 * 원래 가격보다 큰 값 할인은 불가능하도록 설정.
	 * @param amount
	 * @return amount 만큼 할인한 가격을 리턴
	 * 
	 */
	public double discount(int amount) {
		double result = 0; 
		
		if (price < amount) {
		  System.out.println("제품 가격보다 크게 할인할 수 없습니다.");
		} else {	
		  result = price - amount;
		}	
		return this.price = result;
	}	
	
	/**
	 * 모자 색상을 입력된 color 로 염색하여 색상을 변경 
	 * @param color
	 */
	
	public void dye(String color) {
		this.color = color;
	}
	
	/**
	 * amount 만큼 판매(재고를 줄임). 원래 수량보다 많이 판매 불가
	 * @param amount
	 * @return int
	 */
	public int sell(int amount) {

		if (quantity > amount) {
		 quantity -= amount; 
		}
		
		return quantity;
	}	
	
	
	/**
	 * amount 만큼 구매(재고를 늘림)
	 * @param amount
	 * @return int
	 */
	public int buy(int amount) {
		
	}
}	
