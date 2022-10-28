package variables;

public class Customer {

	
	static private  int cid;
	static private String cname;
	
	public Customer() {
		
		
	}

	public static int getCid() {
		return cid;
	}

	public static void setCid(int cid) {
		Customer.cid = cid;
	}

	public static String getCname() {
		return cname;
	}

	public static void setCname(String cname) {
		Customer.cname = cname;
	}
	
	
}
