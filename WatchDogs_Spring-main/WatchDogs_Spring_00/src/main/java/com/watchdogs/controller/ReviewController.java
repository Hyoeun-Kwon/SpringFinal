package com.watchdogs.controller;

import java.lang.ProcessBuilder.Redirect;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.watchdogs.command.home.BCommand_new;
import com.watchdogs.command.review.ReviewDeleteCommand;
import com.watchdogs.command.review.ReviewDetailViewCommand;
import com.watchdogs.command.review.ReviewListCommand;
import com.watchdogs.command.review.ReviewMdViewCommand;
import com.watchdogs.command.review.ReviewModifyCommand;
import com.watchdogs.command.review.ReviewWriteCommand;
import com.watchdogs.dao.ReviewDao;

@Controller
public class ReviewController {
	
	
	@Autowired
	private SqlSession sqlSession;
	
	BCommand_new command = null;
	
	
	//리뷰 리스트 보여주기
	@RequestMapping("/reviewlist")
	public String reviewList(HttpServletRequest request, Model model) {
		System.out.println("ReviewControllerreviewList 진입");
		command = new ReviewListCommand();
		command.execute(sqlSession, model);
		return "reviewlist";
	}
	
	//글쓰기 작성시 글쓰기 폼으로 가기
	@RequestMapping("/review")
	public String review() {
		return "review_write";
	}
	
	//글쓰기 폼에서 입력후 후기작성 누르면 DB로 값 입력되게 하기
	@RequestMapping("/review_write")
	public String reviewWrite(HttpServletRequest request, Model model) {
		System.out.println("reviewWrite 진입");
		//HttpServletRequest :  jsp 에서 유저가 쓴 값을 받아 올때 씀, --get Text 
		//Model 은 쿼리 작업 후 jsp 로 값을 넘길때 사용하므로 얘는 model이 필요 없다. ---set Text 
		//Command는 jsp에서 받아온 애들을 if문 등으로 조건을 달면서 길어지면 사용한다
//		ReviewDao dao = sqlSession.getMapper(ReviewDao.class);
//		System.out.println("request get Parameter _ retitle" + request.getParameter("retitle"));
//		dao.review_write(request.getParameter("retitle"), request.getParameter("recontent"), request.getParameter("redate"), request.getParameter("userid"), request.getParameter("refilepath"));
		
		model.addAttribute("request", request);
		command = new ReviewWriteCommand();
		command.execute(sqlSession,model);
		
		return "redirect:reviewlist";
	}
	
	//리스트에서 글 눌러 상세보기
	@RequestMapping("/reviewdetail")
	public String reviewDetail(HttpServletRequest request, Model model) {
//		ReviewDao dao = sqlSession.getMapper(ReviewDao.class);
//		model.addAttribute("reviewdetail", dao.reviewdetail(Integer.parseInt(request.getParameter("reid"))));
		//jsp 로 이름을 reviewdetail로 보낼거야!
		model.addAttribute("request", request);
		command = new ReviewDetailViewCommand();
		command.execute(sqlSession,model);
		return "review_detailview";

	}
	//수정/삭제 누르면 수정/삭제 화면으로 넘어가기
	@RequestMapping("/review_mdview")
	public String review_mdview(HttpServletRequest request, Model model) {
//		ReviewDao dao = sqlSession.getMapper(ReviewDao.class);
//		model.addAttribute("reviewdetail", dao.reviewdetail(Integer.parseInt(request.getParameter("reid"))));
		model.addAttribute("request", request);
		command = new ReviewMdViewCommand();
		command.execute(sqlSession,model);
		return "review_mdview";
	}

	//수정 버튼 누르면 수정
	@RequestMapping("reviewmodify")
	public String reviewModify(HttpServletRequest request, Model model) {
//	ReviewDao dao = sqlSession.getMapper(ReviewDao.class);
//	dao.review_modify(Integer.parseInt(request.getParameter("reid")), request.getParameter("retitle"), request.getParameter("recontent"), request.getParameter("refilepath"));
		model.addAttribute("request", request);
		command = new ReviewModifyCommand();
		command.execute(sqlSession,model);
	
		return "redirect:reviewlist";
	}
	
	
	//삭제 버튼 누르면 삭제
	@RequestMapping("/reviewdelete")
	public String review_delete(HttpServletRequest request, Model model) {
//		ReviewDao dao = sqlSession.getMapper(ReviewDao.class);
//		dao.review_delete(Integer.parseInt(request.getParameter("reid")));
		model.addAttribute("request", request);
		command = new ReviewDeleteCommand();
		command.execute(sqlSession,model);
		return "redirect:reviewlist";
	}
	

}//---------
