package com.hcl.oops;

public class Main {

	EmployeeDAOImp dao = new EmployeeDAOImp();
	  
	
	public static void main(String[] args) {

		
			
				
			Employee[] empList=	dao.getAllEmployees();
			
			// k.b enter ename = "javeed"
		String ename = "javeed";
		
		int eid = 101;
			
			for (Employee employee : empList) {
			
				System.out.println(employee);
				
				if(employee.getEid() == eid) {
					
					
					//System.out.println(employee);
					
				}
				
				
			}
		

	}

}
