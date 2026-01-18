package serviceimpl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entities.Employee;
import services.EmployeeDao;
import utilities.HButil;

public class EmployeeDaoImpl implements EmployeeDao {
	public void addEmployee(Employee employee) {
		Session session = HButil.getSession();
		Transaction tx = session.beginTransaction();
		session.save(employee);
		tx.commit();
		session.close();
	}

	public Employee getEmployee(int id) {
		Session session = HButil.getSession();
		Transaction tx = session.beginTransaction();
		Employee employee = session.get(Employee.class, id);
		tx.commit();
		session.close();
		return employee;
	}

	public void updateEmployee(int id, String name) {
		Session session = HButil.getSession();
		Transaction tx = session.beginTransaction();
		Employee employee = session.get(Employee.class, id);
		if (employee != null) {

			employee.setName(name);
		} else {
			System.out.println("employee not found");
		}
		tx.commit();
		session.close();
	}

	public void deleteEmployee(int id) {
		Session session = HButil.getSession();
		Transaction tx = session.beginTransaction();
		Employee employee = session.get(Employee.class, id);
		if (employee != null) {

			session.delete(employee);
		} else {
			System.out.println("employee not found");
		}
		tx.commit();
		session.close();

	}
}
