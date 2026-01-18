package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	
	@ManyToOne
	@JoinColumn(name="dept_id")
	Department department;

	public Employee(String name,Department department) {
		
		this.name = name;
		this.department=department;
	}

	public Employee() {

	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	public void setDepartment(Department department) {
		this.department=department;
	}
	public Department getDepartment() {
		return department;
	}

}
