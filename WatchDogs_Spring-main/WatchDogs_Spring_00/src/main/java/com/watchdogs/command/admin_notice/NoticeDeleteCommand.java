package com.watchdogs.command.admin_notice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.watchdogs.command.home.BCommand;
import com.watchdogs.dao.DaoNotice;
import com.watchdogs.dao.DaoDog;

public class NoticeDeleteCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		int noId = Integer.parseInt(request.getParameter("noId"));
		
		DaoNotice daoNotice = new DaoNotice();
		daoNotice.delete(noId);
	}

}
