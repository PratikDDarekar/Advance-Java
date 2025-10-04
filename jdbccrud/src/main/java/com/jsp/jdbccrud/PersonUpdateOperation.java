package com.jsp.jdbccrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PersonUpdateOperation {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost:5432/personcrud";
			String user = "postgres";
			String password = "root";
			Connection con = DriverManager.getConnection(url, user, password);

			Statement st = con.createStatement();

			String query = "UPDATE person SET name = 'ANURATH' WHERE name='Arun'";

			st.execute(query);
			con.close();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
