package com.lhw.jins.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberDAO {
	@Autowired
	private SqlSession ss;

	public void join(Member m, HttpServletRequest request, HttpServletResponse response) {
		try {
			m.setName(request.getParameter("name"));
			m.setEmail(request.getParameter("email"));
			m.setPw(request.getParameter("pw"));

			if (ss.getMapper(MemberMapper.class).join(m) == 1) {
				System.out.println("���� ����");
			} else {
				System.out.println("���� ����");
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DB���� ����");
		}
	}
}
