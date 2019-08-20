package mybatis.member.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import mybatis.emp.MybatisClient;
import mybatis.member.vo.Member;

public class MybatisMemberInsertTest {
	public static void main(String[] args) {
		
		// 1. factory 얻기
		SqlSessionFactory factory = MybatisClient.getFactory();
		// 2. session 얻기
		SqlSession session = factory.openSession(true);
		
		try {
		     // 3. 쿼리 실행 & 결과받기
		     //mybatis.member.mapper.MemberMapper.insert
			
			Member member = new Member();
			member.setMemberid("M011");
		    member.setMembername("박준석");
		    member.setPhone("1818");
		    member.setAddress("수원");
		   
		    int addCnt = session.insert("mybatis.member.mapper.MemberMapper.insertMember", member);
				   
		    if (addCnt > 0) {
				System.out.println("직원정보=" + member);
				System.out.printf("%d 행이 삽입되었습니다.%n", addCnt);
			} 
					
	} finally {
       // 4. 닫기
		if (session !=null)
			session.close();
        }
 
	}
}