package com.lhw.jins;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeDAO {
	@Autowired
	private SqlSession ss;
}
