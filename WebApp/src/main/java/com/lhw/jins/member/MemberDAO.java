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
	
	public void login(Member m, HttpServletRequest request, HttpServletResponse response) {
		try {
			// DB�� �ش� ����� �ִ���
			Member dbM = ss.getMapper(MemberMapper.class).getMemberByEmail(m);
			
			if (dbM != null) {
				if (m.getPw().equals(dbM.getPw())) {
					// 1�ð����� �α��� ����(1�ð� ���� ��û ������ �α��� ����)
					request.getSession().setAttribute("loginMember", dbM);
					request.getSession().setMaxInactiveInterval(3600);
					System.out.println("�α��� ����");
				} else {
					System.out.println("��� ����");
				}
			} else {
				System.out.println("�׷� ���� ����.");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DB���� ����");
		}
	}
	
	
}
