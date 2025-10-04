package com.jsp.jdbccrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PersonInsertOperation {

	public static void main(String[] args) {

		try {

			// load Driverclass
			Class.forName("org.postgresql.Driver");

			// Established connection
			String url = "jdbc:postgresql://localhost:5432/personcrud";
			String user = "postgres";
			String password = "root";
			Connection con = DriverManager.getConnection(url, user, password);

			System.out.println("CONNECTION: " + con);

			// create Statement
			Statement st = con.createStatement();

			String sql = "INSERT INTO person VALUES(101, 'Arun', 234)";
			String sql3 = "INSERT INTO person VALUES(103, 'Arunamam', 854)";
			String sql4 = "INSERT INTO person VALUES(104, 'Arjun', 414)";
			String sql5 = "INSERT INTO person VALUES(105, 'Arohi', 300)";


			// execute connection
			// st.execute(sql);
			st.execute(sql3);
			st.execute(sql4);
			st.execute(sql5);

			con.close();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}

	}

}
