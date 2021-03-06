package com.springlec.base0801quiz;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springlec.base0801quiz.command.BCommand;
import com.springlec.base0801quiz.command.BListCommand;
import com.springlec.base0801quiz.dao.IDao;
import com.springlec.base0801quiz.dto.IDto;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private SqlSession sqlSession; //servlet 에 있는 session과 연결 됨
	
	//command 선언
	BCommand command= null;
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping("/list")
	public String list(Model model) {
//		// dao를 연결해 값을 가져옴 
//		IDao dao = sqlSession.getMapper(IDao.class);
//		// dao.listDao() 쓰려고 interface 한 것임!
//		// 값을 넘겨줌 
//		model.addAttribute("list", dao.listDao());
		
//		IDao dao = sqlSession.getMapper(IDao.class);
//		model.addAttribute("list", dao.listDao());
		
		command = new BListCommand();
		command.execute(sqlSession, model);
		
		return "/list";
	}
	
	@RequestMapping("/write_view")
	public String write_view() {
		return "write_view";
	}
	
	@RequestMapping("/write")
	public String write(HttpServletRequest request) {
		//HttpServletRequest :  jsp 에서 값을 받아 올때 씀, 
		//Model 은 jsp 로 값을 넘길때 사용하므로 얘는 model이 필요 없다.
		//Command는 jsp에서 받아온 애들을 if문 등으로 조건을 달면서 길어지면 사용한다
		IDao dao = sqlSession.getMapper(IDao.class);
		
		dao.writeDao(request.getParameter("name"), request.getParameter("telno"), request.getParameter("address"), request.getParameter("email"), request.getParameter("relation"));
		
		return "redirect:list";
	}
	
	@RequestMapping("/content_view")
	public String view(HttpServletRequest request, Model model) {
		// dao를 연결해 값을 가져옴 
		IDao dao = sqlSession.getMapper(IDao.class);
		// dao.listDao() 쓰려고 interface 한 것임!
		// 값을 넘겨줌 
		//IDto dto = (IDto) dao.viewDao(Integer.parseInt(request.getParameter("seqno")));
		model.addAttribute("content_view", dao.viewDao(Integer.parseInt(request.getParameter("seqno"))));
		
		return "content_view";
	}
	
	
	@RequestMapping("/modify")
	public String modify(HttpServletRequest request, Model model) {
		IDao dao = sqlSession.getMapper(IDao.class);
		dao.modifyDao(request.getParameter("name"), request.getParameter("telno"), request.getParameter("address"), request.getParameter("email"), request.getParameter("relation"), Integer.parseInt(request.getParameter("seqno")));
		//return "redirect:list";
		//dao.viewDao(Integer~~~("seqno") : 이 부분을 bean 에 넣고, 그 이름을 content_view로 정해주는 거임 
		// 그래서 이 addAttribute에 있는 이름으로 jsp에서 부를때 그 이름으로 씀
		model.addAttribute("content_view", dao.viewDao(Integer.parseInt(request.getParameter("seqno"))));
		return "content_view";
	}
	
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request) {
		IDao dao = sqlSession.getMapper(IDao.class);
		dao.deleteDao(Integer.parseInt(request.getParameter("seqno")));
		return "redirect:list";
	}
	
	
	//조건검색
	@RequestMapping("/listQuery")
	public String listQuery(HttpServletRequest request, Model model) {
		//jsp로 부터 값을 받아서 다시 화면에 띄우므로 model까지 필요
		IDao dao = sqlSession.getMapper(IDao.class);
		model.addAttribute("list",dao.listQuery(request.getParameter("query"), request.getParameter("content")));
		return "/list";
	}
	
	
	
}//--------
