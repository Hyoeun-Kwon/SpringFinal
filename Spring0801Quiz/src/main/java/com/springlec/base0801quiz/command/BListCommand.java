package com.springlec.base0801quiz.command;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

import com.springlec.base0801quiz.dao.IDao;

public class BListCommand implements BCommand {

	@Override
	public void execute(SqlSession sqlSession, Model model) {
		// TODO Auto-generated method stub
		
		IDao dao = sqlSession.getMapper(IDao.class);
		
		// DATA 건네주기
		model.addAttribute("list", dao.listDao());

	}
	
}