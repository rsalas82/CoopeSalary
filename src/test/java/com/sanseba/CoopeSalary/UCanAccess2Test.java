package com.sanseba.CoopeSalary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UCanAccess2Test {
	
	public static void main(String[] args) {
		String msAccessDBName = "C:\\Users\\Rafael\\Documents\\nominas.mdb";
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			connection = DriverManager.getConnection("jdbc:ucanaccess://" + msAccessDBName + ";memory=true");
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT count(*) FROM TRABAJADORES");
			while (resultSet.next()) {
				System.out.println(resultSet.getString(1));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
