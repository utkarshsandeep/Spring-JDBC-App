package com.example.SpringJDBCApp.repository;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
	@Autowired
	static JdbcTemplate jdbcTemplate;
	
	public static List<String> getAllCarName() {
		List<String> carlist=new ArrayList<>(); 
		carlist.addAll(jdbcTemplate.queryForList("SELECT * FROM `mychk`;",String.class));
		return carlist;
	}

}
