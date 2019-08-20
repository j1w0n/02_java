package mybatis.member.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import mybatis.emp.MybatisClient;
import mybatis.emp.vo.Emp;
import mybatis.member.vo.Member;

public class MybatisMemberUpdateTest {

	   public static void main(String[] args) {
		      // 1. 팩토리 얻기
		      SqlSessionFactory factory = MybatisClient.getFactory();
		      
		      // 2. 세션 얻기
		      SqlSession session = factory.openSession(true);
		      
		      try {
		         // 3. 세션에서 쿼리 실행
		         // (1) 직원 1명 정보 조회
		         //mybatis.emp.mapper.EmpMapper.selectEmp
		         Member inputMember = new Member();
		         inputMember.setMemberid("M011");
		         Member member = session.selectOne("mybatis.member.mapper.MemberMapper.selectMember", inputMember);

		   
		         System.out.println(member);
		         
		  
		         member.setMajor("컴공"); 
		         member.setBirthmonth(1);
		         member.setGender("M");
		     
		         
		         // (2)조회된 직원 정보 일부 수정
		         //mybatis.emp.mapper.EmpMapper.update
		         int setCnt = session.update("mybatis.member.mapper.MemberMapper.updateMember", member);
		         
		         if(setCnt > 0) {
		            System.out.printf("%s 직원의 정보가 %d건 수정 되었습니다.%n", member.getMemberid(), setCnt);
		         }
		         
		         // 3. 조회된 정보 재 조회
		         Member selectMember = new Member();
		         selectMember.setMemberid("M011");
		         Member newMember = session.selectOne("mybatis.member.mapper.MemberMapper.selectMember", selectMember);
		         System.out.println("수정된 정보");
		         System.out.println(newMember);
		         
		      } finally {
		         // 4. 세션 닫기
		         if (session != null) {
		            session.close();
		         }
		      }
		      
		      
		      
		   }
}
