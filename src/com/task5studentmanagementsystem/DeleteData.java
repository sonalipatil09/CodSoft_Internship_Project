package com.task5studentmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		int id = 4;

		// step 1
		Class.forName("com.mysql.cj.jdbc.Driver");

		// step 2
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management_system", "root",
				"Sonal!@1500");

		// step 3
		String sql = "delete from student where id=4";

		PreparedStatement ps = con.prepareStatement(sql);

		int i = ps.executeUpdate();

		if (i > 0) {
			System.out.println("DATA DELETED");
		}
	}
}
