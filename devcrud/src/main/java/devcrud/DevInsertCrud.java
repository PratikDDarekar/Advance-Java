package devcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DevInsertCrud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("org.postgresql.Driver");

			String url1 = "jdbc:postgresql://localhost:5432/devcrud";
			String username = "postgres";
			String password = "root";

			Connection con = DriverManager.getConnection(url1, username, password);
			Statement st = con.createStatement();

			String query = "INSERT INTO developer VALUES(1, 'pratik', 22, 5000000,'CEO')";
			String query1 = "INSERT INTO developer VALUES(2, 'rutik', 21, 5100000,'mgr')";
			String query2 = "INSERT INTO developer VALUES(3, 'kartik', 27, 4000000,'emp')";
			String query3 = "INSERT INTO developer VALUES(4, 'tilak', 29, 5900000,'emp2')";
			String query4 = "INSERT INTO developer VALUES(5, 'prerna', 24, 5000000,'mgr2')";


			// st.execute(query);
			st.execute(query1);
			st.execute(query2);
			st.execute(query3);
			st.execute(query4);

			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
