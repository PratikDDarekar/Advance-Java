package com.jsp.studcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReadStudentCrud {

	public static void main(String[] args) {

		String url = "jdbc:postgresql://localhost:5432/studentcrud?user=postgres&password=root";
		try {
			Connection con = DriverManager.getConnection(url);

			System.out.println("connection : " + con);

			String query = "SELECT * FROM  student";

			PreparedStatement st = con.prepareStatement(query);

			st.execute();

			ResultSet rs = st.getResultSet();

			// System.out.println(rs);

			while (rs.next()) {

				int id = rs.getInt(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);
				String schoolname = rs.getString(4);
				String address = rs.getString(5);

				System.out.println("id : " + id + " name : " + name + " age " + age + " schoolname : " + schoolname
						+ " address :" + address);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
