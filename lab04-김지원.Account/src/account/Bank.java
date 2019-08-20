package account;

import java.util.ArrayList;
import java.util.List;

/**
 * 계좌들을 관리하는 은행을 나타내는 클래스
 * 메소드 이름 앞의  + 기호는 public 메소드임을 나타냄
 * -----------------------------------------------------------------------------------
 * 멤버변수 
 * 
 * 계좌를 여러개 관리하기 위한 계좌목록을 선언
 * accounts : List<Account> : 계좌목록 
 * ----------------------------------------------------------------------------------
 * 기본생성자
 * 
 * 계좌목록을 타내내는 accounts 변수를 ArrayList 로 초기화 진행
 * ----------------------------------------------------------------------------------
 * 메소드 
 * +createAccount(String owner) : boolean 
 *     : 신규계좌를 1개 생성하는 메소드
 *       계좌 소유자의 이름을 받아서 신규계좌를 1개 생성한 후
 *       계좌목록에 추가.
 *       계좌목록에 추가 할 때 List 의 add 메소드 실행 결과로 리턴받는 boolean 값을 리턴.
 * 
 * +printAccount(int accNumber) : void
 *     : 계좌번호를 입력받아서 
 *       해당 계좌의 상태를 출력하는 메소드
 *       입력받은 accNumber 에 해당하는 계좌정보를 
 *       계좌목록에서 찾아서 출력
 *       -----------------------------------------
 *       해당 번호의 계좌가 없는 경우
 *       "존재하지 않는 계좌번호입니다." 메시지 출력
 *       
 *       
 * +deposit(int accNumber, double amount) : void
 *     : 계좌번호와 입금액을 입력받아서
 *       계좌목록에 있는 해당 계좌번호 계좌에 amount 만큼을 입금하는 메소드
 *       입금 후 계좌 상태를 출력
 *       ------------------------------------------
 *       해당 번호의 계좌가 없는 경우
 *       "존재하지 않는 계좌번호입니다." 메시지 출력
 *             
 * +printAllAccounts() : void
 *     : 전체 계좌 목록을 출력
 *       accounts 리스트를 foreach 를 사용하여 출력            
 * ----------------------------------------------------------------------------------
 * 
 * @author HannaC
 *
 */
public class Bank {

	// 멤버변수 선언 및 초기화
	 List<Account> accounts;
	
	 // 기본생성자 선언 
	 public Bank () {
		 accounts = new ArrayList<>();
	 }
	
	 
	 // 메소드 생성
	 public boolean createAccount(String owner) {
		Account create = new Account(owner);
		boolean addCnt = accounts.add(create);
		return addCnt;
		 
	 }
	 
	 public void printAccount(int accNumber) {
		
	 }
	 
	 
	 // 전체 계좌 목록을 출력
	 public void printAllAccounts() {
		 for (Account accounts : accounts) {
			 System.out.println(accounts);
		 }
	 
	 }
	 
	 
	 
	 

	 
	 
}
