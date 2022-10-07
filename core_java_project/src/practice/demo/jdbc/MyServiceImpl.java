package practice.demo.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MyServiceImpl implements MyService {

	@Override
	public void save(Demo demo) throws Exception {
		String query = "insert into demo values('" + demo.getId() + "','" + demo.getName() + "','" + demo.getMobile()
				+ "')";
		Connection con = MyDBConnection.getMydbConnection();
		Statement stmt = con.createStatement();
		int i = stmt.executeUpdate(query);
		System.out.println("saved");
	}

	@Override
	public List<Demo> getRecords() throws Exception {
		List<Demo> demoList = new ArrayList<>();
		String query = "select * from demo";
		Connection con = MyDBConnection.getMydbConnection();
		Statement stmt = con.createStatement();
		ResultSet resultSet = stmt.executeQuery(query);
		System.out.println("All Fetched Records From Demo Table");
		while (resultSet.next()) {
			Demo d = new Demo();
			int id = resultSet.getInt("id");
			String name = resultSet.getString("name");
			String mobile = resultSet.getString("mobile");
			d.setId(id);
			d.setName(name);
			d.setMobile(mobile);
			demoList.add(d);

		}
		return demoList;
	}

	@Override
	public void delelebyId(int id) throws Exception {
		String query = "delete from demo where id = '"+id+"'";
		Connection con = MyDBConnection.getMydbConnection();
		Statement stmt = con.createStatement();
		int resultSet = stmt.executeUpdate(query);
		System.out.println("delete successfully..");
		
	}

}
