
class Employee{

    eid = 0;
    ename;
    salary;

    constructor(eid,ename,salary){
        this.eid = eid;
        this.ename = ename;
        this.salary = salary;

            console.log("Employee object created...");

    }


       getData(){


            console.log("get method called..");

    }

}

    const emp =    new Employee(101,'King',9000); // creating obj use class name for Construtor call

        emp.getData();
    
    console.log(emp);
    console.log(emp.eid +" "+emp.ename +" "+emp.salary);




