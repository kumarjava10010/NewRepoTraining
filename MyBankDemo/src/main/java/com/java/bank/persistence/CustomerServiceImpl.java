package com.java.bank.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerServiceImpl implements CustomerServicesIfc {

	public Customer getCustomer(int acctNUmber) {

		Customer customerFromDB = new Customer();

		// Conncet to DB
		// "jdbc:mysql://localhost:3306/java_db", "kumarjava", "secret"

		Connection conn = null;
		try {
			 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_db", "kumarjava", "secret");

			// Creating Statement
			//Statement stmt = conn.createStatement();

			//String sql = "select * from CUSTOMER where ACCT_NO = " + acctNUmber;
			
			//Prepared Stmt 
			String sql = "select * from CUSTOMER where ACCT_NO = ?";
			
			PreparedStatement pStmt = conn.prepareStatement(sql);
			
			pStmt.setInt(1, acctNUmber);

			System.out.println(sql);

			ResultSet result = pStmt.executeQuery();
			while (result.next()) {
				customerFromDB.setAcctNo(result.getInt(1));
				customerFromDB.setLastName(result.getString(2));
				customerFromDB.setFirstName(result.getString(3));
				customerFromDB.setSsn(result.getString(4));
			}
			System.out.println("Query Executed");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (conn != null && !conn.isClosed()) {
					conn.close();
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}

		return customerFromDB;
	}

}
