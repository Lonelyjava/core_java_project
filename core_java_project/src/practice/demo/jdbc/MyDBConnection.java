package practice.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MyDBConnection {
	
	
	public static Connection getMydbConnection() throws Exception {
		
		Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/libraryAuthor","postgres", "root");
//		con.close();
		return con;
	}

}
