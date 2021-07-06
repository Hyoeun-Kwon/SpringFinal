package com.springlec.base0701.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.springlec.base0701.dao.BDao;

public class BDeleteCommand implements BCommand {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		//------> controller에서 넘긴 model을 map을 사용해서 박스를 열어주는 과정 ---------end
		
		
		//unboxing 하고 나면 드디어 getParameter 사용 가능 
		int bId = Integer.parseInt(request.getParameter("bId"));
		System.out.println("bId : " + bId);
		
		BDao dao = new BDao();
		dao.delete(bId);
	}

}
