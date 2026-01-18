package services;

import entities.Department;

public interface DepartmentDao {
		void addDepartment(Department department);
		Department getDepartment(int id);
}
