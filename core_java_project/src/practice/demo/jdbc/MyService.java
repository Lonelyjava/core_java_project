package practice.demo.jdbc;

import java.util.List;

public interface MyService {
	
	public void save(Demo demo) throws Exception;
	
	public List<Demo> getRecords() throws Exception;
	
	public void delelebyId(int id) throws Exception;

}
