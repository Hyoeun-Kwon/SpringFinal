package com.springlec.base0801quiz.command;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

public interface BCommand {
	
	void execute(SqlSession sqlSession,Model model);
	//session이 필요하면 session도 넣어줘야한다

}
