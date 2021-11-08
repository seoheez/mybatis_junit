package com.care.root;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.care.root.controller.MemberController;
import com.care.root.member.dao.MemberDAO;
import com.care.root.member.dto.MemberDTO;
import com.care.root.member.service.MemberService;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations= {
		"classpath:TestMember.xml",
		"file:src/main/webapp/WEB-INF/spring/root-context.xml"
})
public class TestMember {
	@Autowired MemberController mc;
	@Autowired MemberService ms;
	@Autowired MemberDAO dao;

	@Test
	public void testMc() {
		//System.out.println("mc : " + mc);
		assertNotNull(mc); //null이 아니면 성공
	}
	@Test
	public void testMs() {
		//System.out.println("mc : " + mc);
		assertNotNull(mc); //null이 아니면 성공
	}

	@Test
	public void testDao() {
		assertNotNull(dao); 
	}
	@Test
	public void testDaoIns() {
		MemberDTO dto = new MemberDTO();
		dto.setId(1001); dto.setName("Kristy");
		dao.insertMember(dto);
	}
	@Test
	public void testServiceIns() {
		MemberDTO dto = new MemberDTO();
		dto.setId(1002); dto.setName("Stacy");
		ms.insertMember(dto);
	}
	@Test
	public void testDaoMemberView() {
		dao.memberView();
	}
}


