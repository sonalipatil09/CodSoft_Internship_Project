package com.task5studentmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DisplayStudent {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// step 1
		Class.forName("com.mysql.cj.jdbc.Driver");

		// step 2
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management_system", "root",
				"Sonal!@1500");

		// step 3
		String sql = "select * from student";

		PreparedStatement ps = con.prepareStatement(sql);

		ResultSet resultSet = ps.executeQuery();

		System.out.println("id\t\trollNo\t\tfname\t\tlname\t\tstd\t\tgrade\t\taddress");

		while (resultSet.next()) {

			int id = resultSet.getInt("id");
			int rollNo = resultSet.getInt("rollNo");
			String fname = resultSet.getString("fname");
			String lname = resultSet.getString("lname");
			String std = resultSet.getString("std");
			String grade = resultSet.getString("grade");
			String address = resultSet.getString("address");

			System.out.println(id + "\t\t" + rollNo + "\t\t" + fname + "\t\t" + lname + "\t\t" + std + "\t\t" + grade
					+ "\t\t" + address);
		}

	}

}
