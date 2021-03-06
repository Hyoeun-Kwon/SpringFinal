package com.springlec.base0801quiz.dao;

import java.util.ArrayList;

import com.springlec.base0801quiz.dto.IDto;

public interface IDao {
	
		// 전체 검색 
		public ArrayList<IDto> listDao();
		
		//화면
		public IDto viewDao(int seqno);
	
		
		// 입력
		public void writeDao(String name, String telno, String address, String email, String relation);
		
		// 수정
		public void modifyDao(String name, String telno, String address, String email, String relation, int seqno);
		
		// 삭제 (type의 경우 Interface에서 정하는 것임!) -> 그렇기 때문에 int로 넘겨주면 xml에서 넘겨받는 값인 #{param1} 는 int로 받음!
		public void deleteDao(int seqno);
//		public void deleteDao(String seqno);
	
		//조건 검색 
		public ArrayList<IDto> listQuery(String query, String content);
	
}
