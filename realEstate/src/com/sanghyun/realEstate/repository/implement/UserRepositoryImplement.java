package com.sanghyun.realEstate.repository.implement;

import java.sql.Connection;
import java.sql.DriverManager;

import com.sanghyun.realEstate.repository.UserRepository;

public class UserRepositoryImplement implements UserRepository {

	private Connection connection;
	
	public UserRepositoryImplement () {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			final String URL = "jdbc:mysql://127.0.0.1:3306/real_estate";
			final String USERNAME = "root";
			final String USERPASSWORD = "root";
			
			this.connection = DriverManager.getConnection(URL, USERNAME, USERPASSWORD);
			
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		
	}
	
	@Override
	public boolean existsById(String id) {
		
		
		
		return false;
	}

}
