package com.hrms.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DbUtils {

	private static Connection conn;
	private static Statement st;
	private static ResultSet rSet;
	private static List<Map<String, String>> listData;

	/**
	 * This method create connection to DataBase
	 * 
	 */
	public static void createConnecation() {
		try {
			conn = DriverManager.getConnection(ConfigsReader.getProperty("dbUrl"),
					ConfigsReader.getProperty("dbUserName"), ConfigsReader.getProperty("dbPassword"));
		} catch (Exception e) {
			System.out.println("Connection to DB was not created");
			e.printStackTrace();
		}
	}

	/**
	 * This method will retrieve data and store it inside List<Maps>
	 * 
	 * @param sqlQuary
	 * @return
	 */
	public static List<Map<String, String>> storeDataFromDB(String sqlQuary) {

		try {
			st = conn.createStatement();
			rSet = st.executeQuery(sqlQuary);
			ResultSetMetaData mtData = rSet.getMetaData();
			listData = new ArrayList<Map<String, String>>();

			while (rSet.next()) {
				Map<String, String> rowMap = new LinkedHashMap<>();
				for (int i = 1; i <= mtData.getColumnCount(); i++) {
					rowMap.put(mtData.getColumnName(i), rSet.getObject(i).toString());
				}
				listData.add(rowMap);
			}
			System.out.println(listData);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return listData;
	}

	/**
	 * This Method will close connection to DataBase
	 */
	public static void closeResources() {

		try {
			if (rSet != null) {
				rSet.close();
			}
			if (st != null) {
				st.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
