package com.hcl.oops;

public class EmployeeDAOImp {

	Employee empList[] = new Employee[3];

	Employee emp1 = new Employee(101, "javeed", "tiger", 9000);
	Employee emp2 = new Employee(102, "tom", "cat", 5000);
	Employee emp3 = new Employee(103, "smith", "lion", 3000);

	Employee[] getAllEmployees() {

		empList[0] = emp1;
		empList[1] = emp2;
		empList[2] = emp3;

		return empList;

	}

}
