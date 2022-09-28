package practice.demo.jdbc;

import java.util.List;

public class JdbcController {

	public static void main(String[] args) throws Exception {

		Demo d = new Demo();
		d.setId(2);
		d.setName("kundan");
		d.setMobile("8802292341");
		MyService m = new MyServiceImpl();
//		m.save(d); // save the records 
		List<Demo> dd=m.getRecords(); // get the all records 
		for(Demo d1:dd) {
			System.out.println(d1.getId() +" -"+d1.getName()+"-"+d1.getMobile());
		}
	}

}
