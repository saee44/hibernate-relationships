package entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;

	@OneToMany(mappedBy = "department")
	List<Employee>emps ;

	public Department( String name) {
		this.id = id;
		this.name = name;
	}

	public Department() {

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

	public void setEmployee(List<Employee>emps) {
		this.emps = emps;
	}

	public List<Employee> getEmployee() {
		return emps;
	}
}
