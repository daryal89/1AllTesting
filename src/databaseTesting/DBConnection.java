package databaseTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	public static void main(String[] args) throws SQLException {
		String username = "root";
		String password = "root";
		String host = "localhost";
		String port = "3306";
		String url = "jdbc:mysql://" + host + ":" + port + "/demo";

		// 1. Estlabish a connection with database
		Connection con = DriverManager.getConnection(url, username, password);

		// 2. Create a Statement Object
		Statement st = con.createStatement();

		String query = "select * from banking ";

		// Execute ResultSet
		ResultSet rs = st.executeQuery(query);

		while (rs.next()) {
			System.out.println("username: " + rs.getString("username") + "  password:  " + rs.getString("password"));
			// System.out.println(rs.getString("password"));

		}
		// 4. Closing the collection
		// con.close();
		// System.out.println(rs.getString("password")); // connection is closed so we
		// can't retrive this value

	}
}
