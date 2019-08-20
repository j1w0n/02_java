package product.vo;

/**
 * (1) PRODUCT 클래스 컬럼명과 동일한 멤버변수, 컬럼 타입별 
 *     자바에서 적당한 타입으로 지정된 멤버변수를 갖는 클래스 생성
 * (2) 컬럼명이 _(underscore) 인 경우 자바에서는 camelCase(낙타표기법 적용한 변수명으로 작성)
 * (3) 기본생성자 생성
 * (4) 접근자, 수정자 생성
 * (5) equals() & hashCode() : code 변수로 작성
 * (6) toString() 작성 
 *   : "제품정보[안쪽에 각 멤버변수 이름:값, 이름:값, ..., 이름:값]" 형태로 출력되도록
 * @author 304
 *
 */
public class Product {
    
	 private int price;
	 private int quantity;
	 private String code;
	 private String name;
	 private String regdate;
	 private String moddate;
	
	 public Product() {
		   
	   }

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getModdate() {
		return moddate;
	}

	public void setModdate(String moddate) {
		this.moddate = moddate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		return true;
	}

	@Override
	public String toString() {
		String message = "제품정보[안쪽에 각 멤버변수 code:%s, name:%s, price:%d, quantity:%d, reg_date:%s, mod_date:%s]";
		return String.format(message, code, name, price, quantity, regdate, moddate);
	}
	
	
}
