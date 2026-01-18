package hibernate_relationships;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import entities.Department;
import entities.Employee;
import serviceimpl.DepartmentDaoImpl;
import serviceimpl.EmployeeDaoImpl;

public class App {
	public static void main(String[] args) {
//        UserDaoImpl operation=new UserDaoImpl();
//        Profile profile1=new Profile(1,"this is me",null);
//        User user1=new User(1,"saee",profile1);
//        profile1.setUser(user1);
//        operation.addUser(user1);
//        operation.updateUser(1);
//        User user=operation.getUser(1);
//        System.out.println(user.getName());
//        System.out.println(user.getId());
//        System.out.println(user.getProfile().getBio());
//        operation.deleteUser(1);

		EmployeeDaoImpl operation = new EmployeeDaoImpl();
		DepartmentDaoImpl obj = new DepartmentDaoImpl();
//    	List<Employee>emps1=new ArrayList<Employee>();
//    	List<Employee>emps2=new ArrayList<Employee>();
//    	Employee emp1=new Employee("saee",null);
//    	Employee emp2=new Employee("jyoti",null);
//    	Employee emp3=new Employee("sachin",null);
//    	
//    	
//    	Department dept1=new Department("it");
//    	Department dept2=new Department("art");
//    	
//    	emp1.setDepartment(dept1);
//    	emp2.setDepartment(dept2);
//    	emp3.setDepartment(dept1);
//    	emps1.add(emp3);
//    	emps1.add(emp1);
//    	emps2.add(emp2);
//    	dept1.setEmployee(emps1);
//    	dept2.setEmployee(emps2);
//    	
//    	obj.addDepartment(dept2);
//    	obj.addDepartment(dept1);
//    	
//    	operation.addEmployee(emp1);
//    	operation.addEmployee(emp2);
//    	operation.addEmployee(emp3);

//    	Employee emp=operation.getEmployee(1);
//    	System.out.println(emp.getName());
//    	System.out.println(emp.getDepartment().getName());

//    	operation.updateEmployee(1, "shlok");

//    	operation.deleteEmployee(4);

//		Department dept = obj.getDepartment(2);
//		List<Employee> list = dept.getEmployee();
//    	System.out.println(dept.getName());
//		for (Employee emp : list) {
//			if(dept.getId()==emp.getDepartment().getId()) {
//				
//				System.out.println(emp.getName());
//			}
//
//		}
		// these causes lazyinitalizationexception beacuse onetomany is lazy loaded by
		// default so it loads employee only when needed and in the getdept method it
		// gets the dept but thn seesion closes so cant connect to db to load employee
		// in springboot transactional anotation is used
		// here will fix this by .size() in departmentdaoimpl

		System.out.println("done");

	}
}
