 package serviceimpl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entities.Department;
import services.DepartmentDao;
import utilities.HButil;

public class DepartmentDaoImpl implements DepartmentDao{
		public void addDepartment(Department department) {
			Session session=HButil.getSession();
			Transaction tx=session.beginTransaction();
			session.save(department);
			tx.commit();
			session.close();
		}
		public Department getDepartment(int id) {
			Session session=HButil.getSession();
			Transaction tx=session.beginTransaction();
			Department department=session.get(Department.class, id);
			department.getEmployee().size(); //force loading employee
		
			tx.commit();
			session.close();
			return department;
		}
}
