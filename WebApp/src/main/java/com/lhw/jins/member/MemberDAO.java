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
			m.setJm_id(request.getParameter("jm_id"));
			m.setJm_id(request.getParameter("jm_pw"));

			if (ss.getMapper(MemberMapper.class).join(m) == 1) {
				System.out.println("가입 성공");
			} else {
				System.out.println("가입 실패");
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DB서버 문제");
		}
	}
}
