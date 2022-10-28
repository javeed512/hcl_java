package variables;

public class Main {

	public static void main(String[] args) {

		Student s1 = new Student(101, "javeed", 2000);

		System.out.println(s1.getSid());
		System.out.println(s1.getSname());
		System.out.println(s1.getFee());

		// Student s2 = new Student(0, "king", 0);

		Student s2 = new Student();

		s2.setSname("king");

		System.out.println(s2.getSid() + " " + s2.getSname() + "  " + s2.getFee());

		Customer c1 = new Customer();

		c1.setCid(111);
		c1.setCname("kavya");

		Customer c2 = new Customer();

		c2.setCid(222);
		c2.setCname("usha");
		
			Customer.setCid(333);
			Customer.setCname("javeed");

		System.out.println(c2.getCid() + " " + c2.getCname());

		System.out.println(c1.getCid() + " " + c1.getCname());

	}

}
