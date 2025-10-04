package devcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class devPreparedStaement {

	public static void main(String[] args) {

		String url = "jdbc:postgresql://localhost:5432/devcrud?user=postgres&password=root";
		try {
			Connection con = DriverManager.getConnection(url);

			System.out.println("connection : " + con);

			String query = "INSERT INTO developer VALUES(?,?,?,?,?)";

			PreparedStatement st = con.prepareStatement(query);

			Scanner sc = new Scanner(System.in);

			System.out.println("How many data you want to enter");
			int count = sc.nextInt();

			for (int i = 0; i < count; i++) {
				System.out.println("enter id");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.println("enter name");
				String name = sc.nextLine();
				System.out.println("enter age");
				int age = sc.nextInt();
				System.out.println("enter salary");
				int salary = sc.nextInt();
				sc.nextLine();
				System.out.println("enter designation");
				String des = sc.nextLine();


				st.setInt(1, id);
				st.setString(2, name);
				st.setInt(3, age);
				st.setInt(4, salary);
				st.setString(5, des);

				st.execute();

				System.out.println(i + "  Data inserted");

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
