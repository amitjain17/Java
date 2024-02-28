package com.project.springbootjdbc.repo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcCallRepo {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void callJDBC() {
//		String sql = "select * from user_data";
//		Map<String,Object> rst = jdbcTemplate.queryForMap(sql);
//		System.out.println(rst);
		
		String sql = "select * from user_data where name = ?";
		List<Map<String,Object>> list=jdbcTemplate.queryForList(sql, "firstUser");
		System.out.println(list);
	}

}
