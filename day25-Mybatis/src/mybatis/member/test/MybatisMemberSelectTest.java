package mybatis.member.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import mybatis.emp.MybatisClient;
import mybatis.member.vo.Member;

public class MybatisMemberSelectTest {

	public static void main(String[] args) {
		
		// 1. factory 얻기
		SqlSessionFactory factory = MybatisClient.getFactory();
		
		// 2. 세션 얻기
		SqlSession session = factory.openSession();
		
		try {
		
			//3. 쿼리 실행
			//  (1) 전체 조회 쿼리 아이디 :
			// mybatis.member.mapper.MemberMapper.selectAll
			List<Member> members =
				   session.selectList("mybatis.member.mapper.MemberMapper.selectAll");
			
			for (Member member: members) {
				System.out.println(member);
			}
            
			System.out.println("==============================");
			// (2) 직원 1명 조회
		    Member inputMember = new Member();
		    inputMember.setMemberid("M002");
			Member member = session.selectOne("mybatis.member.mapper.MemberMapper.selectMember", inputMember);
			System.out.println(member);
			
		}finally {
			// 4. 닫기
		 if (session != null)
			session.close();
				
		}
    }
}
