package com.springlec.baseoneline.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.springlec.baseoneline.dto.BDto;
import com.springlec.baseoneline.util.Constant;

public class BDao {
	
	
	JdbcTemplate template;
	
	//Constructor 
	public BDao() {
		this.template = Constant.template;
	}
	
	public ArrayList<BDto> list(){
		System.out.println("Dao_list");
		String query = "SELECT bId, bName, bTitle, bContent, bDate FROM mvc_board";
		//String query = "SELECT * FROM mvc_board";

		return (ArrayList<BDto>) template.query(query, new BeanPropertyRowMapper<BDto>(BDto.class));
		
		// BDto 형식으로 사용할 것-> 그건 BDto.class 에 있는애야 
	}
	
	//////////////////////////////////////////////////////////
	//     DELETE METHOD								    //
    //////////////////////////////////////////////////////////
	
	public void delete(final int bId) {
		
		// Query
		String query = "DELETE FROM mvc_board WHERE bId = ?";
		this.template.update(query, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				// TODO Auto-generated method stub
				ps.setInt(1, bId);
				
			}
		});
	}
	


}
