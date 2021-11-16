package com.example.jdbc;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
public class TestData implements CommandLineRunner{
	@Autowired
	private DataSource jt;
	
	@Autowired
	private DataSource ds;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("welcome");
		System.out.println(ds.getClass().getName());
		System.out.println(jt.getClass().getName());
		
	}
	

}
