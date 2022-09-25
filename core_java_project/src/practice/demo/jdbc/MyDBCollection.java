package practice.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MyDBCollection {
	
	
	public static Connection MydbConnection() throws Exception {
		
		Class.forName("");
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/libraryAuthor");
		con.close();
		return con;
	}

}
