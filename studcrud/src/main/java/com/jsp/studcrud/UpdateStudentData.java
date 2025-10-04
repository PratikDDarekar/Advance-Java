package com.jsp.studcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateStudentData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "jdbc:postgresql://localhost:5432/studentcrud?user=postgres&password=root";
		try {
			Connection con = DriverManager.getConnection(url);

			System.out.println("connection : " + con);

			String query = "UPDATE student SET schoolname = 'Alphosa English High School' where id = 5";

			PreparedStatement st = con.prepareStatement(query);


			st.execute();


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
