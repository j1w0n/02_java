package account;

/**
 * 은행계좌를 나타내는 클래스
 * ----------------------------------------------------------------------------
 * 클래스변수(static 변수)
 * serial : int : 계좌번호에 사용될 일련번호 0으로 초기화
 * ----------------------------------------------------------------------------
 * 멤버변수(인스턴스 변수) 
 * accNumber : int : 계좌번호
 * balance : double : 계좌잔액
 * owner : String : 계좌 소유자 이름
 * ----------------------------------------------------------------------------
 * 기본생성자 : private 으로 설정
 * 
 * 기본생성자 안에서 계좌번호는 serial 을 1씩 자동으로 증가시킨 값으로 설정하고
 * 잔액은 0인 상태의 계좌가 만들어지도록 초기화 코드 작성
 * ----------------------------------------------------------------------------
 * 매개변수 받는 생성자 : public 으로 설정
 * 
 * 매개변수로 계좌 소유자 이름만 받는 생성자를 중복정의
 * 계좌번호와, 잔액은 기본생성자의 기능을 사용하여 초기화하고
 * 소유자 이름은 입력받은 매개변수를 통해서 직접 초기화하는 코드 작성
 * -----------------------------------------------------------------------------
 * 추가 메소드
 * +deposit(double amount) : void : 입력된 amount 만큼 계좌 잔액을 증가시켜 balance 에 반영
 * 
 * +withdraw(double amount) : boolean : 입력된 amount 만큼 게좌 잔액을 차감시켜 balance 에 반영
 *                          만약 amount 가 balance 보다 크면 잔액을 변경시키지 않고 false 를 리턴
 *                          amount 가 balance 보다 작으면 잔액을 차감하여 balance 에 반영하고 true 를 리턴  
 * 
 * +print() : void : 계좌 상태를 출력 
 * ----------------------------------------------------------------------------
 * accNumber 필드에 대한 접근자 메소드 1개만 정의
 * ----------------------------------------------------------------------------
 * equals() & hashCode() 는 accNumber 기준으로 재정의
 * -----------------------------------------------------------------------------
 * toString() 재정의 : "계좌정보 [계좌번호: O, 잔액: XXX (원), 소유자:OOO]" 의 형태로 스트링 리턴할 것
 * -----------------------------------------------------------------------------
 * @author HannaC
 *
 */
public class Account {
	
	public static int serial = 0;
	
	// 멤버변수 선언
	int accNumber;
	double balance;
	String owner; 
	
	// 기본생성자 선언
	private Account() {
		accNumber = serial++;
		balance =0;
	}
	
	// 매개변수를 받는 생성자
	
	public Account(String owner) {
		this();
		this.owner = owner;
	}
	

	// 추가 메소드
	public void deposit(double amount) {
	    balance += amount;
	    
     } // by.hnc : 이 닫는 괄호 앞의 세로줄이 맞지 않음, 그리고 다음 메소드와는 반드시 1줄을 띄어쓰기 할 것.
	public boolean withdraw(double amount) {
		// 아래 로직에서 amount <= balance 가 되어야 함. 출금하려는 값이 잔액과 동일해도 출금은 가능합니다. 
		if (amount < balance) {
			balance -= amount;
			// 이런식으로 메소드 안에 두번의 리턴구문이 등장하지 않도록 하십시오. 리턴은 반드시 메소드 끝에서 한 번
			return true; 
		} else {
			// 메소드 내부 로직에서는 리턴값의 결정만 리턴은 마지막에 한 번만
			return false;
		}
		/* 아래 정도의 구문이 되어야 합니다.
		 * 먼저 리턴에 사용할 변수를 선언하고, 메소드 로직 안에서는 그 변수의 값을 결정만 한 뒤
		boolean success = false;
		if (amount <= balance) {
			balance -= amount;
			success = true;
		}
		
		// 마지만에 한번만 리턴합니다.
		return success;
		*/
	} // 다음 메소드와 반드시 1줄의 줄 띄어쓰기 할 것. 이렇게 붙여쓰지 말 것.
    // 계좌 상태를 출력
	public void print() {
		// by.hnc : 이미 toString() 을 재정의해두었기때문에
		//          여기서는 this 객체를 출력하는 것으로 충분합니다.
		//          System.out.println(this); 
		//          면 충분합니다.
		System.out.printf("계좌번호 : %d, 소유자 : %s 계좌잔액 : %d%n"
		         , accNumber, owner, balance);
	}

	public int getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accNumber;
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
		Account other = (Account) obj;
		if (accNumber != other.accNumber)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "계좌정보 [계좌번호: "+accNumber+"  , 잔액: " +balance+ " (원),소유자:" +owner+"]";
	}
	
	
}
