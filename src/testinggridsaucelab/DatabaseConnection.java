package testinggridsaucelab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class DatabaseConnection {

	@Test
	public void connection() throws SQLException {
		// which url we are using
		// username
		// password
		String databaserver = "mysql";
		String username = "root";
		String password = "root";
		String port = "3306";
		String host = "localhost";
		String url = "jdbc:" + databaserver + "://" + host + ":" + port + "/demo";

		// 8080, 4444, port:3306

		// 1. creating connection
		Connection con = DriverManager.getConnection(url, username, password);

		// 2. create statement
		Statement st = con.createStatement();

		String query = "select * from banking";

		// 3. Execute Query
		ResultSet rs = st.executeQuery(query);
		while (rs.next()) {
			System.out.println(
					rs.getString("scenario") + " :  " + rs.getString("username") + " :  " + rs.getString("password"));
		}

		// 4. close connection
		con.close();

	}

}
