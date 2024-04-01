package com.task5studentmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		int id = 7;
		int rollNo = 45;
		String fname = "Tejaswini";
		String lname = "Chalke";
		String std = "B.Tech";
		String grade = "B";
		String address = "Malewadi";

		// step 1
		Class.forName("com.mysql.cj.jdbc.Driver");

		// step 2
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management_system", "root",
				"Sonal!@1500");

		// step 3
		String sql = "insert into student values(?,?,?,?,?,?,?)";

		PreparedStatement ps = con.prepareStatement(sql);

		ps.setInt(1, id);
		ps.setInt(2, rollNo);
		ps.setString(3, fname);
		ps.setString(4, lname);
		ps.setString(5, std);
		ps.setString(6, grade);
		ps.setString(7, address);

		int i = ps.executeUpdate();

		if (i > 0) {
			System.out.println("DATA INSERTED");
		}
	}
}
