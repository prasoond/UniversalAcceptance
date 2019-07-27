package com.ua.dao;

import java.sql.CallableStatement;
import java.sql.Connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UADaoImpl implements UADao{
	@Autowired 
	JdbcTemplate jdbcTemplate;   //A class of spring.

	public void addUser(String fn, String ln, String email)
	{
		
		
			
			final String procedurecall = "{call Proc_App(?,?,?,?)}";
			Connection con=null;
			try {
			  con =	jdbcTemplate.getDataSource().getConnection();  //connection established
			  CallableStatement cs = con.prepareCall(procedurecall);
			  cs.setString(1,"insert");
			  cs.setString(2,fn);
			  cs.setString(3,ln);
			  cs.setString(4,email);
			  
			  cs.execute();
			} catch(Exception e) {
				e.printStackTrace();
			}

	finally {
				try{
					
					con.close();
				    
				
				   } catch(Exception e){
			}
		
			}
			
	}
		

		
	}

