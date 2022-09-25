package practice.demo.jdbc;

public class JdbcController {
	
	
	public static void main(String[] args) throws Exception {
		
		Demo d = new Demo();
		d.setId(1);
		d.setName("kundan");
		d.setMobile("8802292341");
		MyServiceImpl m = new MyServiceImpl();
		m.save(d);
	}

}
