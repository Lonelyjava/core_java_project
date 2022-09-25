package practice.demo.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class MyServiceImpl implements MyService{

	@Override
	public void save(Demo demo) throws Exception {
		String query ="insert into demo values('"+demo.getId()+"','"+demo.getName()+"','"+demo.getMobile()+"')";
		Connection con =MyDBConnection.getMydbConnection();
		Statement stmt = con.createStatement();
		int i =stmt.executeUpdate(query);
		System.out.println("saved");
	}

}
