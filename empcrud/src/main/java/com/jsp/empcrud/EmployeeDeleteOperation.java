package com.jsp.empcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDeleteOperation {

	public static void main(String[] args) {

		try {

			// load Driverclass
			Class.forName("org.postgresql.Driver");

			// Established connection
			String url = "jdbc:postgresql://localhost:5432/employee";
			String user = "postgres";
			String password = "root";
			Connection con = DriverManager.getConnection(url, user, password);

			System.out.println("CONNECTION: " + con);

			// create Statement
			Statement st = con.createStatement();

			String sql2 = "DELETE FROM employee WHERE id = 4";

			st.execute(sql2);
			// execute connection

			con.close();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
	}
}
