package mybatis.member.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import mybatis.emp.MybatisClient;
import mybatis.member.vo.Member;

public class MybatisMemberDeleteTest {
	
	public static void main(String[] args) {
		// 1. 팩토리 얻기
		SqlSessionFactory factory = MybatisClient.getFactory();
		// 2. 세션 얻기
		SqlSession session = factory.openSession(true);
		
		try {
		
			// 3. 쿼리 실행 및 결과 받기
			//mybatis.member.mapper.MemberMapper
			Member rmMember = new Member();
			rmMember.setMemberid("M011");
			
			int rmCnt = session.delete("mybatis.member.mapper.MemberMapper.deleteMember", rmMember);
			
			if (rmCnt >0) {
				System.out.printf("멤버정보 %d 건이 삭제되었습니다", rmCnt);
			} else {
				System.out.println("삭제된 정보가 없습니다");
			}
			
		} finally {
			// 4. 세션 닫기
			if (session !=null) {
				session.close();
			}
		}
	}
}
