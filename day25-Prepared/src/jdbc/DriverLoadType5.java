package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.OracleDriver;

/**
 * SCOTT 계정의 EMP 테이블의 내용을 조회하여
 * 데이터베이스 접속을 테스트하는 클래스
 * -----------------------------------------
 * 1. 드라이버 로드
 * 2. 커넥션 맺기
 * 3. 쿼리 준비
 * 4. 쿼리 실행
 * 5. 결과 처리
 * 6. 자원 해제
 * -----------------------------------------
 * @author 304
 *
 */
public class DriverLoadType5 {

	// DB 커넥션 정보를 static 상수로 선언
	private static final String URL = 
			"jdbc:oracle:thin:@//localhost:1521/XE";
	
	private static final String MYSQL_URL =
			"jdbc:mysql://127.0.0.1:3306/emp?serverTimezone=Asia/Seoul";
	
	
	private static final String USER = "SCOTT";
	private static final String PASSWORD = "TIGER";
	
	private static final String DIRVER = "oracle.jdbc.OracleDriver";
	private static final String MYSQL_DRIVER = "com.mysql.cj.jdbc.Driver";
	
	public static void main(String[] args) {
		// JDBC 연결에 필요한 객체들 선언
		Connection connection = null;
		Statement stmt = null;
		ResultSet result = null;
		
		try {
			// 1. 드라이버 로드 
//			Class.forName(DIRVER);
			Class.forName(MYSQL_DRIVER);
			
			// 2. 커넥션 맺기
			connection =
					DriverManager.getConnection(MYSQL_URL, USER, PASSWORD);

			// 3. 쿼리 준비
			System.out.println("아이디를 입력하세요.");
			
			String sql = "SELECT l.userid  "
					   + " FROM LOGIN l    "
					   + " WHERE l.userid = '" + id + "'"
					   + "   AND l.password = '" + password + "'"
					 ;
					
					 s
	        smtm = connection.createStatement();			
			stmt = connection.createStatement();
			
			// 4. 쿼리 실행   
			result = stmt.executeQuery(sql);
			
		
			// 5. 결과 처리 : 반복수행
			//    SELECT 실행결과는 여러 행의 결과가 발생하는 것이
			//    일반적이므로 각 행별 처리를 위해서는 반복처리가 필요
			while (result.next()) {
			     System.out.println("접속된 아이디 : ");
			     System.out.println(result.getString(1));
			     System.out.println("접속 되었습니다.");
			
			} else {
				System.out.println(" SQL ");
			}
			
		} catch (SQLException e) {
			System.err.println("SQL 구문 실행시 오류! "
		                       + e.getMessage());
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 로드시 오류! "
		                       + e.getMessage());
			e.printStackTrace();
			
		} finally {
			// 6. 자원 해제   
			
			try {
				if (result != null) {
					result.close();
				}
				
				if (stmt != null) {
					stmt.close();
				}
				
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				System.err.println("자원 해제시 오류!" + e.getMessage());
				e.printStackTrace();
			}
			
		}
		
		
		
		
		
	}

}