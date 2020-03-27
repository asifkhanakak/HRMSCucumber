package com.DBPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class DataBaseDemo {

	String dbUrl = "jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";
	String dbUserName = "syntax_hrm";
	String password = "syntaxhrm123";

	@Test
	public void dataBaseDemo() throws SQLException {

		Connection conn = DriverManager.getConnection(dbUrl, dbUserName, password);
		Statement st = conn.createStatement();
		ResultSet rSet = st
				.executeQuery("select * from hs_hr_employees where emp_firstname='john' aND emp_lastname='Doe'");
		rSet.next();
		String col1Data = rSet.getObject(1).toString();
		String data1 = rSet.getString("emp_lastname");
		
		System.out.println(col1Data+"  "+data1);
	}

	// @Test
	public void getDataFromDatabase() throws SQLException {
		Connection connection = DriverManager.getConnection(dbUrl, dbUserName, password);
		System.out.println("Connection is created");
		Statement st = connection.createStatement();
		ResultSet rset = st.executeQuery("select * from ohrm_nationality");

		String data;
		while (rset.next()) {
			data = rset.getObject("name").toString();
			System.out.println(data);
		}
	}

	// @Test
	public void getAndStoreData() throws SQLException {
		Connection con = DriverManager.getConnection(dbUrl, dbUserName, password);
		Statement st = con.createStatement();
		ResultSet rset = st.executeQuery("select id, name, country_code from ohrm_location;");
		// ResultSet rset=st.executeQuery("select * from ohrm_location;");

		List<Map<String, String>> listData = new ArrayList<>();

		while (rset.next()) {

			Map<String, String> map = new LinkedHashMap<>();
			map.put("id", rset.getObject("id").toString());
			map.put("name", rset.getObject("name").toString());
			map.put("county_code", rset.getObject("country_code").toString());

			listData.add(map);
		}

		System.out.println(listData);
	}

}
