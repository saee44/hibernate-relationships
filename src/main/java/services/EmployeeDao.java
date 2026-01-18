package services;

import entities.Employee;

public interface EmployeeDao {
		void addEmployee(Employee employee);
		Employee getEmployee(int id);
		void updateEmployee(int id,String name);
		void deleteEmployee(int id);
}

