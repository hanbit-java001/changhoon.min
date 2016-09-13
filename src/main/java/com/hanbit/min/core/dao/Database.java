package com.hanbit.min.core.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Database {

	private static final String CLASS_NAME = "oracle.jdbc.OracleDriver";
	private static final String DB_URI = "jdbc:oracle:thin:@203.236.209.161/xe";
	private static final String DB_ID = "hanbit";
	private static final String DB_PW = "hanbit";

	protected Connection con;
	protected PreparedStatement pstmt;
	protected ResultSet rs;

	public Database(){
		try {
			Class.forName(CLASS_NAME);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	protected Connection makeConnection(){
		try {
			con = DriverManager.getConnection(DB_URI, DB_ID, DB_PW);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}
