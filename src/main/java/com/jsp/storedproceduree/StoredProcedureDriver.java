package com.jsp.storedproceduree;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class StoredProcedureDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url="jdbc:postgresql://localhost:5432/personcrud";
		String user = "postgres";
		String pass="root";
		
		try(Connection con =DriverManager.getConnection(url, user, pass); Scanner sc = new Scanner(System.in);)
		{
			System.out.println(con);
			
			CallableStatement call = con.prepareCall("call emp_account_timesheet(?,?,?,?)");

			System.out.println("Enter the count you want to enter ");
			int count = sc.nextInt();


			for (int i = 0; i < count; i++) {

				System.out.println("Enter id ");
				int id = sc.nextInt();
				sc.nextLine();

				System.out.println("enter name ");
				String name = sc.nextLine();
				// sc.nextLine();

				System.out.println("Enter the salary : ");
				double salary = sc.nextDouble();
				sc.nextLine();
				System.out.println("Enter your designation ");
				String designation = sc.nextLine();


			call.setInt(1, id);
			call.setString(2, name);
			call.setDouble(3, salary);
			call.setString(4, designation);

			call.execute();

			System.out.println("stored Procedure Executed Successfully........ ");

		}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
