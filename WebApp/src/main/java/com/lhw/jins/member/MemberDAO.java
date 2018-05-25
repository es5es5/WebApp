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
				System.out.println("가입 성공");
			} else {
				System.out.println("가입 실패");
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DB서버 문제");
		}
	}
	
	public void login(Member m, HttpServletRequest request, HttpServletResponse response) {
		try {
			// DB에 해당 멤버가 있는지
			Member dbM = ss.getMapper(MemberMapper.class).getMemberByEmail(m);
			
			if (dbM != null) {
				if (m.getPw().equals(dbM.getPw())) {
					// 1시간동안 로그인 유지(1시간 동안 요청 없으면 로그인 해제)
					request.getSession().setAttribute("loginMember", dbM);
					request.getSession().setMaxInactiveInterval(3600);
					System.out.println("로그인 성공");
				} else {
					System.out.println("비번 오류");
				}
			} else {
				System.out.println("그런 계정 없음.");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DB서버 문제");
		}
	}
	
	
}
