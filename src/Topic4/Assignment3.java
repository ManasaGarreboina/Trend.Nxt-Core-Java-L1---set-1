package Topic4;

import Topic4.bean.Employee;
import Topic4.bean.EmployeeDB;

public class Assignment3 {
	public static void main(String[] args) {
		EmployeeDB empDb = new EmployeeDB();
		
		Employee emp1 = new Employee(11, "A", "a@w3epic.com", 'F', 15000);
		Employee emp2 = new Employee(12, "B", "B@w3epic.com", 'F', 35000);
		Employee emp3 = new Employee(13, "C", "C@w3epic.com", 'M', 25000);
		Employee emp4 = new Employee(14, "D", "D@w3epic.com", 'M', 58000);
		
		empDb.addEmployee(emp1);
		empDb.addEmployee(emp2);
		empDb.addEmployee(emp3);
		empDb.addEmployee(emp4);

		for (Employee emp : empDb.listAll())
			System.out.println(emp.GetEmployeeDetails());
		
		System.out.println();
		empDb.deleteEmployee(12);
		System.out.println("After deletion");
		for (Employee emp : empDb.listAll())
			System.out.println(emp.GetEmployeeDetails());
		
		System.out.println();
		
		System.out.println(empDb.showPaySlip(13));
	}
}
