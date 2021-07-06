package com.springlec.baseoneline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springlec.baseoneline.command.BCommand;
import com.springlec.baseoneline.command.BListCommand;
import com.springlec.baseoneline.util.Constant;

public class BController {
	
	BCommand command = null;
	private JdbcTemplate template;
	
	
	// DI에 있는 template 쓰려면Auto 해야함
		@Autowired
		public void setTemplate(JdbcTemplate template) {
			//전체에 쓰게 해주기
			this.template = template;
			// DATA값 넣어주기
			Constant.template = this.template;
			
		}
	
	
	@RequestMapping("/list")
	public String list(Model model) {
		
		command = new BListCommand();
		command.execute(model);
		
		return "list";
	}
	

}
