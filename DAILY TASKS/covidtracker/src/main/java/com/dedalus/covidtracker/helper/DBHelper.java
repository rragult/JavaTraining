package com.dedalus.covidtracker.helper;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class DBHelper {
	public static DriverManagerDataSource getDataSource()
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource();;
		 
		dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("system");
		dataSource.setPassword("orbis");
		return dataSource;
	}
}
