package com.hcl.singleton;

public class TestSingleton {

	public static void main(String[] args) {


		SingletonObject obj1 =		SingletonObject.getInstance(); // charan
		
				obj1.printMessage();
		
		SingletonObject obj2 =		SingletonObject.getInstance(); // keerthana
		
				obj2.printMessage();
		
			System.out.println(obj1.equals(obj2));
			
			System.out.println("DBConnection singleton demo");
			
				DBConnection conn1 =	DBConnection.getConnectionInstance();
				DBConnection conn2 =	DBConnection.getConnectionInstance();
				DBConnection conn3 =	DBConnection.getConnectionInstance();
			
				System.out.println(conn1.equals(conn2));
				System.out.println(conn2.equals(conn3));
		

	}

}
