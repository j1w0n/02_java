package product.vo;

/**
 * 
 * (1) PRODUCT 테이블의 PK 컬럼인 code 컬럼을 멤버변수로 갖는 클래스 생성
 * (2) 기본생정자 생성, 
 *     code 컬럼을 받아서 초기화하는 생성자 생성
 * (3) 접근자, 수정자 생성
 * (4) equals(), & hashCode() : code 변수로 작성
 * (5) toString() 작성 
 *   : "PK=P001" 과 같은 문자열이 출력되도록 작성
 *   
 * @author 304
 *
 */
public class PrimaryKey {
      
	private String P001;
	private String P002;
	private String P003;
	private String P004;
	private String P005;
	
	
	 public PrimaryKey() {
		   
	   }


	public String getP001() {
		return P001;
	}


	public void setP001(String p001) {
		P001 = p001;
	}


	public String getP002() {
		return P002;
	}


	public void setP002(String p002) {
		P002 = p002;
	}


	public String getP003() {
		return P003;
	}


	public void setP003(String p003) {
		P003 = p003;
	}


	public String getP004() {
		return P004;
	}


	public void setP004(String p004) {
		P004 = p004;
	}


	public String getP005() {
		return P005;
	}


	public void setP005(String p005) {
		P005 = p005;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((P001 == null) ? 0 : P001.hashCode());
		result = prime * result + ((P002 == null) ? 0 : P002.hashCode());
		result = prime * result + ((P003 == null) ? 0 : P003.hashCode());
		result = prime * result + ((P004 == null) ? 0 : P004.hashCode());
		result = prime * result + ((P005 == null) ? 0 : P005.hashCode());
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
		PrimaryKey other = (PrimaryKey) obj;
		if (P001 == null) {
			if (other.P001 != null)
				return false;
		} else if (!P001.equals(other.P001))
			return false;
		if (P002 == null) {
			if (other.P002 != null)
				return false;
		} else if (!P002.equals(other.P002))
			return false;
		if (P003 == null) {
			if (other.P003 != null)
				return false;
		} else if (!P003.equals(other.P003))
			return false;
		if (P004 == null) {
			if (other.P004 != null)
				return false;
		} else if (!P004.equals(other.P004))
			return false;
		if (P005 == null) {
			if (other.P005 != null)
				return false;
		} else if (!P005.equals(other.P005))
			return false;
		return true;
	}


	@Override
	public String toString() {
		String message = "PK=%s";
		return String.format(message, P001, P002, P003, P004, P005);
	}
	
	
	
}
